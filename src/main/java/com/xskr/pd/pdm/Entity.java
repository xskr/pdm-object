package com.xskr.pd.pdm;

import com.xskr.pd.pdm.abs.PdArtifical;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class Entity extends PdArtifical {

    @XmlElement(namespace = "attribute")
    public Long Generated;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(name = "EntityAttribute", namespace = "object")
    public List<EntityAttribute> Attributes;

}
