package org.campagnelab.ANTLR.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.internal.collections.runtime.IterableUtils;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;

public class Alternatives_Behavior {
  public static void init(SNode thisNode) {
    ListSequence.fromList(SLinkOperations.getChildren(thisNode, MetaAdapterFactory.getContainmentLink(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe31132d842L, 0x631eebe31132d969L, "oneOf"))).addElement(SNodeFactoryOperations.createNewNode(SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe3113b458fL, "org.campagnelab.ANTLR.structure.Alternative")), null));
  }
  public static String virtual_toText_5668935624399900127(SNode thisNode) {
    return IterableUtils.join(ListSequence.fromList(SLinkOperations.getChildren(thisNode, MetaAdapterFactory.getContainmentLink(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe31132d842L, 0x631eebe31132d969L, "oneOf"))).select(new ISelector<SNode, String>() {
      public String select(SNode it) {
        return BehaviorReflection.invokeVirtual(String.class, SLinkOperations.getTarget(it, MetaAdapterFactory.getContainmentLink(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe3113b458fL, 0x631eebe3113b4590L, "rhs")), "virtual_toText_5668935624399900127", new Object[]{});
      }
    }), "\n");
  }
}
