package top.xskr.pd.pdm;

import top.xskr.pd.pdm.abs.PdArtifical;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class Key extends PdArtifical {
    @XmlElementWrapper(namespace = "collection", name = "Key.Columns")
    @XmlElement(name = "Column", namespace = "object")
    public List<Column> Columns;

    @Override
    public String toString() {
        String columnInfos = "";
        if(Columns != null && Columns.size() > 0) {
            for (Column column : Columns) {
                String code = column.Code;
                String name = column.Name;
                columnInfos += code + "(" + name + "), ";
            }
            columnInfos = "[" + columnInfos.substring(0, columnInfos.length() - 3) + "]";
        }
        return "Key{" +
                "Columns=" + columnInfos +
                ", Name='" + Name + '\'' +
                ", Code='" + Code + '\'' +
                '}';
    }
}
