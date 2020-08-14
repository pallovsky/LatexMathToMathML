import gen.LatexParser;
import gen.LatexParserBaseListener;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Listener extends LatexParserBaseListener {
    private String html = "";

    public String getHtml() {
        return html;
    }

    private void append(String s){
        html = html + s;
    }

    @Override
    public void enterPrule(LatexParser.PruleContext ctx){
        html = html + "<!DOCTYPE html>\n<html>\n";
    }

    @Override
    public void exitPrule(LatexParser.PruleContext ctx){
        html = html + "</html>";
    }

    @Override
    public void enterData(LatexParser.DataContext ctx){ html = html + "<head>\n"; }

    @Override
    public void enterTitle(LatexParser.TitleContext ctx){
        html = html + "<title> ";
        StringBuilder title = new StringBuilder();
        int childCount = ctx.getChildCount();

        for(int i = 2; i<childCount-1; i++){
            title.append(ctx.getChild(i).getText()).append(" ");
        }

        html = html + title.toString() + " </title>\n";
    }

    @Override
    public void enterAuthor(LatexParser.AuthorContext ctx){
        html = html + "<meta name=\"author\" content=\"";
        StringBuilder title = new StringBuilder();
        int childCount = ctx.getChildCount();

        for(int i = 2; i<childCount-1; i++){
            title.append(ctx.getChild(i).getText()).append(" ");
        }

        html = html + title.toString() + "\">\n";
    }

    @Override
    public void enterDate(LatexParser.DateContext ctx){
        html = html + "<meta name=\"search_date\" content=\"";
        StringBuilder title = new StringBuilder();
        int childCount = ctx.getChildCount();

        for(int i = 2; i<childCount-1; i++){
            title.append(ctx.getChild(i).getText()).append(" ");
        }

        html = html + title.toString() + "\">\n";
    }

    @Override
    public void exitData(LatexParser.DataContext ctx){ html = html + "</head>\n\n"; }

    @Override
    public void enterDocument(LatexParser.DocumentContext ctx){ html = html + "<body>\n";}

    @Override
    public void exitDocument(LatexParser.DocumentContext ctx){ html = html + "</body>\n\n";}

    @Override
    public void enterSection(LatexParser.SectionContext ctx){
        html = html + "<section>\n<h1> ";
        StringBuilder title = new StringBuilder();
        for(int i = 2; i<ctx.getChildCount(); i++){
            if(ctx.getChild(i).getText().equals("}")){break;}
            title.append(ctx.getChild(i).getText()).append(" ");
        }
        html = html + title.toString() + "</h1>\n<p>\n";
    }

    @Override
    public void exitSection(LatexParser.SectionContext ctx){ html = html + "</p>\n</section>\n\n"; }

    @Override
    public void enterText(LatexParser.TextContext ctx) {
        if(!ctx.getChild(0).getClass().toString().equals("class gen.LatexParser$Math_formulaContext")){
            StringBuilder text = new StringBuilder();
            for (int i = 0; i<ctx.getChildCount(); i++){
                text.append(ctx.getChild(i).getText()).append(" ");
            }
            html = html + text + "\n";
    }
    }

    @Override
    public void enterEquation(LatexParser.EquationContext ctx){
        html = html + "<math>\n" + "<mstyle display=\"block\">\n";
    }

    @Override
    public void exitEquation(LatexParser.EquationContext ctx){ html = html + "</mstyle>\n</math>\n<br/>\n"; }

    @Override
    public void enterMath_formula(LatexParser.Math_formulaContext ctx){
        boolean v1 = ctx.getParent().getClass().toString().equals("class gen.LatexParser$EquationContext");
        boolean v2 = ctx.getParent().getClass().toString().equals("class gen.LatexParser$FractionContext");

        if(v1 || v2) {
            append("<mrow>\n");
        }
    }

    @Override
    public void exitMath_formula(LatexParser.Math_formulaContext ctx){
        boolean v1 = ctx.getParent().getClass().toString().equals("class gen.LatexParser$EquationContext");
        boolean v2 = ctx.getParent().getClass().toString().equals("class gen.LatexParser$FractionContext");

        if(v1 || v2) {
            append("</mrow>\n");
        }
    }

    @Override
    public void enterSimple_symbols(LatexParser.Simple_symbolsContext ctx) {
        String symbol = ctx.getText();
        boolean isSet = false;

        if(symbol.equals("(")){html = html + "<mfenced open=\"(\" close=\")\">\n"; isSet=true;}
        if(symbol.equals(")")){html = html + "</mfenced>\n"; isSet=true;}

        if(symbol.equals("{")){html = html + "<mfenced open=\"{\" close=\"}\">\n"; isSet=true;}
        if(symbol.equals("}")){html = html + "</mfenced>\n"; isSet=true;}

        if(symbol.equals("[")){html = html + "<mfenced open=\"[\" close=\"]\">\n"; isSet=true;}
        if(symbol.equals("]")){html = html + "</mfenced>\n"; isSet=true;}

        if(symbol.equals("&")){isSet=true;}

        if(symbol.equals("&=")){
            isSet=true;
            append("<mo>=</mo>\n");
        }

        if(!isSet){
            html = html + "<mo>" + ctx.getText() + "</mo>\n";
        }


    }

    @Override
    public void visitTerminal(TerminalNode t){

        if(t.getParent().getClass().toString().equals("class gen.LatexParser$Math_formulaContext")) {
            int htmlLenght = html.length();
            boolean isPower = false;
            if(html.charAt(htmlLenght-7) == ('^')){
                isPower = true;
                html = html.replace("<mo>^</mo>", "");
                int index = html.length()-12;
                String newHtml = new String();
                for(int i=0; i<html.length(); i++){
                    if(i==index){newHtml += "<msup>\n";}
                    newHtml += html.charAt(i);
                }
                html = newHtml;
            }
            if ((t.getSymbol().getType() == 43 || t.getSymbol().getType() == 44)) {
                html = html + "<mi>" + t.getText() + "</mi>\n";
            }
            if (t.getSymbol().getType() == 45) {
                html = html + "<mn>" + t.getText() + "</mn>\n";
            }
            if(isPower){
                append("</msup>\n");
            }
        }

    }

    @Override
    public void enterMatrix(LatexParser.MatrixContext ctx){
        append("<math>\n<mrow>\n<mo>[</mo>\n<mtable>\n");
    }

    @Override
    public void exitMatrix(LatexParser.MatrixContext ctx){
        append("</mtable>\n<mo>]</mo>\n</mrow>\n</math>\n");
    }

    @Override
    public void enterMatrix_formula(LatexParser.Matrix_formulaContext ctx){
        append("<mtr>\n");
        for (int i=0; i<ctx.getChildCount(); i++){
            if(!ctx.getChild(i).getText().equals("&")){
                if(ctx.getChild(i).getText().equals("\\\\")){
                    append("</mtr>\n<mtr>\n");
                }
                else {
                    append("<mtd><mn>" + ctx.getChild(i).getText() + "</mn></mtd>\n");
                }
            }
        }
        append("</mtr>\n");
    }

    @Override
    public void enterFraction(LatexParser.FractionContext ctx){
        append("<math xmlns='http://www.w3.org/1998/Math/MathML' display='block'>\n<mfrac>\n");
    }

    @Override
    public void exitFraction(LatexParser.FractionContext ctx){
        append("</mfrac>\n</math>\n");
    }

    @Override
    public void enterSqrt(LatexParser.SqrtContext ctx){
        append("<math>\n<msqrt>\n");
    }

    @Override
    public void exitSqrt(LatexParser.SqrtContext ctx){
        append("</msqrt>\n</math>\n");
    }

    @Override
    public void enterGreek_letters(LatexParser.Greek_lettersContext ctx){
        append("<mi>&" + ctx.getText().replace("\\", "") + ";</mi>\n");
    }

    @Override
    public void enterInline(LatexParser.InlineContext ctx){
        append("<math>\n" + "<mstyle display=\"inline\">\n");
    }

    @Override
    public void exitInline(LatexParser.InlineContext ctx){
        append("</math>\n" + "</mstyle>\n");
    }

    @Override
    public void enterIntegral(LatexParser.IntegralContext ctx){
        append("<mrow>\n<munderover>\n<mo> &#x222B;</mo>\n<mn>" + ctx.getChild(2).getText());
        append("</mn>\n<mn>" + ctx.getChild(4).getText() + "</mn>\n</munderover></mrow>");
    }

    @Override
    public void enterDisplaymath(LatexParser.DisplaymathContext ctx){
        append("<math>\n");
    }

    @Override
    public void exitDisplaymath(LatexParser.DisplaymathContext ctx){
        append("</math>\n");
    }

    @Override
    public void enterMultline(LatexParser.MultlineContext ctx){
        append("<math>\n");
    }

    @Override
    public void exitMultline(LatexParser.MultlineContext ctx){
        append("</math>\n");
    }

    @Override
    public void enterAlign(LatexParser.AlignContext ctx){
        append("<math>\n");
    }

    @Override
    public void exitAlign(LatexParser.AlignContext ctx){
        append("</math>\n");
    }
}

