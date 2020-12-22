package top.xskr.pd.pdm.sym;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class PolylineSymbol extends Symbol{
    @XmlAttribute(name = "Id")
    public String Id;

    @XmlElement(namespace = "attribute")
    public Long CreationDate;
    @XmlElement(namespace = "attribute")
    public Long ModificationDate;
    @XmlElement(namespace = "attribute")
    public String rect;
    @XmlElement(namespace = "attribute")
    public String ListOfPoints;
    @XmlElement(namespace = "attribute")
    public String CornerStyle;
    @XmlElement(namespace = "attribute")
    public Integer TextStyle;
    @XmlElement(namespace = "attribute")
    public Integer ArrowStyle;
    @XmlElement(namespace = "attribute")
    public Integer LineStyle;
    @XmlElement(namespace = "attribute")
    public Long ShadowColor;
    @XmlElement(namespace = "attribute")
    public String FontName;


}
