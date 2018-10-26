package com.company;


// a driver class to test MoviePlayer Class (Step 12)
public class MoviePlayerDriver {
    public static void testMoviePlayer() {
        MoviePlayer player1 = new MoviePlayer("DBPOWER MK101", "720x480", 40, 22, MonitorType.LCD);
        MoviePlayer player2 = new MoviePlayer("Pyle PDV156BK", "1366x768", 40, 22, MonitorType.LED);
        System.out.println(player1);
        System.out.println(player2);
    }

}

