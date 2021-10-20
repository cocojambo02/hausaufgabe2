package theSports;

public class HighJump extends Athletics {
    private final double time;

    public HighJump(double time) {
        this.time = time;
    }

    @Override
    public double calculateTime(){
        return this.time;
    }

}
