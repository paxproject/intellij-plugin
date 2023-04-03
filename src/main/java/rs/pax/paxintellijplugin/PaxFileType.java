package rs.pax.paxintellijplugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.openapi.util.NlsSafe;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class PaxFileType extends LanguageFileType {

    public static final PaxFileType INSTANCE = new PaxFileType();
    private PaxFileType() {
        super(PaxLanguage.INSTANCE);
    }

    @Override
    public @NonNls @NotNull String getName() {
        return "Pax File";
    }

    @Override
    public @NlsContexts.Label @NotNull String getDescription() {
        return "Pax language file";
    }

    @Override
    public @NlsSafe @NotNull String getDefaultExtension() {
        return "pax";
    }

    @Override
    public Icon getIcon() {
        return PaxIcons.FILE;
    }
}
