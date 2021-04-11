class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName;
        }
    }

    public String getFullName() {
        String tmp;
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "Unknown";
        } else if (firstName.isEmpty() && !lastName.isEmpty()) {
            return lastName;
        } else if (!firstName.isEmpty() && lastName.isEmpty()) {
            return  firstName;
        } else {
            return firstName + " " + lastName;
        }
        //return ""; // write your code here
    }

    /*public static void main(String[] args) {
        User tim = new User();
        tim.setFirstName("Tim");
        tim.setLastName("Towler");
        System.out.println(tim.getFullName().length());
        System.out.println(tim.getFullName()); // Tim Towler

        User katie = new User();
        katie.setFirstName("Katie");
        katie.setLastName(null);
        System.out.println(katie.getFullName().length());
        System.out.println(katie.getFullName().toCharArray());
        System.out.println(katie.getFullName() + "/"); // Katie (without additional spaces)
    }*/
}