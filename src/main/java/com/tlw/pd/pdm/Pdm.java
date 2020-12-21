package com.tlw.pd.pdm;

import org.eclipse.persistence.jaxb.JAXBContextFactory;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.OutputStream;
import java.util.HashMap;

public class Pdm {
    public RootModel read(File pdmFile){
        RootModel rootModel = JAXB.unmarshal(pdmFile, RootModel.class);
        return rootModel;
    }

    public void write(RootModel rootModel, OutputStream outputStream) throws JAXBException {
        JAXBContext ctx = JAXBContextFactory.createContext(new Class[]{RootModel.class}, new HashMap());
        Marshaller marshaller = ctx.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", new NameSpaceMapper());
        marshaller.marshal(rootModel, outputStream);
    }
}
