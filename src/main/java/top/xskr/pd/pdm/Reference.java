package top.xskr.pd.pdm;

import top.xskr.pd.pdm.abs.PdArtifical;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class Reference extends PdArtifical {
    @XmlElement(namespace = "attribute")
    public String Cardinality;
    @XmlElement(namespace = "attribute")
    public String ChildRole;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(namespace = "object", name = "Table")
    public List<Table> ParentTable;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(namespace = "object", name = "Table")
    public List<Table> ChildTable;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(namespace = "object", name = "Key")
    public List<Key> ParentKey;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(namespace = "object", name = "ReferenceJoin")
    public List<ReferenceJoin> Joins;

    @Override
    public String toString() {
        return "Reference{" +
                "Cardinality='" + Cardinality + '\'' +
                ", ChildRole='" + ChildRole + '\'' +
                ", Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                ", Code='" + Code + '\'' +
                '}';
    }
}
