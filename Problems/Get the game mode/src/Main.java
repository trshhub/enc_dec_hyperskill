class Problem {
    public static void main(String[] args) {
        int modeIndex = 0;
        boolean foundMode = false;
        for (int i = 0; i < args.length; i++) {
            if ("mode".equals(args[i])) {
                modeIndex = i;
                foundMode = true;
                break;
            }
        }
        System.out.println(foundMode ? args[modeIndex + 1] : "default");
    }
}