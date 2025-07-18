package com.student;
import jakarta.persistence.*;

@Entity
public class Student_Details {
    @Id
    private int id;
    private String name;
    private String technology;
    
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
    public String getTechnology() {
        return technology;
    }
    public void setTechnology(String technology) {
        this.technology = technology;
    }
    @Override
    public String toString() {
        return "Student_Details [id=" + id + ", name=" + name + ", technology=" + technology + "]";
    }

}
