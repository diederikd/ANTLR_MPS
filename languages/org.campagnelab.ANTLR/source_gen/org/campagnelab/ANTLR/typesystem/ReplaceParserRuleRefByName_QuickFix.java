package org.campagnelab.ANTLR.typesystem;

/*Generated by MPS */

import jetbrains.mps.errors.QuickFix_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.campagnelab.ANTLR.behavior.HasOptionalParams_Behavior;

public class ReplaceParserRuleRefByName_QuickFix extends QuickFix_Runtime {
  public ReplaceParserRuleRefByName_QuickFix() {
  }
  public String getDescription(SNode node) {
    return "Replace Ref by Name with ParserRuleRef";
  }
  public void execute(SNode node) {
    SNode ruleRef = SConceptOperations.createNewNode(SNodeOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe31132d966L, "org.campagnelab.ANTLR.structure.ParserRuleRef")));
    SLinkOperations.setTarget(ruleRef, MetaAdapterFactory.getReferenceLink(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe31132d966L, 0x631eebe31132d967L, "rule"), ((SNode) ReplaceParserRuleRefByName_QuickFix.this.getField("rule")[0]));
    HasOptionalParams_Behavior.call_setParams_5496686145712410299(ruleRef, ((SNode) ReplaceParserRuleRefByName_QuickFix.this.getField("refByName")[0]));
    SNodeOperations.replaceWithAnother(node, ruleRef);
  }
}
