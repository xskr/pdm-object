package com.xskr.pd.pdm.sym;

import javax.xml.bind.annotation.XmlSeeAlso;

@XmlSeeAlso({PolylineSymbol.class, TableSymbol.class, TextSymbol.class, RelationshipSymbol.class, EntitySymbol.class})
public abstract class Symbol {
}
