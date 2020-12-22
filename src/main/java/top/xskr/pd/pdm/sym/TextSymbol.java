package top.xskr.pd.pdm.sym;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class TextSymbol extends Symbol{
    @XmlAttribute(name = "Id")
    public String Id;

    @XmlElement(namespace = "attribute")
    public String Text;
    @XmlElement(namespace = "attribute")
    public Long CreationDate;
    @XmlElement(namespace = "attribute")
    public Long ModificationDate;
    @XmlElement(namespace = "attribute")
    public String Ract;
    @XmlElement(namespace = "attribute")
    public Integer TextStyle;
    @XmlElement(namespace = "attribute")
    public Integer LineColor;
    @XmlElement(namespace = "attribute")
    public Integer DashStyle;
    @XmlElement(namespace = "attribute")
    public Integer FillColor;
    @XmlElement(namespace = "attribute")
    public Long ShadowColor;
    @XmlElement(namespace = "attribute")
    public String FontName;
}
