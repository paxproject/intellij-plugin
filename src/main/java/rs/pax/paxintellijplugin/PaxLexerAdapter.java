package rs.pax.paxintellijplugin;

import com.intellij.lexer.FlexAdapter;

public class PaxLexerAdapter extends FlexAdapter {

    public PaxLexerAdapter() {
        super(new PaxLexer(null));
    }

}
