package rs.pax.paxintellijplugin;

import com.intellij.lang.Language;

public class PaxLanguage extends Language {

    public static final PaxLanguage INSTANCE = new PaxLanguage();

    private PaxLanguage() {
        super("Pax");
    }
}
