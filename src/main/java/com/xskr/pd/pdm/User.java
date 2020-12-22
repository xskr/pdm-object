package com.xskr.pd.pdm;

import com.xskr.pd.pdm.abs.PdArtifical;

import javax.xml.bind.annotation.XmlElement;

public class User extends PdArtifical {
    @XmlElement(namespace = "attribute")
    public String Stereotype;
}
