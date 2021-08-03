/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

/**
 *
 * @author peter
 */
public class Course {
    
    private int id;
    private String name;
    private String creditNumber;

    public Course(int id, String name, String creditNumber) {
        this.id = id;
        this.name = name;
        this.creditNumber = creditNumber;
    }
    
    public Course(){
        
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

    public String getCreditNumber() {
        return creditNumber;
    }

    public void setCreditNumber(String creditNumber) {
        this.creditNumber = creditNumber;
    }

    @Override
    public String toString() {
        return "Course{" + "id=" + id + ", name=" + name + ", creditNumber=" + creditNumber + '}';
    }                                                                                                       









}