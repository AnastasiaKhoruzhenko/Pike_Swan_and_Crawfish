package Tests;

import MyClasses.Crawfish;
import org.junit.Test;

import static org.junit.Assert.*;

public class CrawfishTest {
    @Test
    public void degreeTest() {
        Crawfish crawfish=new Crawfish();
        assertEquals(crawfish.degree, 300);
    }
}