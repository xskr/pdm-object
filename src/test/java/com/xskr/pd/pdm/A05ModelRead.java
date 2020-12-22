package com.xskr.pd.pdm;

import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.bind.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class A05ModelRead {
    public static void main(String[] args) throws JAXBException, ParserConfigurationException, IOException, SAXException {
        File xmlFile = new File("data/example.pdm");
        JAXBContext ctx = JAXBContext.newInstance(RootModel.class);
        Unmarshaller unmarshaller = ctx.createUnmarshaller();
        Node node = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(xmlFile).getDocumentElement();
        JAXBElement<RootModel> modelJAXBElement = unmarshaller.unmarshal(node, RootModel.class);
        RootModel rootModel = modelJAXBElement.getValue();

        Marshaller marshaller = ctx.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", new NameSpaceMapper());
        marshaller.marshal(rootModel, System.out);
    }
}
