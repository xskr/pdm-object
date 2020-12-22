package com.xskr.pd.pdm;

import com.xskr.pd.pdm.abs.PdArtifical;
import com.xskr.pd.pdm.diagram.ConceptualDiagram;
import com.xskr.pd.pdm.diagram.Diagram;
import com.xskr.pd.pdm.diagram.PhysicalDiagram;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.eclipse.persistence.oxm.annotations.XmlPaths;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import java.util.List;

public class Model extends PdArtifical {
    @XmlElement(namespace = "attribute")
    public String PackageOptionsText;
    @XmlElement(namespace = "attribute")
    public String ModelOptionsText;
    @XmlElement(namespace = "attribute")
    public String RepositoryInformation;
    @XmlElement(namespace = "attribute")
    public String RepositoryFilename;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(namespace = "object", name = "Shortcut")
    public List<Shortcut> GenerationOrigins;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(name = "Shortcut", namespace = "object")
    public List<Shortcut> GeneratedModels;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(name = "Shortcut", namespace = "object")
    public List<Shortcut> DBMS;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(name = "ConceptualDiagram", namespace = "object")
    public List<ConceptualDiagram> ConceptualDiagrams;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(name = "PhysicalDiagram", namespace = "object")
    public List<PhysicalDiagram> PhysicalDiagrams;
    @XmlElementWrapper(namespace = "collection")
    @XmlElements({
            @XmlElement(name = "PhysicalDiagram", namespace = "object", type = PhysicalDiagram.class),
            @XmlElement(name = "ConceptualDiagram", namespace = "object", type = ConceptualDiagram.class),
    })
    @XmlPaths({
            @XmlPath("DefaultDiagram/PhysicalDiagram"),
            @XmlPath("DefaultDiagram/ConceptualDiagram"),
    })
    public List<Diagram> DefaultDiagram;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(namespace = "object", name = "User")
    public List<User> Users;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(name = "PhysicalDomain", namespace = "object")
    public List<PhysicalDomain> Domains;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(name = "Entity", namespace = "object")
    public List<Entity> Entities;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(name = "Relationship", namespace = "object")
    public List<Relationship> Relationships;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(name = "Inheritance", namespace = "object")
    public List<Inheritance> Inheritances;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(name = "DataItem", namespace = "object")
    public List<DataItem> DataItems;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(name = "InheritanceLink", namespace = "object")
    public List<InheritanceLink> InheritanceLinks;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(name = "Table", namespace = "object")
    public List<Table> Tables;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(namespace = "object", name = "Reference")
    public List<Reference> References;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(namespace = "object", name = "Group")
    public List<Group> DefaultGroups;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(namespace = "object", name = "ExtendedDependency")
    public List<ExtendedDependency> ChildTraceabilityLinks;
    @XmlElementWrapper(namespace = "collection")
    @XmlElement(namespace = "object", name = "TargetModel")
    public List<TargetModel> TargetModels;
}
