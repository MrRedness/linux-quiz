import java.util.Scanner;

public class QA {
    public static char experience() {
        p.two("First question: How much linux experience do you have?");
        p.two("A: Just switching from Windows/Mac.");
        p.two("B: I've nibbled at it a few times, but nothing too deep");
        p.two("C: I've been using linux for a few weeks/months and I want to try a different distro.");
        p.t("D: I consider myself a linux intermediate/expert but need to find another distro.");
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);

    }
    public static char packages() {
        p.three("Ok. Next question: What type of package system do you prefer?");
        p.three("(Packages are compiled software that can be installed on linux systems (the equivalent of a .exe on windows).");
        p.three("Linux distros use 'package managers' to help install and keep your software up to date.");
        p.three("Typically, there will be a tradeoff between amount of software / how up-to-date the software is, versus stability.");
        p.three("In this case, stability refers to the likelihood of packages having issues");
        p.three("A more stable distro will very rarely break or have issues, while a less stable distro may occasionally bring up a few problems.");

        p.three("A: For a regular user. A good amount of software that is considered stable but still fairly up-to-date. (Ubuntu repos)");
        p.three("B: For the user who can't get enough: Tons of software that is very up-to-date, but may be less stable. (Arch repos)");
        p.three("C: For the user who likes to try innovation but stay stable. Less software, but more up to date and with rock solid stability. (Fedora repos)");
        p.three("D: I hate updates! I don't care if my software is a while out of date, just keep it stable. (Debian repos)");
        p.t("E: Extreme stability (For enterprise or servers). Software will be years out of date, but stability is 99.9% ensured. (Red hat/cent os repos)");
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }
    public static char UI() {
        p.two("Thank you! How do you want your distro to look?");
        p.two("A: I already know what Desktop Environment I like (Gnome, KDE, XFCE, etc.)");
        p.two("B: I don't know what a Desktop Environment is, but I liked the way my previous distro looked and want it to remain the same.");
        p.two("C: I didn't like my previous distro. I'd like a new look/feel.");
        p.t("D: I'm just starting out, I really have no clue what you are talking about.");
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }
}
