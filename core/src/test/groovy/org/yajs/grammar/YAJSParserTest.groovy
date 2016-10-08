package org.yajs.grammar

import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.TokenStream
import org.antlr.v4.runtime.tree.ErrorNode
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.antlr.v4.runtime.tree.TerminalNode
import org.junit.Test;

/**
 * Created by timur on 10/7/16.
 */
public class YAJSParserTest {
    @Test
    public void testSchema(){
        def schema = '''
type User {
    firstName: string,
    lastName: string,
    sex: boolean
}
'''
        YAJSLexer lexer = new YAJSLexer(new ANTLRInputStream(schema));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        YAJSParser parser = new YAJSParser(tokens);
        YAJSParser.SchemaContext context = parser.schema();
        ParseTreeWalker walker = new ParseTreeWalker();
        YAJSListener listener = new YAJSListener() {
            @Override
            void enterSchema(YAJSParser.SchemaContext ctx) {

            }

            @Override
            void exitSchema(YAJSParser.SchemaContext ctx) {

            }

            @Override
            void enterImportStatement(YAJSParser.ImportStatementContext ctx) {

            }

            @Override
            void exitImportStatement(YAJSParser.ImportStatementContext ctx) {

            }

            @Override
            void enterFilename(YAJSParser.FilenameContext ctx) {

            }

            @Override
            void exitFilename(YAJSParser.FilenameContext ctx) {

            }

            @Override
            void enterTypeDeclaration(YAJSParser.TypeDeclarationContext ctx) {

            }

            @Override
            void exitTypeDeclaration(YAJSParser.TypeDeclarationContext ctx) {

            }

            @Override
            void enterType(YAJSParser.TypeContext ctx) {

            }

            @Override
            void exitType(YAJSParser.TypeContext ctx) {

            }

            @Override
            void enterObject(YAJSParser.ObjectContext ctx) {

            }

            @Override
            void exitObject(YAJSParser.ObjectContext ctx) {

            }

            @Override
            void enterPair(YAJSParser.PairContext ctx) {

            }

            @Override
            void exitPair(YAJSParser.PairContext ctx) {

            }

            @Override
            void enterArray(YAJSParser.ArrayContext ctx) {

            }

            @Override
            void exitArray(YAJSParser.ArrayContext ctx) {

            }

            @Override
            void visitTerminal(TerminalNode node) {

            }

            @Override
            void visitErrorNode(ErrorNode node) {

            }

            @Override
            void enterEveryRule(ParserRuleContext ctx) {

            }

            @Override
            void exitEveryRule(ParserRuleContext ctx) {

            }
        };
        walker.walk(listener, context);
    }
}
