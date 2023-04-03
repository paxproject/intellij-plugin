// This is a generated file. Not intended for manual editing.
package rs.pax.paxintellijplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PaxPaxComponentDefinition extends PsiElement {

  @NotNull
  List<PaxEventsBlockDeclaration> getEventsBlockDeclarationList();

  @NotNull
  List<PaxRootTagPair> getRootTagPairList();

  @NotNull
  List<PaxSettingsBlockDeclaration> getSettingsBlockDeclarationList();

}
