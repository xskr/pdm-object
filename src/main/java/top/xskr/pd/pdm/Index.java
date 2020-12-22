package top.xskr.pd.pdm;

import top.xskr.pd.pdm.abs.PdArtifical;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class Index extends PdArtifical {
    @XmlElement(namespace = "attribute")
    Integer Unique;
    @XmlElementWrapper(namespace = "collector")
    @XmlElement(namespace = "object", name = "Key")
    List<Key> LinkedObject;
    @XmlElementWrapper(namespace = "collector")
    @XmlElement(namespace = "object", name = "IndexColumn")
    List<IndexColumn> IndexColumns;
}
