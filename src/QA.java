import java.util.Scanner;

public class QA {
    public static char experience() {
        p.t("First question: How much linux experience do you have?");
        p.t("A: Just switching from Windows/Mac.");
        p.t("B: I've nibbled at it a few times, but nothing too deep");
        p.t("C: I've been using linux for a few weeks/months and I want to try a different distro.");
        p.t("D: I consider myself a linux intermediate/expert but need to find another distro.");
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);

    }
    public static char packages() {
        p.t("Ok. Next question: What type of package system do you prefer?");
        p.t("(Packages are compiled software that can be installed on linux systems (the equivalent of a .exe on windows).");
        p.t("Linux distros use 'package managers' to help install and keep up to date your software.");
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }
}
