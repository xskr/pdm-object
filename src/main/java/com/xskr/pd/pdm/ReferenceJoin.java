package com.xskr.pd.pdm;

import com.xskr.pd.pdm.abs.PdArtifical;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class ReferenceJoin extends PdArtifical {
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(namespace = "object", name = "Column")
    public List<Column> Object1;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(namespace = "object", name = "Column")
    public List<Column> Object2;
}
