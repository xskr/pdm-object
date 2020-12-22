package top.xskr.pd.pdm.diagram;

import top.xskr.pd.pdm.abs.PdArtifical;

import javax.xml.bind.annotation.XmlSeeAlso;

@XmlSeeAlso({PhysicalDiagram.class, ConceptualDiagram.class})
public class Diagram extends PdArtifical {

}
