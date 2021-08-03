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
public class Student {
    
    private int id; 
    private String firstName;
    private String lastName;
    private String addtess;
    private String ciy;

    
    
    public Student(){
        
    }
    
    public Student(int id, String firstName, String lastName, String addtess, String ciy) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addtess = addtess;
        this.ciy = ciy;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAddtess() {
        return addtess;
    }

    public void setAddtess(String addtess) {
        this.addtess = addtess;
    }

    public String getCiy() {
        return ciy;
    }

    public void setCiy(String ciy) {
        this.ciy = ciy;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", addtess=" + addtess + ", ciy=" + ciy + '}';
    }



 dzz    

}
