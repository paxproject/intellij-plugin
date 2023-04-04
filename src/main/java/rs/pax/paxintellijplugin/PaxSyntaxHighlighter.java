package rs.pax.paxintellijplugin;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import rs.pax.paxintellijplugin.psi.PaxTypes;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class PaxSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey PASCAL_IDENTIFIER =
            createTextAttributesKey("PAX_PASCAL_IDENTIFIER", DefaultLanguageHighlighterColors.KEYWORD);

    public static final TextAttributesKey IDENTIFIER =
            createTextAttributesKey("PAX_IDENTIFIER", DefaultLanguageHighlighterColors.STATIC_FIELD);

    public static final TextAttributesKey BLOCK =
            createTextAttributesKey("PAX_BLOCK", DefaultLanguageHighlighterColors.METADATA);


    public static final TextAttributesKey STRING =
            createTextAttributesKey("PAX_STRING", DefaultLanguageHighlighterColors.STRING);

    public static final TextAttributesKey NUMBER =
            createTextAttributesKey("PAX_NUMBER", DefaultLanguageHighlighterColors.NUMBER);

    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("PAX_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("PAX_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);



    private static final TextAttributesKey[] PASCAL_IDENTIFIER_KEYS = new TextAttributesKey[]{PASCAL_IDENTIFIER};
    private static final TextAttributesKey[] IDENTIFIER_KEYS = new TextAttributesKey[]{IDENTIFIER};

    private static final TextAttributesKey[] BLOCK_KEYS = new TextAttributesKey[]{BLOCK};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};

    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};


    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new PaxLexerAdapter();
    }
    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(PaxTypes.PASCALIDENTIFIER)) {
            return PASCAL_IDENTIFIER_KEYS;
        }
        if (tokenType.equals(PaxTypes.LOWERIDENTIFIER)) {
            return IDENTIFIER_KEYS;
        }
        if (tokenType.equals(PaxTypes.COMMENT)) {
            return COMMENT_KEYS;
        }
        if (tokenType.equals(PaxTypes.EVENTS) || tokenType.equals(PaxTypes.SETTINGS)){
            return BLOCK_KEYS;
        }
        if (tokenType.equals(PaxTypes.STRINGLIT)) {
            return STRING_KEYS;
        }
        if (tokenType.equals(PaxTypes.ASCIIDIGIT)) {
            return NUMBER_KEYS;
        }
        if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        }
        return EMPTY_KEYS;
    }

}
