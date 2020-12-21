package com.tlw.pd.pdm;

import org.xml.sax.SAXException;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * read and rewrite
 */
public class A04JaxbRead {
    public static void main(String[] args) throws JAXBException, ParserConfigurationException, IOException, SAXException {
        File xmlFile = new File("data/my1.xml");
        RootModel rootModel = JAXB.unmarshal(xmlFile, RootModel.class);
        JAXBContext ctx = JAXBContext.newInstance(RootModel.class);
        Marshaller marshaller = ctx.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", new NameSpaceMapper());
        marshaller.marshal(rootModel, System.out);
    }
}
