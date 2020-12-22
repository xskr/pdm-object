package com.xskr.pd.pdm.sym;

import com.xskr.pd.pdm.Relationship;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class RelationshipSymbol extends Symbol{
    @XmlAttribute(name = "Id")
    public String Id;

    @XmlElement(namespace = "attribute")
    public Long CreationDate;
    @XmlElement(namespace = "attribute")
    public Long ModificationDate;
    @XmlElement(namespace = "attribute")
    public String Rect;
    @XmlElement(namespace = "attribute")
    public String ListOfPoints;
    @XmlElement(namespace = "attribute")
    public Integer CornerStyle;
    @XmlElement(namespace = "attribute")
    public Integer ArrowStyle;
    @XmlElement(namespace = "attribute")
    public Integer LineColor;
    @XmlElement(namespace = "attribute")
    public Long ShadowColor;
    @XmlElement(namespace = "attribute")
    public String FontList;

    @XmlElementWrapper(namespace = "collection")
    @XmlElement(name = "EntitySymbol", namespace = "object")
    public List<EntitySymbol> SourceSymbol;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(name = "EntitySymbol", namespace = "object")
    public List<EntitySymbol> DestinationSymbol;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(name = "Relationship", namespace = "object")
    public List<Relationship> Object;
}
