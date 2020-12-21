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
- 引入Eclipse的xml持久化库解决xml标签定制化问题
- 引入sun的注解解决xml节点命名空间转义问题
- 实现读取所有pdm文件节点和属性
