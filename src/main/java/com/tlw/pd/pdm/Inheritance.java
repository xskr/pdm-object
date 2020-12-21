package com.tlw.pd.pdm;

import com.tlw.pd.pdm.abs.PdArtifical;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class Inheritance extends PdArtifical {
    @XmlElement(namespace = "attribute")
    public Long MutuallyExclusive;
    @XmlElement(namespace = "attribute")
    public Long InheritAll;
    @XmlElement(namespace = "attribute", name = "BaseLogicalInheritance.Complete")
    public Long BaseLogicalInheritance_Complete;

    @XmlElementWrapper(namespace = "collection")
    @XmlElement(name = "Entity", namespace = "object")
    public List<Entity> ParentEntity;
}
