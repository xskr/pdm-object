package top.xskr.pd.pdm.abs;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class PdItem {
    @XmlID
    @XmlAttribute(name = "Id")
    public String Id;
    @XmlIDREF
    @XmlAttribute(name = "Ref")
    public PdItem Ref;
    @XmlElement(namespace = "attribute")
    public String ObjectID;
    @XmlElement(namespace = "attribute")
    public String Name;
    @XmlElement(name = "Code", namespace = "attribute")
    public String Code;

    @Override
    public String toString() {
        return "PdItem{" +
                "Id='" + Id + '\'' +
                ", ObjectID='" + ObjectID + '\'' +
                ", Name='" + Name + '\'' +
                ", Code='" + Code + '\'' +
                '}';
    }
}
