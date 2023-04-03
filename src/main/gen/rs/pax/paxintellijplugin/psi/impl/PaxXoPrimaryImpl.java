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

public class PaxXoPrimaryImpl extends ASTWrapperPsiElement implements PaxXoPrimary {

  public PaxXoPrimaryImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PaxVisitor visitor) {
    visitor.visitXoPrimary(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PaxVisitor) accept((PaxVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PaxExpressionGrouped getExpressionGrouped() {
    return findChildByClass(PaxExpressionGrouped.class);
  }

  @Override
  @Nullable
  public PaxXoFunctionCall getXoFunctionCall() {
    return findChildByClass(PaxXoFunctionCall.class);
  }

  @Override
  @Nullable
  public PaxXoLiteral getXoLiteral() {
    return findChildByClass(PaxXoLiteral.class);
  }

  @Override
  @Nullable
  public PaxXoObject getXoObject() {
    return findChildByClass(PaxXoObject.class);
  }

  @Override
  @Nullable
  public PaxXoRange getXoRange() {
    return findChildByClass(PaxXoRange.class);
  }

  @Override
  @Nullable
  public PaxXoSymbol getXoSymbol() {
    return findChildByClass(PaxXoSymbol.class);
  }

  @Override
  @Nullable
  public PaxXoTuple getXoTuple() {
    return findChildByClass(PaxXoTuple.class);
  }

}
