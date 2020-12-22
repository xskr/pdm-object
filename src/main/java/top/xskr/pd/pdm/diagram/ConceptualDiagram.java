package top.xskr.pd.pdm.diagram;

import top.xskr.pd.pdm.sym.EntitySymbol;
import top.xskr.pd.pdm.sym.RelationshipSymbol;
import top.xskr.pd.pdm.sym.Symbol;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.eclipse.persistence.oxm.annotations.XmlPaths;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import java.util.List;

public class ConceptualDiagram extends Diagram {
    @XmlElement(namespace = "attribute")
    public String DisplayPreferences;
    @XmlElement(namespace = "attribute")
    public String PaperSize;
    @XmlElement(namespace = "attribute")
    public String PageMargins;
    @XmlElement(namespace = "attribute")
    public Integer PageOrientation;
    @XmlElement(namespace = "attribute")
    public Integer PaperSource;
    @XmlElementWrapper(namespace = "collection")
    @XmlElements({
            @XmlElement(name = "RelationshipSymbol", namespace = "object", type = RelationshipSymbol.class),
            @XmlElement(name = "EntitySymbol", namespace = "object", type = EntitySymbol.class),
    })
    @XmlPaths({
            @XmlPath("Symbols/RelationshipSymbol"),
            @XmlPath("Symbols/EntitySymbol"),
    })
    public List<Symbol> Symbols;
}
