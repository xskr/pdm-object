# PDM-Object

## usage

- Read *.pdm file to object
- Write pdm object to *.pdm file.

## contribute

- jdk8
- gradle 4.10.3

## example

 ~~~java
 public static void main(String[] args) throws JAXBException {
     File pdmFile = new File("data/model.xml");
     Pdm pdm = new Pdm();

     //Read from *.pdm file to Object
     RootModel rootModel = pdm.read(pdmFile);

     //Show Tables and Columns
     System.out.println(rootModel.RootObject.Id);
     System.out.println(rootModel.RootObject.Children.size());
     Model model = rootModel.RootObject.Children.get(0);
     for(Table table:model.Tables){
         System.out.println("Table:" + table.Code + "(" + table.Name + ")");
         for(Column column:table.Columns){
             System.out.println("\tColumn:" + column.Code + "(" + column.Name + ")");
         }
     }

     //rewrite to XML
     //pdm.write(rootModel, System.out);
 }
 ~~~

## log

- read PowerDesigner format
- Introduce Eclipse's xml persistence library to solve the problem of xml tag customization
- Introduce sun's annotation to solve the problem of escaping xml node namespace
- Achieve reading all pdm file nodes and attributes
