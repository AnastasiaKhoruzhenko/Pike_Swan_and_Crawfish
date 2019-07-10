package MyClasses;

import java.util.Random;

public class Coordinate {
    //coordinates x and y
    public double x, y;
    private static Random rnd = new Random();

    public Coordinate() {
    }

    /**
     * constructor to set x and y
     *
     * @param x - x-value
     * @param y - y-value
     */
    public Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * method to set random value
     *
     * @return random value for x or y
     */
    public static int randomS() {
        int min = 1;
        int max = 10;
        int i = rnd.nextInt(max - min + 1) + min;
        return i;
    }

    /**
     * method to change the coordinates of x and y
     *
     * @param degree - the angle which a certain animal uses to move
     */
    public synchronized void changeCoordinate(int degree) {
        int s = randomS();
        x += s * Math.cos(Math.toRadians(degree));
        y += s * Math.sin(Math.toRadians(degree));
    }
}
