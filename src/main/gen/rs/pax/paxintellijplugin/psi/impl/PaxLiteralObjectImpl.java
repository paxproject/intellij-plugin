// This is a generated file. Not intended for manual editing.
package rs.pax.paxintellijplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static rs.pax.paxintellijplugin.psi.PaxTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import rs.pax.paxintellijplugin.psi.*;

public class PaxLiteralObjectImpl extends ASTWrapperPsiElement implements PaxLiteralObject {

  public PaxLiteralObjectImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PaxVisitor visitor) {
    visitor.visitLiteralObject(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PaxVisitor) accept((PaxVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<PaxSettingsKeyValuePair> getSettingsKeyValuePairList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PaxSettingsKeyValuePair.class);
  }

  @Override
  @Nullable
  public PsiElement getPascalidentifier() {
    return findChildByType(PASCALIDENTIFIER);
  }

}
