package com.company;

/**
 * @author      Victoria Bagnall
 * @version     2
 * @since       1
 */

// a driver class to test MoviePlayer Class (Step 12)
public class MoviePlayerDriver {
    public static void testMoviePlayer() {
        MoviePlayer player1 = new MoviePlayer("DBPOWER MK101", new Screen( "720x480", 40, 22), MonitorType.LCD);
        MoviePlayer player2 = new MoviePlayer("Pyle PDV156BK", new Screen( "1366x768", 40, 22), MonitorType.LED);
        System.out.println(player1);
        System.out.println(player2);
    }

}

