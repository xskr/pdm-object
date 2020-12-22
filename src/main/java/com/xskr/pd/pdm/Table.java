package com.xskr.pd.pdm;

import com.xskr.pd.pdm.abs.PdArtifical;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class Table extends PdArtifical {
    @XmlElement(namespace = "attribute")
    public String Comment;
    @XmlElement(namespace = "attribute")
    public String TotalSavingCurrency;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement( namespace = "object", name = "ExtendedCollection")
    public List<ExtendedCollection> ExtendedCollections;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(name = "Column", namespace = "object")
    public List<Column> Columns;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(name = "Key", namespace = "object")
    public List<Key> Keys;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(namespace = "object", name = "Index")
    public List<Index> Indexes;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(namespace = "object", name = "User")
    public List<User> Owner;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(namespace = "object", name = "Key")
    public List<Key> PrimaryKey;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(namespace = "object", name = "Index")
    public List<Index> ClusterObject;
}
