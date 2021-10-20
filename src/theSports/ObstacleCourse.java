package theSports;

public class ObstacleCourse extends Athletics{
    private final double time;

    public ObstacleCourse(double time) {
        this.time = time;
    }

    @Override
    public double calculateTime(){
        return this.time;
    }
}
