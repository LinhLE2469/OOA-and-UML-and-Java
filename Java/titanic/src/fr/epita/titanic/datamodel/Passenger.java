package fr.epita.titanic.datamodel;

public class Passenger {

    private String passengerId;
    private boolean survived;
    private String pclass;
    private String gender;
    private double age;

    //constructor
    public Passenger(String passengerId, boolean survived, String pclass, String gender,double age){
        this.passengerId = passengerId;
        this.survived = survived;
        this.pclass = pclass;
        this.gender = gender;
        this.age =age;
    }
    //setter and getter

    public String getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    public boolean getSurvived() {
        return survived;
    }

    public void setSurvived(boolean survived) {
        this.survived = survived;
    }

    public String getPclass() {
        return pclass;
    }

    public void setPclass(String pclass) {
        this.pclass = pclass;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "passengerId='" + passengerId + '\'' +
                ", survived=" + survived +
                ", pclass='" + pclass + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
