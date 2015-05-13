package org.campagnelab.metar.R.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.AbstractCellAction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class ParameterValueActionMap {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new ParameterValueActionMap.ParameterValueActionMap_DELETE(node));
    editorCell.setAction(CellActionType.BACKSPACE, new ParameterValueActionMap.ParameterValueActionMap_BACKSPACE(node));
  }
  public static class ParameterValueActionMap_DELETE extends AbstractCellAction {
    /*package*/ SNode myNode;
    public ParameterValueActionMap_DELETE(SNode node) {
      this.myNode = node;
    }
    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }
    public void execute_internal(EditorContext editorContext, SNode node) {
      if (SNodeOperations.getConcept(SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x501583ef40d93683L, 0x501583ef40d93794L, "value"))).isAbstract()) {
        SNodeOperations.deleteNode(node);
        return;
      }
      if ((SNodeOperations.getNodeAncestor(node, MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x44763ca97f6dfe14L, "org.campagnelab.metar.R.structure.ParameterValueWithId"), true, false) != null)) {
        // only replace the value with an empty expression, keep the id: 
        SNodeOperations.replaceWithNewChild(node, "org.campagnelab.metar.R.structure.Expr");
        return;
      }
      SNodeOperations.replaceWithNewChild(SNodeOperations.getNodeAncestor(node, MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x501583ef40d93683L, "org.campagnelab.metar.R.structure.Value"), true, false), "org.campagnelab.metar.R.structure.PositionalParameterValue");
    }
  }
  public static class ParameterValueActionMap_BACKSPACE extends AbstractCellAction {
    /*package*/ SNode myNode;
    public ParameterValueActionMap_BACKSPACE(SNode node) {
      this.myNode = node;
    }
    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }
    public void execute_internal(EditorContext editorContext, SNode node) {
      if (SNodeOperations.getConcept(SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x501583ef40d93683L, 0x501583ef40d93794L, "value"))).isAbstract()) {
        SNodeOperations.deleteNode(node);
        return;
      }
      if ((SNodeOperations.getNodeAncestor(node, MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x44763ca97f6dfe14L, "org.campagnelab.metar.R.structure.ParameterValueWithId"), true, false) != null)) {
        // only replace the value with an empty expression, keep the id: 
        SNodeOperations.replaceWithNewChild(node, "org.campagnelab.metar.R.structure.Expr");
        return;
      }
      SNodeOperations.replaceWithNewChild(SNodeOperations.getNodeAncestor(node, MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x501583ef40d93683L, "org.campagnelab.metar.R.structure.Value"), true, false), "org.campagnelab.metar.R.structure.PositionalParameterValue");
    }
  }
}
