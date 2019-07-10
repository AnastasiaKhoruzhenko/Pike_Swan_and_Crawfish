package Tests;

import MyClasses.Swan;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwanTest {
    @Test
    public void degreeTest() {
        Swan swan=new Swan();
        assertEquals(swan.degree, 60);
    }
}