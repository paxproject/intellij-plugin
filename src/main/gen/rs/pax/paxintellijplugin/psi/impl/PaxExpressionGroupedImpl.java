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

public class PaxExpressionGroupedImpl extends ASTWrapperPsiElement implements PaxExpressionGrouped {

  public PaxExpressionGroupedImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PaxVisitor visitor) {
    visitor.visitExpressionGrouped(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PaxVisitor) accept((PaxVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PaxExpressionBody getExpressionBody() {
    return findNotNullChildByClass(PaxExpressionBody.class);
  }

  @Override
  @Nullable
  public PaxLiteralNumberUnit getLiteralNumberUnit() {
    return findChildByClass(PaxLiteralNumberUnit.class);
  }

}
