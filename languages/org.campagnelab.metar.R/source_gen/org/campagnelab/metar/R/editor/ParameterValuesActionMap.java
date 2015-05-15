package org.campagnelab.metar.R.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.AbstractCellAction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class ParameterValuesActionMap {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new ParameterValuesActionMap.ParameterValuesActionMap_DELETE(node));
    editorCell.setAction(CellActionType.BACKSPACE, new ParameterValuesActionMap.ParameterValuesActionMap_BACKSPACE(node));
  }
  public static class ParameterValuesActionMap_DELETE extends AbstractCellAction {
    /*package*/ SNode myNode;
    public ParameterValuesActionMap_DELETE(SNode node) {
      this.myNode = node;
    }
    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }
    public void execute_internal(EditorContext editorContext, SNode node) {
      {
        final SNode functionCall = SNodeOperations.getParent(node);
        if (SNodeOperations.isInstanceOf(functionCall, MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04b52acL, "org.campagnelab.metar.R.structure.FunctionCallExpr"))) {
          SNodeOperations.deleteNode(functionCall);
          return;
        }
      }
      SNodeOperations.deleteNode(node);
    }
  }
  public static class ParameterValuesActionMap_BACKSPACE extends AbstractCellAction {
    /*package*/ SNode myNode;
    public ParameterValuesActionMap_BACKSPACE(SNode node) {
      this.myNode = node;
    }
    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }
    public void execute_internal(EditorContext editorContext, SNode node) {
      {
        final SNode functionCall = SNodeOperations.getParent(node);
        if (SNodeOperations.isInstanceOf(functionCall, MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04b52acL, "org.campagnelab.metar.R.structure.FunctionCallExpr"))) {
          SNodeOperations.deleteNode(functionCall);
          return;
        }
      }
      SNodeOperations.deleteNode(node);
    }
  }
}