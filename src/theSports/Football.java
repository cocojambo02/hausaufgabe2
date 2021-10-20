package theSports;

public class Football extends TeamSport{
    private final double time;

    public Football(double time) {
        this.time = time;
    }

    @Override
    public double calculateTime(){
        return this.time;
    }

}
