package top.xskr.pd.pdm;

import top.xskr.pd.pdm.abs.PdArtifical;

import javax.xml.bind.annotation.XmlElement;

public class User extends PdArtifical {
    @XmlElement(namespace = "attribute")
    public String Stereotype;
}
