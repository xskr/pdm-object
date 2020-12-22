package com.xskr.pd.pdm.diagram;

import com.xskr.pd.pdm.abs.PdArtifical;

import javax.xml.bind.annotation.XmlSeeAlso;

@XmlSeeAlso({PhysicalDiagram.class, ConceptualDiagram.class})
public class Diagram extends PdArtifical {

}
