package com.soft1851.spring.ioc.entity;

import java.util.List;

/**
 * @author jh_wu
 * @ClassName Student
 * @Description TODO
 * @Date 2020/3/17:9:48
 * @Version 1.0
 **/
public class Student {
    private Integer id;
    private String name;
    private List<String> hobbies;
    private List<Phone>phones;

    public Student(Integer id, String name, List<String> hobbies, List<Phone> phones) {
        this.id = id;
        this.name = name;
        this.hobbies = hobbies;
        this.phones = phones;
    }

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                ", phones=" + phones +
                '}';
    }
}
