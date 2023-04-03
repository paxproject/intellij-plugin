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

public class PaxSelfClosingTagImpl extends ASTWrapperPsiElement implements PaxSelfClosingTag {

  public PaxSelfClosingTagImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PaxVisitor visitor) {
    visitor.visitSelfClosingTag(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PaxVisitor) accept((PaxVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<PaxAttributeKeyValuePair> getAttributeKeyValuePairList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PaxAttributeKeyValuePair.class);
  }

  @Override
  @NotNull
  public PsiElement getPascalidentifier() {
    return findNotNullChildByType(PASCALIDENTIFIER);
  }

}
