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
public class Result {
    
    private int studentId;
    private int courseId;
    private String session;
    private int mark;

    public Result(int studentId, int courseId, String session, int mark) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.session = session;
        this.mark = mark;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
    
    public Result(){
        
    }

    @Override
    public String toString() {
        return "Result{" + "studentId=" + studentId + ", courseId=" + courseId + ", session=" + session + ", mark=" + mark + '}';
    }
    
    
    
    
}
 