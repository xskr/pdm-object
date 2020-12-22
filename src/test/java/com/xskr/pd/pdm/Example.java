package com.xskr.pd.pdm;


import javax.xml.bind.JAXBException;
import java.io.File;

public class Example {
    public static void main(String[] args) throws JAXBException {
        String path = "data/example.pdm";
        File pdmFile = new File(path);
        Pdm pdm = new Pdm();

        //Read data/example.pdm file to Object
        RootModel rootModel = pdm.read(pdmFile);

        //Show Tables and Columns
        int modelIndex = 0;
        for(Model model:rootModel.RootObject.Children){
            System.out.println("Model " + modelIndex + ": " + model.Name);
            int i=0;
            for(Table table:model.Tables){
                System.out.println("\tTable" + (i++) +":" + table.Code + "(" + table.Name + ")");
                for(Column column:table.Columns){
                    System.out.println("\t\tColumn:" + column.Code + "(" + column.DataType + ")");
                }

                if(table.Keys != null) {
                    for (Key key : table.Keys) {
                        System.out.println("\t\tKeys:" + key.Code);
                    }
                }

                if(table.Indexes != null) {
                    for (Index index : table.Indexes) {
                        System.out.println("\t\tIndex:" + index.Code);
                    }
                }

                if(table.Owner != null) {
                    if (table.Owner != null) {
                        for (User user : table.Owner) {
                            System.out.println("\t\tOwner: " + user.Ref.Name);
                        }
                    }
                }

                if(table.PrimaryKey != null) {
                    for (Key key : table.PrimaryKey) {
                        System.out.println("\t\tPrimaryKey: " + key.Ref);
                    }
                }
            }
        }

        //write to XML
        //pdm.write(rootModel, System.out);
    }
}
