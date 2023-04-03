// This is a generated file. Not intended for manual editing.
package rs.pax.paxintellijplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PaxLiteralValue extends PsiElement {

  @Nullable
  PaxLiteralEnumValue getLiteralEnumValue();

  @Nullable
  PaxLiteralNumber getLiteralNumber();

  @Nullable
  PaxLiteralNumberWithUnit getLiteralNumberWithUnit();

  @Nullable
  PaxLiteralTuple getLiteralTuple();

  @Nullable
  PsiElement getStringlit();

}
