public class Person {

//    Three field (instance variable)
    private String firstName;
    private String lastName;
    private int age;


/*  Instance Methods */

//    Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

//    Setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        this.age = age;
        if (age < 0 || age > 100){
            this.age = 0;
        }
    }

    public boolean isTeen(){
        if(age > 12 && age < 20){
            return true;
        } else {
            return false;
        }
    }
    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }
}
