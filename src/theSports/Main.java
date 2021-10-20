package theSports;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Basketball bBall = new Basketball(55.0);

        Football fBall = new Football(65.0);

        ObstacleCourse oCourse = new ObstacleCourse(30.0);

        HighJump hJump = new HighJump(20.0);

        List<Sport> sports = new ArrayList();
        sports.add(bBall);
        sports.add(oCourse);
        sports.add(hJump);
        sports.add(fBall);

        User theUser = new User("Cosmin", "Ioan", sports);
        System.out.println("Time sum: " + theUser.calculateTime());
        System.out.println("Avg time: " + theUser.calculateAvgTime());
        System.out.println("Basketball individual time: " + theUser.calculateTime(theUser.getSports().get(0)));
    }
}
