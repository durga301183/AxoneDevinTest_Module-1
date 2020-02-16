public class Voter {
    private int age;
//private variable can be controlled using getter and setter methods
    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("voter too young");
        }
        else if(age > 125){
            throw new InvalidAgeException("voter too old");
        }
        this.age = age; //set the age tgo variable
    }

}











