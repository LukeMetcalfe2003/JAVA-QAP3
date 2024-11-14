package problem1;

class Person{
    protected String myName;
    protected int myAge;
    protected String myGender;

    // constructor
    public Person(String name, int age, String gender){
        myName = name;
        myAge = age;
        myGender = gender;
    }

    // settera and getters

    public void setName(String name){
        myName = name;
    }

    public void setAge(int age){
        myAge = age;
    }

    public void setGender(String gender){
        myGender = gender;
    }

    public String getName(){
        return "Name: " + this.myName;
    }

    public String getAge(){
        return "Age: " + this.myAge;
    }

    public String getGender(){
        return "Gender: " + this.myGender;
    }

    public String toString() {
        return myName + ", age: "  + myAge + ", gender: " + myGender; 
    } 
    
}