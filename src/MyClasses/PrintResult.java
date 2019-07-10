package MyClasses;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.TimerTask;

public class PrintResult extends TimerTask {
    @Override
    public void run() {
        System.out.printf("Coordinate x = %s\nCoordinate y = %s\n\n",
                new BigDecimal(Main.coords.x).setScale(2, RoundingMode.UP).doubleValue(),
                new BigDecimal(Main.coords.y).setScale(2, RoundingMode.UP).doubleValue());
    }
}
