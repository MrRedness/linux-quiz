public class booleanize {
    public static boolean normal(String answer) {
        if (answer.equalsIgnoreCase("yes")) {
            return true;
        }
        else if (answer.equalsIgnoreCase("no")) {
            return false;
        }
        else {
            System.out.println("Yes or no only");
            return false;

        }

    }
}
