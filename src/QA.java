import java.util.Scanner;

public class QA {
    public static char experience() {
        p.t("First question: How much linux experience do you have?");
        p.t("A: Just switching from Windows/Mac.");
        p.t("B: I've nibbled at it a few times, but nothing too deep");
        p.t("C: I've been using linux for a few weeks/months and I want to try a different distro.");
        p.t("D: I consider myself a linux intermediate/expert but need to find another distro.");
        Scanner scanner = new Scanner(System.in);
        char answer = scanner.next().charAt(0);
        return answer;

    }
}
