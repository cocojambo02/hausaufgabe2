package theSports;


import java.util.List;

public class User {
    private String name;
    private String surname;
    private List<Sport> sports;

    public User(String name, String surname, List<Sport> sport) {
        this.name = name;
        this.surname = surname;
        this.sports = sport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Sport> getSports() {
        return sports;
    }

    public void setSports(List<Sport> sports) {
        this.sports = sports;
    }

    /*
     * Returns the sum of all the sport times.
     * post: Returns double result
     * */
    public double calculateTime(){
        double timeSum = 0;
        for(Sport sport: this.sports){
            timeSum += sport.calculateTime();
        }

        return timeSum;
    }
    /*
    * Returns the sum of all the sport times divided by the number of elements.
    * post: Returns double result
    * */
    public double calculateAvgTime(){
        return this.calculateTime()/this.sports.size();
    }

    public double calculateTime(Sport theSport){
        return theSport.calculateTime();
    }
}
