package rs.pax.paxintellijplugin;

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;


public class PaxColorSettingsPage implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Pascal Identifier", PaxSyntaxHighlighter.PASCAL_IDENTIFIER),
            new AttributesDescriptor("Identifier", PaxSyntaxHighlighter.IDENTIFIER),
            new AttributesDescriptor("Block Declaration", PaxSyntaxHighlighter.BLOCK),
            new AttributesDescriptor("STRING", PaxSyntaxHighlighter.STRING),
            new AttributesDescriptor("Number", PaxSyntaxHighlighter.NUMBER),
            new AttributesDescriptor("Comment", PaxSyntaxHighlighter.COMMENT),
            new AttributesDescriptor("Bad value", PaxSyntaxHighlighter.BAD_CHARACTER)

};

    @Nullable
    @Override
    public Icon getIcon() {
        return PaxIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new PaxSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "<Rectangle fill={Color::rgb(0.25,0.5,0.5)} width=100% height=100% />";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @Override
    public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @Override
    public ColorDescriptor @NotNull [] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Pax";
    }

}