package theSports;

public class Basketball extends TeamSport{
    private final double time;

    public Basketball(double time) {
        this.time = time;
    }

    @Override
    public double calculateTime(){
        return this.time;
    }
}
