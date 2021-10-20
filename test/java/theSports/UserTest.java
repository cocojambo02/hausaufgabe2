package theSports;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void calculateTime() {

        Basketball bBall = new Basketball(55.0);
        Football fBall = new Football(65.0);
        ObstacleCourse oCourse = new ObstacleCourse(30.0);
        HighJump hJump = new HighJump(20.0);

        List<Sport> sports = new ArrayList();
        sports.add(bBall);
        sports.add(oCourse);
        sports.add(hJump);
        sports.add(fBall);
        User user = new User("Cosmin","John", sports);

        assertEquals(user.calculateTime(), 170.0);


    }

    @Test
    void calculateAvgTime() {
        Basketball bBall = new Basketball(55.0);
        Football fBall = new Football(65.0);
        ObstacleCourse oCourse = new ObstacleCourse(30.0);
        HighJump hJump = new HighJump(20.0);

        List<Sport> sports = new ArrayList();
        sports.add(bBall);
        sports.add(oCourse);
        sports.add(hJump);
        sports.add(fBall);
        User user = new User("Cosmin","John", sports);

        assertEquals(user.calculateAvgTime(), 42.5);
    }

    @Test
    void testCalculateTime() {
        Basketball bBall = new Basketball(55.0);
        Football fBall = new Football(65.0);
        ObstacleCourse oCourse = new ObstacleCourse(30.0);
        HighJump hJump = new HighJump(20.0);

        List<Sport> sports = new ArrayList();
        sports.add(bBall);
        sports.add(oCourse);
        sports.add(hJump);
        sports.add(fBall);
        User user = new User("Cosmin","John", sports);

        assertEquals(user.calculateTime(user.getSports().get(0)), 55.0);
    }
}