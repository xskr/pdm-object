package top.xskr.pd.pdm;

import javax.xml.bind.JAXB;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class A06Hierarchy {
    static class A{
        @XmlElementWrapper
        public List<B> bList = new ArrayList<>();
    }
    @XmlSeeAlso({BInteger.class, BFloat.class})
    static abstract class B{
        public String name;
    }
    static class BInteger extends B{
        @XmlElement
        public int value;
    }
    static class BFloat extends B{
        @XmlElement
        public double value;
    }
    public static void main(String[] args){
        BInteger b1 = new BInteger();
        b1.value = 1;
        BFloat b2 = new BFloat();
        b2.value = 100.123;
        A a = new A();
        a.bList.add(b1);
        a.bList.add(b2);
        JAXB.marshal(a, System.out);
        JAXB.marshal(a, new File("data/my2.xml"));

        A aa = JAXB.unmarshal(new File("data/my2.xml"), A.class);
        System.out.println(aa.bList.size());
    }
}
