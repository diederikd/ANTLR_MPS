package org.campagnelab.ANTLR.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IterableUtils;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;

public class LexerAlternative_Behavior {
  public static void init(SNode thisNode) {
  }
  public static String virtual_toText_5668935624399900127(SNode thisNode) {
    return ((SNodeOperations.getIndexInParent(thisNode) != 0 ? "\t|\t" : "\t\t")) + IterableUtils.join(ListSequence.fromList(SLinkOperations.getChildren(thisNode, MetaAdapterFactory.getContainmentLink(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x175f2668a8872629L, 0x175f2668a887262aL, "elements"))).select(new ISelector<SNode, String>() {
      public String select(SNode it) {
        return BehaviorReflection.invokeVirtual(String.class, SLinkOperations.getTarget(it, MetaAdapterFactory.getContainmentLink(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe3113b458fL, 0x631eebe3113b4590L, "rhs")), "virtual_toText_5668935624399900127", new Object[]{});
      }
    }), " ") + "\n";
  }
}
