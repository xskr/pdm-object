package com.tlw.pd.pdm;

import com.tlw.pd.pdm.abs.PdArtifical;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class IndexColumn extends PdArtifical {
    @XmlElementWrapper(namespace = "collector", name = "Column")
    @XmlElement(namespace = "object", name = "Column")
    List<Column> Column;
    @XmlElementWrapper(namespace = "collector", name = "Elements")
    @XmlElement(namespace = "object", name = "Column")
    List<Column> Elements;
}
