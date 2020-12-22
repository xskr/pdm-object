package top.xskr.pd.pdm;

import top.xskr.pd.pdm.abs.PdArtifical;

import javax.xml.bind.annotation.XmlElement;

public class ExtendedCollection extends PdArtifical {
    @XmlElement(namespace = "attribute", name = "ExtendedBaseCollection.CollectionName")
    public String ExtendedBaseCollection_CollectionName;
}
