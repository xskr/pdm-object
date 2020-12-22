package com.xskr.pd.pdm;

import javax.xml.bind.JAXB;

public class A02JaxbWrite {
    public static void main(String[] args){
        RootModel rootModel = new RootModel();
        RootObject rootObject = new RootObject();
        rootObject.Id = "ax";
        rootModel.RootObject = rootObject;
        JAXB.marshal(rootModel, System.out);
    }
}
