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

public class PaxXoObjectImpl extends ASTWrapperPsiElement implements PaxXoObject {

  public PaxXoObjectImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PaxVisitor visitor) {
    visitor.visitXoObject(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PaxVisitor) accept((PaxVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PaxIdentifier getIdentifier() {
    return findChildByClass(PaxIdentifier.class);
  }

  @Override
  @NotNull
  public List<PaxXoObjectSettingsKeyValuePair> getXoObjectSettingsKeyValuePairList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PaxXoObjectSettingsKeyValuePair.class);
  }

}
