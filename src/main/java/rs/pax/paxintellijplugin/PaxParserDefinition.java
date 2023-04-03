package rs.pax.paxintellijplugin;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;
import rs.pax.paxintellijplugin.psi.PaxFile;
import rs.pax.paxintellijplugin.psi.PaxTokenSets;
import rs.pax.paxintellijplugin.parser.PaxParser;
import rs.pax.paxintellijplugin.psi.PaxTypes;

public class PaxParserDefinition implements ParserDefinition {

    public static final IFileElementType FILE = new IFileElementType(PaxLanguage.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new PaxLexerAdapter();
    }

    @Override
    public @NotNull TokenSet getCommentTokens() {
        return PaxTokenSets.COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public PsiParser createParser(final Project project) {
        return new PaxParser();
    }

    @NotNull
    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new PaxFile(viewProvider);
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return PaxTypes.Factory.createElement(node);
    }

}

