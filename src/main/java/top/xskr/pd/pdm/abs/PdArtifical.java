package top.xskr.pd.pdm.abs;

import javax.xml.bind.annotation.XmlElement;

public class PdArtifical extends PdItem{
    @XmlElement(name = "CreationDate", namespace = "attribute")
    public Long CreationDate;
    @XmlElement(namespace = "attribute")
    public String Creator;
    @XmlElement(namespace = "attribute")
    public Long ModificationDate;
    @XmlElement(namespace = "attribute")
    public String Modifier;
    @XmlElement(namespace = "attribute")
    public String History;
}
