import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)  {
	ArrayList<Object> userChoices = new ArrayList<>(); // here I store the answers from the user
	System.out.println("Welcome to the Linux Quiz!");
	sleep.sec(2); // a sleep method is setup for easier syntax (sleep.java)
	System.out.println("I will be guiding you through finding a linux distribution for your needs.");
	sleep.sec(2);
	char experience = QA.experience();  // asks how much experience the user has (method defined in QA.java)
	if (!((experience == 'A')| (experience == 'B') | (experience == 'C') | (experience == 'D'))) {
		p.t("Incorrect usage, please type A, B, C, or D.");
		Scanner scanner = new Scanner(System.in);
		experience = scanner.next().charAt(0);
		}
	userChoices.add(experience);
		// in the future, answering that you are just switching from windows will divert you to a simpler version of the quiz
/*	if(userChoices.get(0) == 'A') {

	}
	else { */
		char packages = QA.packages(); // asks the user which package system they prefer (stability vs updates)
		if (!((packages == 'A')| (packages == 'B') | (packages == 'C') | (packages == 'D') | (packages == 'E'))) {
			p.t("Incorrect usage, please type A, B, C, D, or E.");
			Scanner scanner = new Scanner(System.in);
			packages = scanner.next().charAt(0);
		}
		userChoices.add(packages);


		char UI = QA.UI();
		if (!((UI == 'A')| (UI == 'B') | (UI == 'C') | (UI == 'D'))) {
			p.t("Incorrect usage, please type A, B, C, or D.");
			Scanner scanner = new Scanner(System.in);
			UI = scanner.next().charAt(0);
		}

		switch (UI) { // depending on the user's answer for their UI preferences, it will ask some follow-up questions
			case 'A' -> {
				p.t("Which DE? KDE, Gnome, Xfce, MATE, Cinnamon, Budgie, LXQt, or Deepin?");
				Scanner scanner = new Scanner(System.in);
				userChoices.add(scanner.nextLine());
				//		scanner.close();
			}
			case 'B' -> {
				p.three("The desktop environment is what defines how your system looks and operates.");
				p.three("A DE would include: the login screen, the task bar, and the bar above windows.");
				p.three("Most DEs also ship with a default set of apps like settings, calender, mail, word processor, etc.");
				p.three("I have included a short list of distros and the desktop environments they use.");
				p.three("If your distro isn't on the list (I can only list so many), look it up online:");
				p.three("Search 'what desktop environment does ____ use'");
				p.one("Ubuntu: Modified version of the Gnome Desktop Environment");
				p.one("Ubuntu MATE: MATE Desktop Environment");
				p.one("Kubuntu: KDE Desktop Environment");
				p.one("KDE Neon: KDE Desktop Environment");
				p.one("Xubuntu: XFCE Desktop Environment");
				p.one("Linux Mint: This one depends, the main version is Cinnamon, but they also offer MATE and XFCE editions.");
				p.one("If in doubt, check the version information in your linux mint settings.");
				p.one("Ubuntu Budgie: Budgie Desktop Environment.");
				p.one("Lubuntu: LXQt Desktop Environment.");
				p.one("UbuntuDDE: Deepin Desktop Environment.");
				p.one("Pop OS: Modified version of the Gnome Desktop Environment");
				p.one("Fedora: The main version uses Gnome, although they do offer alternative versions.");
				p.one("Manjaro: Manjaro offers loads of different Desktop Environments, mainly XFCE, Gnome, and KDE.");
				p.t("Ok, so if you now know which desktop environment you want, type yes.");
				p.t("If you are still confused and just want me to guide you through picking a DE, type no.");
				Scanner scanner = new Scanner(System.in);
				String choice = scanner.nextLine();
				boolean loop = true;
				while (loop)
					if (choice.equals("Yes") | choice.equals("yes")) {
						loop = false;
						p.t("Which DE? KDE, Gnome, Xfce, MATE, Cinnamon, Budgie, LXQt, or Deepin?");
						Scanner scannerDE = new Scanner(System.in);
						userChoices.add(scannerDE.nextLine());
						//				scannerDE.close();
					} else if (choice.equals("No") | choice.equals("no")) {
						loop = false;
						p.t("Would you like a Windows-like, or Mac-Like experience?");
						p.t("Answer with 'Windows' or 'Mac'");
						Scanner scannerDesktopExperience = new Scanner(System.in);
						String desktopExperience = scannerDesktopExperience.nextLine();
						//				p.t(desktopExperience);
						//				scannerDesktopExperience.close();
						if (desktopExperience.equals("Windows")) {
							p.t("Would you like me to just recommend you a windows-like distro, or would you prefer to find a DE suited to your needs.");
							p.t("Answer with yes for recommendation, or no for a DE selection guide.");
							Scanner scannerRecommendation = new Scanner(System.in);
							String recommendation = scannerRecommendation.nextLine();
							boolean booleanRecommendation = booleanize.normal(recommendation);
							if (booleanRecommendation) {
								userChoices.add("Windows");
							} else {


								p.t("Ok, now let's figure out your priorities.");
								p.t("Is your number 1 priority: performance, looks, or customization?");
								Scanner scannerPriority1 = new Scanner(System.in);
								String priority1 = scannerPriority1.nextLine();
								//					p.t(priority1);
								//					scannerPriority1.close();


								switch (priority1.toUpperCase()) {
									case "PERFORMANCE" -> {
										p.t("Is your number 2 priority: looks, or customization?");
										Scanner scannerPriority2 = new Scanner(System.in);
										String priority2 = scannerPriority2.nextLine();
										//							scannerPriority2.close();
										switch (priority2.toUpperCase()) {
											case "LOOKS" -> {
												p.t("Performance, then Looks");
												p.t("I'd recommend LXQt, a lightweight but relatively good looking Desktop Environment.");
												p.t("If this is ok, answer with yes.");
												p.t("If not, answer no.");
												Scanner scannerSelectDE = new Scanner(System.in);
												String selectDE = scannerSelectDE.nextLine();
												if (selectDE.equalsIgnoreCase("yes")) {
													userChoices.add("LXQt");
												} else if (selectDE.equalsIgnoreCase("no")) {
													p.t("Ok, some alternatives are: XFCE, Mate, or Cinnamon.");
													p.t("If you don't like these, just answer with the DE of your choice.");
													String selectDE2 = scannerSelectDE.nextLine();
													userChoices.add(selectDE2);
												}
												// LXQt

											}
											case "CUSTOMIZATION" -> {
												p.t("Performance, then Customization");
												p.t("I'd recommend XFCE, a lightweight but relatively good looking Desktop Environment loaded with customization features.");
												p.t("If this is ok, answer with yes.");
												p.t("If not, answer no.");
												Scanner scannerSelectDE = new Scanner(System.in);
												String selectDE = scannerSelectDE.nextLine();
												if (selectDE.equalsIgnoreCase("yes")) {
													userChoices.add("XFCE");
												} else if (selectDE.equalsIgnoreCase("no")) {
													p.t("Ok, some alternatives are: KDE, Mate, or Cinnamon.");
													p.t("If you don't like these, just answer with the DE of your choice.");
													String selectDE2 = scannerSelectDE.nextLine();
													userChoices.add(selectDE2);
												}
												// XFCE

											}
										}

									}
									case "LOOKS" -> {
										p.t("Is your number 2 priority: performance, or customization?");
										Scanner scannerPriority2 = new Scanner(System.in);
										String priority2 = scannerPriority2.nextLine();
										//						scannerPriority2.close();
										switch (priority2.toUpperCase()) {
											case "PERFORMANCE" -> {
												p.t("Looks, then Performance");
												p.t("I'd recommend Cinnamon, a very windows-like OS with decent performance and some customization features..");
												p.t("If this is ok, answer with yes.");
												p.t("If not, answer no.");
												Scanner scannerSelectDE = new Scanner(System.in);
												String selectDE = scannerSelectDE.nextLine();
												if (selectDE.equalsIgnoreCase("yes")) {
													userChoices.add("Cinnamon");
												} else if (selectDE.equalsIgnoreCase("no")) {
													p.t("Ok, some alternatives are: XFCE, Mate, or KDE.");
													p.t("If you don't like these, just answer with the DE of your choice.");
													String selectDE2 = scannerSelectDE.nextLine();
													userChoices.add(selectDE2);
												}

											}
											case "CUSTOMIZATION" -> {
												p.t("Looks, then Customization");
												p.t("I'd recommend KDE, a DE that comes very good looking (windows-like) but loaded with customization features.");
												p.t("If this is ok, answer with yes.");
												p.t("If not, answer no.");
												Scanner scannerSelectDE = new Scanner(System.in);
												String selectDE = scannerSelectDE.nextLine();
												if (selectDE.equalsIgnoreCase("yes")) {
													userChoices.add("KDE");
												} else if (selectDE.equalsIgnoreCase("no")) {
													p.t("Ok, some alternatives are: XFCE, Mate, or Cinnamon.");
													p.t("If you don't like these, just answer with the DE of your choice.");
													String selectDE2 = scannerSelectDE.nextLine();
													userChoices.add(selectDE2);
												}
												// KDE

											}
										}

									}
									case "CUSTOMIZATION" -> {
										p.t("Is your number 2 priority: performance, or looks?");
										Scanner scannerPriority2 = new Scanner(System.in);
										String priority2 = scannerPriority2.nextLine();
										//						scannerPriority2.close();
										switch (priority2.toUpperCase()) {
											case "PERFORMANCE" -> {
												p.t("Customization, then Performance");
												p.t("I'd recommend XFCE, a lightweight but relatively good looking Desktop Environment loaded with customization features.");
												p.t("If this is ok, answer with yes.");
												p.t("If not, answer no.");
												Scanner scannerSelectDE = new Scanner(System.in);
												String selectDE = scannerSelectDE.nextLine();
												if (selectDE.equalsIgnoreCase("yes")) {
													userChoices.add("XFCE");
												} else if (selectDE.equalsIgnoreCase("no")) {
													p.t("Ok, some alternatives are: KDE, Mate, or Cinnamon.");
													p.t("If you don't like these, just answer with the DE of your choice.");
													String selectDE2 = scannerSelectDE.nextLine();
													userChoices.add(selectDE2);
												}
												// XFCE

											}
											case "LOOKS" -> {
												p.t("Customization, then Looks");
												p.t("I'd recommend KDE, a DE that comes very good looking (windows-like) but loaded with customization features.");
												p.t("If this is ok, answer with yes.");
												p.t("If not, answer no.");
												Scanner scannerSelectDE = new Scanner(System.in);
												String selectDE = scannerSelectDE.nextLine();
												if (selectDE.equalsIgnoreCase("yes")) {
													userChoices.add("KDE");
												} else if (selectDE.equalsIgnoreCase("no")) {
													p.t("Ok, some alternatives are: XFCE, Mate, or Cinnamon.");
													p.t("If you don't like these, just answer with the DE of your choice.");
													String selectDE2 = scannerSelectDE.nextLine();
													userChoices.add(selectDE2);
												}
												// KDE

											}
										}

									}
								}

							}
						}
						//mac like
					} else {
						p.t("Invalid answer... Use yes or no.");
					}

			}
			case 'C' -> {
				// Will look very similar to the windows-like switch in B
				p.t("");
				p.t("");
				p.t("");

			}
			case 'D' -> {
				// Will be very similar to B and C
				p.t("");

			}
			default -> {

			}
		} // end to switch
		System.out.println(userChoices); // for debug rn






    } // main method
} // class
