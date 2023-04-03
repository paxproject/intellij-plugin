package rs.pax.paxintellijplugin.psi;

import com.intellij.psi.tree.TokenSet;
import rs.pax.paxintellijplugin.psi.PaxTypes;

public interface PaxTokenSets {

    TokenSet IDENTIFIERS = TokenSet.create(PaxTypes.IDENTIFIER);

    TokenSet COMMENTS = TokenSet.create(PaxTypes.COMMENT);
}
