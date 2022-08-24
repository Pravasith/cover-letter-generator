import java.util.Locale;
import java.util.Scanner;

public class Run {

    public void run() {
        Scanner input = new Scanner(System.in);
        String temp;

        System.out.print("Choose:\n" +
                "LinkedIn message (L) or Cover letter(C):");
        temp = input.nextLine();

        if(temp.toLowerCase(Locale.ROOT).equals("l"))
        {
            GenerateLinkedInPM generateLinkedInPM = new GenerateLinkedInPM();
            generateLinkedInPM.AskDetails(true);
        }

        else if(temp.toLowerCase(Locale.ROOT).equals("c"))
        {
            GenerateCoverLetter generateCoverLetter = new GenerateCoverLetter();
            generateCoverLetter.AskDetails();
        }

        else
        {
            System.out.println("Invalid choice");

        }

//        run();
    }

}
