class Circle implements Measurable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}

// do not change the interface
interface Measurable {
    double area();
}

class TestDrive {
    public static void main(String[] args) {
        String s = "";

        for (int i = 0; i < args.length; i++) {
            s += args[i];
        }
        System.out.println(s);
    }
}
