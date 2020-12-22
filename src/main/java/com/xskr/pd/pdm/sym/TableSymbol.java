package com.xskr.pd.pdm.sym;

import com.xskr.pd.pdm.Table;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class TableSymbol extends Symbol{
    @XmlAttribute(name = "Id")
    public String Id;
    @XmlElement(namespace = "attribute")
    public Long CreationDate;
    @XmlElement(namespace = "attribute")
    public Long ModificationDate;
    @XmlElement(namespace = "attribute")
    public Integer IconMode;
    @XmlElement(namespace = "attribute")
    public String Rect;
    @XmlElement(namespace = "attribute")
    public Integer LineColor;
    @XmlElement(namespace = "attribute")
    public Integer FillColor;
    @XmlElement(namespace = "attribute")
    public Integer ShadowColor;
    @XmlElement(namespace = "attribute")
    public String FontList;
    @XmlElement(namespace = "attribute")
    public Integer BrushStyle;
    @XmlElement(namespace = "attribute")
    public Integer GradientFillMode;
    @XmlElement(namespace = "attribute")
    public Long GradientEndColor;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(name = "Table", namespace = "object")
    public List<Table> Object;
}
