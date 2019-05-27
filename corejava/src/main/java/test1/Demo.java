package test1;

import javax.xml.bind.*;
import javax.xml.namespace.QName;

public class Demo {

    public static void main(String[] args) throws Exception {
        JAXBContext jc = JAXBContext.newInstance(Resource.class);

        Resource resource = new Resource();
        JAXBElement<Object> jaxbElement = new JAXBElement<Object>(QName.valueOf("resource"), Object.class, resource);

        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(jaxbElement, System.out);
    }

}