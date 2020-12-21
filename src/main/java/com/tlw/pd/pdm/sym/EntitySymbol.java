package com.tlw.pd.pdm.sym;

import com.tlw.pd.pdm.Entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class EntitySymbol extends Symbol{
    @XmlAttribute(name = "Id")
    public String Id;
    @XmlAttribute(name = "Ref")
    public String Ref;

    @XmlElement(namespace = "attribute")
    public Long CreationDate;
    @XmlElement(namespace = "attribute")
    public Long ModificationDate;
    @XmlElement(namespace = "attribute")
    public Integer IconMode;
    @XmlElement(namespace = "attribute")
    public String Ract;
    @XmlElement(namespace = "attribute")
    public Integer LineColor;
    @XmlElement(namespace = "attribute")
    public Integer FillColor;
    @XmlElement(namespace = "attribute")
    public Long ShadowColor;
    @XmlElement(namespace = "attribute")
    public String FontList;
    @XmlElement(namespace = "attribute")
    public Long BrushStyle;
    @XmlElement(namespace = "attribute")
    public Long GradientFillMode;
    @XmlElement(namespace = "attribute")
    public Long GradientEndColor;

    @XmlElementWrapper(namespace = "collection")
    @XmlElement(name = "Entity", namespace = "object")
    public List<Entity> Object;
}

