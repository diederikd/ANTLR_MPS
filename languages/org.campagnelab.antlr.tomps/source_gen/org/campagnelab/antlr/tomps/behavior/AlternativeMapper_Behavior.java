package org.campagnelab.antlr.tomps.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;

public class AlternativeMapper_Behavior {
  public static void init(SNode thisNode) {
  }
  public static SNode call_visitorReturnConcept_558881339892896625(SNode thisNode) {
    if (SLinkOperations.getTarget(thisNode, MetaAdapterFactory.getReferenceLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea606232bL, 0x7c18b9e17e92154L, "returns")) != null) {
      return SLinkOperations.getTarget(thisNode, MetaAdapterFactory.getReferenceLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea606232bL, 0x7c18b9e17e92154L, "returns"));
    } else {
      return SLinkOperations.getTarget(AlternativeMapper_Behavior.call_conceptMapper_558881339899329768(thisNode), MetaAdapterFactory.getReferenceLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x69d936b00a0eba02L, 0x69d936b00a0eba03L, "concept"));
    }
  }
  public static SNode call_grammar_558881339892963567(SNode thisNode) {
    return SLinkOperations.getTarget(SNodeOperations.getNodeAncestor(thisNode, MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea6061b82L, "org.campagnelab.antlr.tomps.structure.ConvertToMPS"), false, false), MetaAdapterFactory.getReferenceLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea6061b82L, 0x6a1bb02ea6061be9L, "grammar"));
  }
  public static SNode call_rule_558881339899314132(SNode thisNode) {
    return SNodeOperations.getNodeAncestor(SLinkOperations.getTarget(thisNode, MetaAdapterFactory.getReferenceLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea606232bL, 0x6a1bb02ea6062391L, "alternative")), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x175f2668a88648aaL, "org.campagnelab.ANTLR.structure.Rule"), false, false);
  }
  public static SNode call_converter_558881339892984172(SNode thisNode) {
    return SNodeOperations.getNodeAncestor(thisNode, MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea6061b82L, "org.campagnelab.antlr.tomps.structure.ConvertToMPS"), false, false);
  }
  public static boolean call_hasSubConceptLabeledElement_558881339899231773(SNode thisNode) {
    return (AlternativeMapper_Behavior.call_subConceptPrefix_558881339899304009(thisNode) != null);
  }
  public static String call_subConceptName_558881339899294434(SNode thisNode) {
    String name = AlternativeMapper_Behavior.call_subConceptPrefix_558881339901663656(thisNode);
    return AlternativeMapper_Behavior.call_upperCaseFirstChar_558881339899334546(thisNode, name + SPropertyOperations.getString(SLinkOperations.getTarget(AlternativeMapper_Behavior.call_conceptMapper_558881339899329768(thisNode), MetaAdapterFactory.getReferenceLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x69d936b00a0eba02L, 0x69d936b00a0eba03L, "concept")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));
  }
  public static SNode call_subConceptPrefix_558881339899304009(SNode thisNode) {
    return ListSequence.fromList(SNodeOperations.getNodeDescendants(SLinkOperations.getTarget(thisNode, MetaAdapterFactory.getReferenceLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea606232bL, 0x6a1bb02ea6062391L, "alternative")), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x7c18b9e17b73a85L, "org.campagnelab.ANTLR.structure.LabeledElement"), true, new SAbstractConcept[]{})).findFirst(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return eq_i4n1t_a0a0a0a0a0a0h(SPropertyOperations.getString(it, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")), "subConceptPrefix");
      }
    });
  }
  public static SNode call_conceptMapper_558881339899329768(final SNode thisNode) {
    // chache result for faster queries. 
    if (SLinkOperations.getTarget(thisNode, MetaAdapterFactory.getReferenceLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea606232bL, 0x61426312a570c5d7L, "conceptMapper")) != null) {
      return SLinkOperations.getTarget(thisNode, MetaAdapterFactory.getReferenceLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea606232bL, 0x61426312a570c5d7L, "conceptMapper"));
    }
    SLinkOperations.setTarget(thisNode, MetaAdapterFactory.getReferenceLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea606232bL, 0x61426312a570c5d7L, "conceptMapper"), ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.getNodeAncestor(thisNode, MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea6061b82L, "org.campagnelab.antlr.tomps.structure.ConvertToMPS"), false, false), MetaAdapterFactory.getContainmentLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea6061b82L, 0x69d936b00a0eba08L, "conceptMapper"))).findFirst(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x69d936b00a0eba02L, 0x69d936b00a0eba05L, "rule")) == SNodeOperations.getNodeAncestor(SLinkOperations.getTarget(thisNode, MetaAdapterFactory.getReferenceLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea606232bL, 0x6a1bb02ea6062391L, "alternative")), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x175f2668a88648aaL, "org.campagnelab.ANTLR.structure.Rule"), false, false);
      }
    }));
    return SLinkOperations.getTarget(thisNode, MetaAdapterFactory.getReferenceLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea606232bL, 0x61426312a570c5d7L, "conceptMapper"));
  }
  public static String call_upperCaseFirstChar_558881339899334546(SNode thisNode, String value) {
    return "" + Character.toUpperCase(value.charAt(0)) + value.substring(1, value.length()).toString();
  }
  public static String call_subConceptPrefix_558881339901663656(SNode thisNode) {
    SNode element = SLinkOperations.getTarget(AlternativeMapper_Behavior.call_subConceptPrefix_558881339899304009(thisNode), MetaAdapterFactory.getContainmentLink(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x7c18b9e17b73a85L, 0x7c18b9e17b7c72fL, "element"));
    {
      final SNode l = element;
      if (SNodeOperations.isInstanceOf(l, MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe3113e657fL, "org.campagnelab.ANTLR.structure.StringLiteral"))) {
        return SPropertyOperations.getString(SNodeOperations.cast(element, MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe3113e657fL, "org.campagnelab.ANTLR.structure.StringLiteral")), MetaAdapterFactory.getProperty(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe3113e657fL, 0x631eebe3113e6580L, "literal"));
      }
    }
    {
      final SNode l = element;
      if (SNodeOperations.isInstanceOf(l, MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe31132d966L, "org.campagnelab.ANTLR.structure.ParserRuleRef"))) {
        return SPropertyOperations.getString(SNodeOperations.cast(element, MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe31132d966L, "org.campagnelab.ANTLR.structure.ParserRuleRef")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
      }
    }
    {
      final SNode t = element;
      if (SNodeOperations.isInstanceOf(t, MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x7c18b9e172f3f03L, "org.campagnelab.ANTLR.structure.TokenRef"))) {
        return SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.cast(element, MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x7c18b9e172f3f03L, "org.campagnelab.ANTLR.structure.TokenRef")), MetaAdapterFactory.getReferenceLink(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x7c18b9e172f3f03L, 0x7c18b9e172f3f04L, "token")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
      }
    }
    return "<invalid concept prefix>";

  }
  private static boolean eq_i4n1t_a0a0a0a0a0a0h(Object a, Object b) {
    return (a != null ? a.equals(b) : a == b);
  }
}
