package MyClasses;

import java.util.Random;
import java.util.Timer;

public class Main {
    Random rnd = new Random();
    static Timer myTimer = new Timer();
    static Coordinate coords = new Coordinate();

    public static void main(String[] args) {
        Main threads = new Main();
        //check the args(if they are correct or not)
        if (args.length == 2) {
            coords.x = convertToDouble(args[0]);
            coords.y = convertToDouble(args[1]);
        } else {
            //if args are incorrect or they are missing
            coords.x = 0;
            coords.y = 0;
        }
        //start the timer with the frequency of the method call (PrintResult)
        myTimer.schedule(new PrintResult(), 0, 2000);
        //start to move the cart
        threads.Move();
    }

    public void Move() {
        //make the instances of animals' class
        Swan swan = new Swan();
        Pike pike = new Pike();
        Crawfish crawfish = new Crawfish();

        //time when all of animals need to go for the rest(after 25 sec)
        long endTime = System.currentTimeMillis() + 25000;

        while (System.currentTimeMillis() < endTime) {
            Thread swanThread = new Thread(() -> {
                //Swan change the coordinates
                coords.changeCoordinate(swan.degree);
                try {
                    Thread.sleep(1000 + rnd.nextInt(4000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            Thread pikeThread = new Thread(() -> {
                //Pike change the coordinates
                coords.changeCoordinate(pike.degree);
                try {
                    Thread.sleep(1000 + rnd.nextInt(4000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            Thread crawfishThread = new Thread(() -> {
                //Crawfish change the coordinates
                coords.changeCoordinate(crawfish.degree);
                try {
                    Thread.sleep(1000 + rnd.nextInt(4000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            //start working
            swanThread.start();
            pikeThread.start();
            crawfishThread.start();
            try {

                swanThread.join();
                pikeThread.join();
                crawfishThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        //stop the timer
        myTimer.cancel();
    }

    /**
     * convert String parameter to Double
     *
     * @param str - String parameter
     * @return the Double version of String parameter(0, if parameter can't parse to Double)
     */
    private static double convertToDouble(String str) {
        double d;
        try {
            d = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            d = 0;
        }
        return d;
    }
}
