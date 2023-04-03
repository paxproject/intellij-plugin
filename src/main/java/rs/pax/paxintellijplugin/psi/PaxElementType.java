package rs.pax.paxintellijplugin.psi;

import rs.pax.paxintellijplugin.PaxLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class PaxElementType extends IElementType {

    public PaxElementType(@NotNull @NonNls String debugName) {
        super(debugName, PaxLanguage.INSTANCE);
    }

}