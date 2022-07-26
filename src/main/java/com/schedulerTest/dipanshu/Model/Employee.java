package com.schedulerTest.dipanshu.Model;


import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 *     Annotations to learn
 *
 *     @XmlRootElement
 *     @XmlAttribute
 *     @XmlElement
 *
 */
@XmlRootElement(name = "emp")
public class Employee {
    @XmlAttribute(name = "Id")
    private int id;

    @XmlElement(name = "Name")
    private String name;

    @XmlElement(name = "Salary")
    private float salary;


    public Employee() {
    }

    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

}
