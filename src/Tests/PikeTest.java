package Tests;

import MyClasses.Pike;
import org.junit.Test;

import static org.junit.Assert.*;

public class PikeTest {
    @Test
    public void degreeTest() {
        Pike pike=new Pike();
        assertEquals(pike.degree, 180);
    }
}