package com.tlw.pd.pdm;

import com.tlw.pd.pdm.abs.PdArtifical;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class TargetModel extends PdArtifical {
    @XmlElement(namespace = "attribute")
    public String TargetModelURL;
    @XmlElement(namespace = "attribute")
    public String TargetModelID;
    @XmlElement(namespace = "attribute")
    public String TargetModelClassID;
    @XmlElement(namespace = "attribute")
    public String TargetModelLastModificationDate;
    @XmlElement(namespace = "collection")
    public List<Shortcut> SessionShortcuts;
}
