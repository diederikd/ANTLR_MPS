package org.campagnelab.ANTLR.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.IterableUtils;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;

public class LexerRuleBlock_Behavior {
  public static void init(SNode thisNode) {
  }
  public static String virtual_toText_5668935624399900127(SNode thisNode) {
    return IterableUtils.join(ListSequence.fromList(SLinkOperations.getChildren(thisNode, MetaAdapterFactory.getContainmentLink(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x175f2668a886ac85L, 0x175f2668a886aca6L, "alternatives"))).select(new ISelector<SNode, String>() {
      public String select(SNode it) {
        return BehaviorReflection.invokeVirtual(String.class, it, "virtual_toText_5668935624399900127", new Object[]{});
      }
    }), "\n");
  }
}