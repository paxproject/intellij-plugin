// This is a generated file. Not intended for manual editing.
package rs.pax.paxintellijplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PaxExpressionBody extends PsiElement {

  @NotNull
  List<PaxXoInfix> getXoInfixList();

  @NotNull
  List<PaxXoPrefix> getXoPrefixList();

  @NotNull
  List<PaxXoPrimary> getXoPrimaryList();

}
