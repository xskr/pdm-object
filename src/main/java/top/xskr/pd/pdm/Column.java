package top.xskr.pd.pdm;

import top.xskr.pd.pdm.abs.PdArtifical;

import javax.xml.bind.annotation.XmlElement;

//<a:Name>个人信息标识</a:Name>
//<a:Code>PERSON_ID</a:Code>
//<a:CreationDate>1560942454</a:CreationDate>
//<a:Creator>Administrator</a:Creator>
//<a:ModificationDate>1560942454</a:ModificationDate>
//<a:Modifier>Administrator</a:Modifier>
//<a:Comment>1.2.156.112604.1.1.1786</a:Comment>
//<a:DataType>bigint</a:DataType>
//<a:Column.Mandatory>1</a:Column.Mandatory>
public class Column extends PdArtifical {
    public String Comment;
    @XmlElement(namespace = "attribute")
    public String DataType;
    @XmlElement(name = "Column.Mandatory", namespace = "attribute")
    public String Mandatory;

    @Override
    public String toString() {
        return "Column{" +
                "Comment='" + Comment + '\'' +
                ", DataType='" + DataType + '\'' +
                ", Mandatory='" + Mandatory + '\'' +
                ", Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                ", Code='" + Code + '\'' +
                '}';
    }
}
