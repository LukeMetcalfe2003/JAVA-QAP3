package problem1;

public class CollegeStudent extends Student{
    protected String myMajor;
    protected int myYear;
    
    // constructor
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, String major, int year){
        super(name, age, gender, idNum, gpa);
        myMajor = major;
        myYear = year;
    }

    // getters and setters
    public void setMajor(String major){
        myMajor = major;
    }

    public void setYear(int year){
        myYear = year;
    }

    public String getMajor(){
        return myMajor;
    }

    public int getYear(){
        return myYear;
    }

    public String toString() {
        return super.toString() + ", Major: " + myMajor + ", Year: " + myYear;
    }
}
