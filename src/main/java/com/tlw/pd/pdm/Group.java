package com.tlw.pd.pdm;

import com.tlw.pd.pdm.abs.PdArtifical;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class Group extends PdArtifical {
    @XmlElementWrapper(namespace = "collection", name = "Group.Users")
    @XmlElement(namespace = "object", name = "User")
    public List<User> users;
}
