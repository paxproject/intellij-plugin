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

public class PaxAttributeEventIdImpl extends ASTWrapperPsiElement implements PaxAttributeEventId {

  public PaxAttributeEventIdImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PaxVisitor visitor) {
    visitor.visitAttributeEventId(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PaxVisitor) accept((PaxVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

}
