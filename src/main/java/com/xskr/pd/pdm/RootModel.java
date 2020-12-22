package com.xskr.pd.pdm;

import com.xskr.pd.pdm.abs.PdItem;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;
import java.util.Map;

@XmlRootElement(name = "Model")
public class RootModel {

    transient Map<String, PdItem> pool = new HashMap();

    @XmlElement(namespace = "object")
    public RootObject RootObject;

    public Map<String, PdItem> getPool(){
        return pool;
    }

}
