package rs.pax.paxintellijplugin.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import rs.pax.paxintellijplugin.PaxFileType;
import rs.pax.paxintellijplugin.PaxLanguage;
import org.jetbrains.annotations.NotNull;

public class PaxFile extends PsiFileBase {

    public PaxFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, PaxLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return PaxFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Pax File";
    }

}
