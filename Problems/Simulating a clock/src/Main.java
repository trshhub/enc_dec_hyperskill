class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        if (minutes == 59) {
            hours++;
            minutes = 0;
        } else {
            minutes++;
        }

        if (hours == 13) {
            hours = 1;
        }
    }

//    public static void main(String[] args) {
//        Clock clock = new Clock();
//        clock.next();
//        System.out.println(clock.hours + ":" + clock.minutes);
//    }
}