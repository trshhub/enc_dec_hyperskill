class Application {

    String name;

    void run(String... args) {
        System.out.println(this.name);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    /*public Application(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Application application = new Application("SimpleApplication");
        application.run("a", "b", "c");

    }*/
}