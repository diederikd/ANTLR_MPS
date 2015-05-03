package org.campagnelab.antlr.tomps.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {

  /*package*/ final ConceptDescriptor myConceptAlternativeMapper = new ConceptDescriptorBuilder("org.campagnelab.antlr.tomps.structure.AlternativeMapper", MetaIdFactory.conceptId(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea606232bL)).super_("jetbrains.mps.lang.core.structure.BaseConcept").super_(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).parents("jetbrains.mps.lang.core.structure.BaseConcept").parentIds(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).propertyDescriptors(new ConceptDescriptorBuilder.Prop(558881339894394990L, "id"), new ConceptDescriptorBuilder.Prop(558881339894394992L, "fullText")).properties("id", "fullText").referenceDescriptors(new ConceptDescriptorBuilder.Ref(7645898506791953297L, "alternative", MetaIdFactory.conceptId(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe3113b458fL), false), new ConceptDescriptorBuilder.Ref(7008272901878105559L, "conceptMapper", MetaIdFactory.conceptId(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x69d936b00a0eba02L), true), new ConceptDescriptorBuilder.Ref(558881339892900180L, "returns", MetaIdFactory.conceptId(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979ba0450L), true)).references("alternative", "conceptMapper", "returns").childDescriptors(new ConceptDescriptorBuilder.Link(558881339902982151L, "map", MetaIdFactory.conceptId(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x7c18b9e1882f81cL), true, true, false)).children(new String[]{"map"}, new boolean[]{true}).create();
  /*package*/ final ConceptDescriptor myConceptChildDestination = new ConceptDescriptorBuilder("org.campagnelab.antlr.tomps.structure.ChildDestination", MetaIdFactory.conceptId(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x4aaf5f3861bb9099L)).super_("org.campagnelab.antlr.tomps.structure.Destination").super_(MetaIdFactory.conceptId(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x4aaf5f3861bb9098L)).parents("org.campagnelab.antlr.tomps.structure.Destination").parentIds(MetaIdFactory.conceptId(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x4aaf5f3861bb9098L)).referenceDescriptors(new ConceptDescriptorBuilder.Ref(5381624775493523154L, "to", MetaIdFactory.conceptId(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086aL), false)).references("to").create();
  /*package*/ final ConceptDescriptor myConceptConceptMapper = new ConceptDescriptorBuilder("org.campagnelab.antlr.tomps.structure.ConceptMapper", MetaIdFactory.conceptId(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x69d936b00a0eba02L)).super_("jetbrains.mps.lang.core.structure.BaseConcept").super_(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).parents("jetbrains.mps.lang.core.structure.BaseConcept").parentIds(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).referenceDescriptors(new ConceptDescriptorBuilder.Ref(7627187573639526917L, "rule", MetaIdFactory.conceptId(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x175f2668a88648aaL), false), new ConceptDescriptorBuilder.Ref(7627187573639526915L, "concept", MetaIdFactory.conceptId(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979ba0450L), true)).references("rule", "concept").create();
  /*package*/ final ConceptDescriptor myConceptConvertToMPS = new ConceptDescriptorBuilder("org.campagnelab.antlr.tomps.structure.ConvertToMPS", MetaIdFactory.conceptId(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea6061b82L)).super_("jetbrains.mps.lang.core.structure.BaseConcept").super_(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.lang.core.structure.ScopeProvider").parentIds(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL), MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L), MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x33d23ee961a0cbf3L)).propertyDescriptors(new ConceptDescriptorBuilder.Prop(7627187573639936517L, "destinationLanguageName")).properties("destinationLanguageName").referenceDescriptors(new ConceptDescriptorBuilder.Ref(7645898506791951337L, "grammar", MetaIdFactory.conceptId(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe3113222a9L), false)).references("grammar").childDescriptors(new ConceptDescriptorBuilder.Link(7645898506791953299L, "altMappers", MetaIdFactory.conceptId(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea606232bL), false, true, false), new ConceptDescriptorBuilder.Link(7627187573639526920L, "conceptMapper", MetaIdFactory.conceptId(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x69d936b00a0eba02L), true, true, false)).children(new String[]{"altMappers", "conceptMapper"}, new boolean[]{true, true}).create();
  /*package*/ final ConceptDescriptor myConceptDestination = new ConceptDescriptorBuilder("org.campagnelab.antlr.tomps.structure.Destination", MetaIdFactory.conceptId(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x4aaf5f3861bb9098L)).super_("jetbrains.mps.lang.core.structure.BaseConcept").super_(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).parents("jetbrains.mps.lang.core.structure.BaseConcept").parentIds(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).abstract_().create();
  /*package*/ final ConceptDescriptor myConceptExampleConcept = new ConceptDescriptorBuilder("org.campagnelab.antlr.tomps.structure.ExampleConcept", MetaIdFactory.conceptId(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x4aaf5f3861a15c43L)).super_("jetbrains.mps.lang.core.structure.BaseConcept").super_(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).parents("jetbrains.mps.lang.core.structure.BaseConcept").parentIds(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).propertyDescriptors(new ConceptDescriptorBuilder.Prop(5381624775491804253L, "aStringProperty")).properties("aStringProperty").childDescriptors(new ConceptDescriptorBuilder.Link(5381624775491804251L, "aChild", MetaIdFactory.conceptId(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x4aaf5f3861a15c43L), true, false, false)).children(new String[]{"aChild"}, new boolean[]{false}).create();
  /*package*/ final ConceptDescriptor myConceptLabeledElementSource = new ConceptDescriptorBuilder("org.campagnelab.antlr.tomps.structure.LabeledElementSource", MetaIdFactory.conceptId(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x4aaf5f3861adfe77L)).super_("org.campagnelab.antlr.tomps.structure.Source").super_(MetaIdFactory.conceptId(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x3875e55a78eeb7ddL)).parents("org.campagnelab.antlr.tomps.structure.Source").parentIds(MetaIdFactory.conceptId(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x3875e55a78eeb7ddL)).referenceDescriptors(new ConceptDescriptorBuilder.Ref(5381624775492632953L, "labeled", MetaIdFactory.conceptId(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x7c18b9e17b73a85L), false)).references("labeled").create();
  /*package*/ final ConceptDescriptor myConceptMapper = new ConceptDescriptorBuilder("org.campagnelab.antlr.tomps.structure.Mapper", MetaIdFactory.conceptId(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x7c18b9e1882f81cL)).super_("jetbrains.mps.lang.core.structure.BaseConcept").super_(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).parents("jetbrains.mps.lang.core.structure.BaseConcept").parentIds(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).childDescriptors(new ConceptDescriptorBuilder.Link(4068410015138958301L, "source", MetaIdFactory.conceptId(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x3875e55a78eeb7ddL), false, false, false), new ConceptDescriptorBuilder.Link(5381624775493521528L, "destination", MetaIdFactory.conceptId(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x4aaf5f3861bb9098L), false, false, false)).children(new String[]{"source", "destination"}, new boolean[]{false, false}).create();
  /*package*/ final ConceptDescriptor myConceptParserRuleSource = new ConceptDescriptorBuilder("org.campagnelab.antlr.tomps.structure.ParserRuleSource", MetaIdFactory.conceptId(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x3875e55a78eeb7feL)).super_("org.campagnelab.antlr.tomps.structure.Source").super_(MetaIdFactory.conceptId(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x3875e55a78eeb7ddL)).parents("org.campagnelab.antlr.tomps.structure.Source").parentIds(MetaIdFactory.conceptId(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x3875e55a78eeb7ddL)).referenceDescriptors(new ConceptDescriptorBuilder.Ref(4068410015137840985L, "rule", MetaIdFactory.conceptId(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe31132d966L), false)).references("rule").create();
  /*package*/ final ConceptDescriptor myConceptPropertyDestination = new ConceptDescriptorBuilder("org.campagnelab.antlr.tomps.structure.PropertyDestination", MetaIdFactory.conceptId(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x27b12e38d7577b90L)).super_("org.campagnelab.antlr.tomps.structure.Destination").super_(MetaIdFactory.conceptId(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x4aaf5f3861bb9098L)).parents("org.campagnelab.antlr.tomps.structure.Destination").parentIds(MetaIdFactory.conceptId(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x4aaf5f3861bb9098L)).referenceDescriptors(new ConceptDescriptorBuilder.Ref(2860118060022856593L, "to", MetaIdFactory.conceptId(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086bL), false)).references("to").create();
  /*package*/ final ConceptDescriptor myConceptSource = new ConceptDescriptorBuilder("org.campagnelab.antlr.tomps.structure.Source", MetaIdFactory.conceptId(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x3875e55a78eeb7ddL)).super_("jetbrains.mps.lang.core.structure.BaseConcept").super_(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).parents("jetbrains.mps.lang.core.structure.BaseConcept").parentIds(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).abstract_().create();

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptAlternativeMapper, myConceptChildDestination, myConceptConceptMapper, myConceptConvertToMPS, myConceptDestination, myConceptExampleConcept, myConceptLabeledElementSource, myConceptMapper, myConceptParserRuleSource, myConceptPropertyDestination, myConceptSource);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0p, conceptFqName)) {
      case 0:
        return myConceptAlternativeMapper;
      case 1:
        return myConceptChildDestination;
      case 2:
        return myConceptConceptMapper;
      case 3:
        return myConceptConvertToMPS;
      case 4:
        return myConceptDestination;
      case 5:
        return myConceptExampleConcept;
      case 6:
        return myConceptLabeledElementSource;
      case 7:
        return myConceptMapper;
      case 8:
        return myConceptParserRuleSource;
      case 9:
        return myConceptPropertyDestination;
      case 10:
        return myConceptSource;
      default:
        return null;
    }
  }
  private static String[] stringSwitchCases_1htk8d_a0a0p = new String[]{"org.campagnelab.antlr.tomps.structure.AlternativeMapper", "org.campagnelab.antlr.tomps.structure.ChildDestination", "org.campagnelab.antlr.tomps.structure.ConceptMapper", "org.campagnelab.antlr.tomps.structure.ConvertToMPS", "org.campagnelab.antlr.tomps.structure.Destination", "org.campagnelab.antlr.tomps.structure.ExampleConcept", "org.campagnelab.antlr.tomps.structure.LabeledElementSource", "org.campagnelab.antlr.tomps.structure.Mapper", "org.campagnelab.antlr.tomps.structure.ParserRuleSource", "org.campagnelab.antlr.tomps.structure.PropertyDestination", "org.campagnelab.antlr.tomps.structure.Source"};
}
