package Tests;

import MyClasses.Coordinate;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoordinateTest {

    @Test
    public void randomS() {
        int a = Coordinate.randomS();
        boolean flag;
        flag = a >= 1 && a < 10;
        assertTrue(flag);
    }

    @Test
    public void changeCoordinate() {
        int x=0,y=0;
        Coordinate coords=new Coordinate(x,y);
        coords.changeCoordinate(60);

        assertNotEquals(x, coords.x);
        assertNotEquals(y, coords.y);
    }
}