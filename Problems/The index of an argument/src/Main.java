class Problem {
    public static void main(String[] args) {
        boolean testFound = false;
        int testIndex = 0;
        for (String var: args) {
            if ("test".equals(var)) {
                testFound = true;
                break;
            }
            testIndex++;
        }
        System.out.println(testFound ? testIndex : -1);
    }
}