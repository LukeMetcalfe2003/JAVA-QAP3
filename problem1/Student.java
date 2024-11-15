package problem1;

public class Student extends Person {
    protected String myIdNum;
    protected double myGPA;
    public Student(String name, int age, String gender, String idNum, double gpa){
       
        // super class
        super(name, age, gender);
        
        // initalize new fields
        myIdNum = idNum;
        myGPA = gpa;
    }

    // getters and setters
    public void setIdNum(String idNum){
        myIdNum = idNum;
    }

    public void setGPA(double gpa){
        myGPA = gpa;
    }

    public String getIdNum(){
        return myIdNum;
    }

    public double getGPA(){
        return myGPA;
    }

    public String toString() {
        return super.toString() + ", student id: " + myIdNum + ", GPA: " + myGPA; 
    }
}
