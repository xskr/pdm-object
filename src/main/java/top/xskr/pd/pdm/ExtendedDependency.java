package top.xskr.pd.pdm;

import top.xskr.pd.pdm.abs.PdArtifical;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class ExtendedDependency extends PdArtifical {
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(namespace = "object", name = "Table")
    public List<Table> Object1;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(namespace = "object", name = "Table")
    public List<Table> Object2;
}
