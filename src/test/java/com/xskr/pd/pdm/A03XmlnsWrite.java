package com.xskr.pd.pdm;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * write custom ns
 * https://www.intertech.com/jaxb-tutorial-customized-namespace-prefixes-example-using-namespaceprefixmapper/
 */
public class A03XmlnsWrite {
    public static void main(String[] args) throws JAXBException {
        JAXBContext ctx = JAXBContext.newInstance(RootModel.class);

        RootObject rootObject = new RootObject();
        rootObject.Id = "o1";
        rootObject.SessionID = "00000000-0000-0000-0000-000000000000";

        RootModel rootModel = new RootModel();
        rootModel.RootObject = rootObject;

        Marshaller m = ctx.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        try {
            m.setProperty("com.sun.xml.bind.namespacePrefixMapper", new NameSpaceMapper());
        } catch(PropertyException e) {
            e.printStackTrace();
        }
        try(FileOutputStream fileOutputStream = new FileOutputStream("data/my1.xml")) {
            m.marshal(rootModel, System.out);
            m.marshal(rootModel, fileOutputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
