package top.xskr.pd.pdm.diagram;

import top.xskr.pd.pdm.sym.PolylineSymbol;
import top.xskr.pd.pdm.sym.Symbol;
import top.xskr.pd.pdm.sym.TableSymbol;
import top.xskr.pd.pdm.sym.TextSymbol;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.eclipse.persistence.oxm.annotations.XmlPaths;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import java.util.List;

public class PhysicalDiagram extends Diagram {
    @XmlElement(namespace = "attribute")
    public String DisplayReferences;
    @XmlElement(namespace = "attribute")
    public String PagerSize;
    @XmlElement(namespace = "attribute")
    public String PageMargins;
    @XmlElement(namespace = "attribute")
    public String PageOrientation;
    @XmlElement(namespace = "attribute")
    public String PaperSource;
    @XmlElementWrapper(namespace = "collection")
    @XmlElements({
            @XmlElement(name = "PolylineSymbol", namespace = "object", type = PolylineSymbol.class),
            @XmlElement(name = "TextSymbol", namespace = "object", type = TextSymbol.class),
            @XmlElement(name = "TableSymbol", namespace = "object", type = TableSymbol.class)
    })
    @XmlPaths({
            @XmlPath("Symbols/PolylineSymbol"),
            @XmlPath("Symbols/TextSymbol"),
            @XmlPath("Symbols/TableSymbol")
    })
    public List<Symbol> Symbols;
}
