package com.schedulerTest.dipanshu.scheduler;

import com.schedulerTest.dipanshu.Model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileOutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class MarshalClass {

    private static final Logger log = LoggerFactory.getLogger(MarshalClass.class);

    /**
     *
     *       Goal -  Write pojo( plain old java object ) into XML file
     *
     */
    public static void main(String[] args) throws Exception{

        JAXBContext contextObj = JAXBContext.newInstance(Employee.class);
        Marshaller marshallerObj = contextObj.createMarshaller();
        marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        // Object we want to write to XML File.
        Employee emp = new Employee(2,"Dipanshu Negi",5000000);

        // Marshalling object into employee.xml
        marshallerObj.marshal(emp, new FileOutputStream("D:"+ File.separator+"Codebase"
                +File.separator+"employee.xml"));

        // success message
        System.out.println("Object Succesfully marshalled into employee.xml");
    }

}
