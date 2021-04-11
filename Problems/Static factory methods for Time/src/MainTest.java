public class MainTest {

//    the invocation Time.ofSeconds(500000) must create an instance with 18 hours,
//    53 minutes and 20 seconds (days are skipped);

    public static void main(String[] args) {

        int totalSecs = 500_000;


        System.out.println(totalSecs);
        System.out.println("secs in a day: " + (24 * 60 * 60));
        System.out.println("mins in a day: " + (24 * 60));
        System.out.println("hours in a day: " + 24);

        System.out.println(totalSecs % (24 * 60 * 60) % 60); // secs
        System.out.println(totalSecs % (24 * 60 * 60)
                            / 60 // total mins since start of the day
                            % 60); // mins
        System.out.println(totalSecs % (24 * 60 * 60)
                / (60 * 60) // total hours since start of the day
                ); // hours

        System.out.println((totalSecs / 60) % 1440 % 60 + " mins") ;
        System.out.println(totalSecs / 60 / 24 + " hours") ;
        System.out.println((totalSecs / 60 / 24) % 24 + " ostatok") ;
    }
}
