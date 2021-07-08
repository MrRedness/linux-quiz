import java.util.ArrayList;


public class Main {
    public static void main(String[] args)  {
	ArrayList<Character> userChoices = new ArrayList<>(); // here I store the answers from the user
	System.out.println("Welcome to the Linux Quiz!");
	sleep.sec(2); // a sleep method is setup for easier syntax (sleep.java)
	System.out.println("I will be guiding you through finding a linux distribution for your needs.");
	sleep.sec(3);
	userChoices.add(QA.experience()); // asks how much experience the user has (method defined in QA.java)
		// in the future, answering that you are just switching from windows will divert you to a simpler version of the quiz
	userChoices.add(QA.packages()); // asks the user which package system they prefer (stability vs updates)
	System.out.println(userChoices); // just for debug rn
	switch (QA.UI()) { // depending on the user's answer for their UI preferences, it will ask some follow-up questions
		case 'A': {}
		case 'B': {}
		case 'C': {}
		case 'D': {}
	}

    }
}
