package org.campagnelab.antlr.tomps.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBHDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.behaviour.api.BehaviorRegistry;
import jetbrains.mps.smodel.language.ConceptRegistry;
import jetbrains.mps.core.aspects.behaviour.api.SMethod;
import jetbrains.mps.core.aspects.behaviour.SMethodBuilder;
import jetbrains.mps.core.aspects.behaviour.SJavaCompoundTypeImpl;
import jetbrains.mps.core.aspects.behaviour.SModifiersImpl;
import jetbrains.mps.core.aspects.behaviour.AccessPrivileges;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.scope.Scope;
import org.jetbrains.mps.openapi.model.SNode;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.ModuleRepositoryFacade;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.scope.ListScope;
import jetbrains.mps.lang.core.behavior.ScopeProvider__BehaviorDescriptor;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class ConvertToMPS__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea6061b82L, "org.campagnelab.antlr.tomps.structure.ConvertToMPS");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<String> getGeneratedClassName_id14grA09hT8$ = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getGeneratedClassName").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("14grA09hT8$").registry(REGISTRY).build();
  public static final SMethod<String> getFqName_idhEwIO9y = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getFqName").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("hEwIO9y").registry(REGISTRY).build();
  public static final SMethod<Language> getLanguage_id6BpdF0a6pgu = new SMethodBuilder<Language>(new SJavaCompoundTypeImpl(Language.class)).name("getLanguage").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("6BpdF0a6pgu").registry(REGISTRY).build();
  public static final SMethod<Scope> getScope_id3fifI_xCJOQ = new SMethodBuilder<Scope>(new SJavaCompoundTypeImpl(Scope.class)).name("getScope").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("3fifI_xCJOQ").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<SNode>) ((Class) Object.class), ""), SMethodBuilder.createJavaParameter((Class<SNode>) ((Class) Object.class), ""));

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(getGeneratedClassName_id14grA09hT8$, getFqName_idhEwIO9y, getLanguage_id6BpdF0a6pgu, getScope_id3fifI_xCJOQ);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static String getGeneratedClassName_id14grA09hT8$(@NotNull SNode __thisNode__) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getReferenceLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea6061b82L, 0x6a1bb02ea6061be9L, "grammar")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + "_ToMpsVisitor";
  }
  /*package*/ static String getFqName_idhEwIO9y(@NotNull SNode __thisNode__) {
    String name = "Convert_" + SPropertyOperations.getString(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getReferenceLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea6061b82L, 0x6a1bb02ea6061be9L, "grammar")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
    SModel model = SNodeOperations.getModel(__thisNode__);
    if (model == null) {
      return name;
    }

    String longName = jetbrains.mps.util.SNodeOperations.getModelLongName(model);
    if (longName.equals("")) {
      return name;
    }
    return longName + "." + name;
  }
  /*package*/ static Language getLanguage_id6BpdF0a6pgu(@NotNull SNode __thisNode__) {
    Language l = ModuleRepositoryFacade.getInstance().getModule(PersistenceFacade.getInstance().createModuleReference(SPropertyOperations.getString(__thisNode__, MetaAdapterFactory.getProperty(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea6061b82L, 0x69d936b00a14fa05L, "destinationLanguageName"))), Language.class);
    return l;
  }
  /*package*/ static Scope getScope_id3fifI_xCJOQ(@NotNull SNode __thisNode__, SNode kind, SNode child) {
    if (kind == MetaAdapterFactory.getConcept(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979ba0450L, "jetbrains.mps.lang.structure.structure.ConceptDeclaration").getDeclarationNode()) {

      List<SNode> concepts = ListSequence.fromList(new ArrayList<SNode>());
      for (SNode c : ListSequence.fromList(ConvertToMPS__BehaviorDescriptor.getLanguage_id6BpdF0a6pgu.invoke(__thisNode__).getConceptDeclarations())) {
        ListSequence.fromList(concepts).addElement(((SNode) c));
      }
      return ListScope.forNamedElements(concepts);
    }
    return ((Scope) ScopeProvider__BehaviorDescriptor.getScope_id3fifI_xCJOQ.invokeSpecial(__thisNode__, kind, child));
  }

  /*package*/ ConvertToMPS__BehaviorDescriptor() {
    super(REGISTRY);
  }

  @Override
  protected void initNode(@NotNull SNode node, @NotNull SConstructor constructor, @Nullable Object[] parameters) {
    ___init___(node);
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SNode node, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      case 0:
        return (T) ((String) getGeneratedClassName_id14grA09hT8$(node));
      case 1:
        return (T) ((String) getFqName_idhEwIO9y(node));
      case 2:
        return (T) ((Language) getLanguage_id6BpdF0a6pgu(node));
      case 3:
        return (T) ((Scope) getScope_id3fifI_xCJOQ(node, (SNode) parameters[0], (SNode) parameters[1]));
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SAbstractConcept concept, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @NotNull
  @Override
  public List<SMethod<?>> getDeclaredMethods() {
    return BH_METHODS;
  }

  @NotNull
  @Override
  public SAbstractConcept getConcept() {
    return CONCEPT;
  }
}