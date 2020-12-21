package com.tlw.pd.pdm;


import com.tlw.pd.pdm.abs.PdItem;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class RootObject extends PdItem {

    @XmlElement(namespace = "attribute")
    public String SessionID;

    @XmlElementWrapper(namespace = "collection")
    @XmlElement(name = "Model", namespace = "object")
    public List<Model> Children;


}
