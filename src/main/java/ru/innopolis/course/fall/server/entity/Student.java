package ru.innopolis.course.fall.server.entity;

import javax.servlet.http.HttpServletRequest;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;



public class Student {
    private long id;
    private String firstName;
    private String lastName;
    private String sex;
    private String birth;

    public Student(){}

    public Student(ResultSet rs) throws SQLException {
        id = rs.getLong("id");
        firstName = rs.getString("first_name");
        lastName = rs.getString("last_name");
        sex = rs.getString("sex");
        birth =  new SimpleDateFormat("dd-MM-yyyy").format(rs.getDate("birth"));
    }
public Student(HttpServletRequest req){
    this.firstName =  req.getParameter("firstName");
    this.lastName = req.getParameter("lastName");
    this.sex = req.getParameter("sex");
    this.birth =req.getParameter("birth");
}
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
