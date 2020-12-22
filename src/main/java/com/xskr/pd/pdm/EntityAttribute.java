package com.xskr.pd.pdm;

import com.xskr.pd.pdm.abs.PdArtifical;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class EntityAttribute extends PdArtifical {
    @XmlElement(namespace = "attribute")
    public Long Generated;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(name = "DataItem", namespace = "object")
    public List<DataItem> DataItem;
}
