package com.example.nguyenhoanglong.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "studentid")
    private String studentid;

    @Column(name = "sex")
    private int sex;

    @Column(name = "phone")
    private String phone;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "city")
    private String city;

    public Student() {
    }

    public Student(int id, String name, String studentid, int sex, String phone, Date birthday, String city) {
        this.id = id;
        this.name = name;
        this.studentid = studentid;
        this.sex = sex;
        this.phone = phone;
        this.birthday = birthday;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
