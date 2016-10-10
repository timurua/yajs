package org.yajs.schema.grammar

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.junit.Test
import org.yajs.json.grammar.JSONLexer
import org.yajs.json.grammar.JSONListener
import org.yajs.json.grammar.JSONParser;

/**
 * Created by timur on 10/7/16.
 */
public class JSONParserTest {
    @Test
    public void testJSON(){
        def schema = '''
        {
            "firstName": "John",
            "lastName": "Doe",
            "sex": "M"
        }
        '''
        JSONLexer lexer = new JSONLexer(new ANTLRInputStream(schema));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JSONParser parser = new JSONParser(tokens);
        JSONParser.JsonContext context = parser.json();
        ParseTreeWalker walker = new ParseTreeWalker();
        JSONListener listener = new JSONListener() {
            @Override
            void enterJson(JSONParser.JsonContext ctx) {

            }

            @Override
            void exitJson(JSONParser.JsonContext ctx) {

            }

            @Override
            void enterObject(JSONParser.ObjectContext ctx) {

            }

            @Override
            void exitObject(JSONParser.ObjectContext ctx) {

            }

            @Override
            void enterPair(JSONParser.PairContext ctx) {

            }

            @Override
            void exitPair(JSONParser.PairContext ctx) {

            }

            @Override
            void enterArray(JSONParser.ArrayContext ctx) {

            }

            @Override
            void exitArray(JSONParser.ArrayContext ctx) {

            }

            @Override
            void enterValue(JSONParser.ValueContext ctx) {

            }

            @Override
            void exitValue(JSONParser.ValueContext ctx) {

            }

            @Override
            void visitTerminal(TerminalNode terminalNode) {

            }

            @Override
            void visitErrorNode(ErrorNode errorNode) {

            }

            @Override
            void enterEveryRule(ParserRuleContext parserRuleContext) {

            }

            @Override
            void exitEveryRule(ParserRuleContext parserRuleContext) {

            }
        };
        walker.walk(listener, context);
    }
}
