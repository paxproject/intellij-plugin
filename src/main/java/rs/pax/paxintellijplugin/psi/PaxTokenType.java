package rs.pax.paxintellijplugin.psi;

import rs.pax.paxintellijplugin.PaxLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class PaxTokenType extends IElementType {

    public PaxTokenType(@NotNull @NonNls String debugName) {
        super(debugName, PaxLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "PaxTokenType." + super.toString();
    }

}
