import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

public class GenerateLinkedInPM
{
    private String username;
    private String hiringCompany;
    String jobPortal = "LinkedIn";
    String message = "Hi**USERNAME**,\n" +
            "\n" +
            "I hope you are well! Before I go on, I'd love it if you glanced at my portfolio - **PORTFOLIO_LINK**.\n" +
            "\n" +
            "Thank you for connecting with me on **PORTAL_NAME**. I am a Full Stack Developer, new to Canada, with Five years of experience in tech, and currently seeking new full-time opportunities. I would love to chat about whether my background might be a fit for any of the openingsCOMPANY_NAME.\n" +
            "\n" +
            "Thanks in advance,\n" +
            "\n" +
            "Pravasith Chinthoju. \n" +
            "pravasith.com \n" +
            "pravasith@gmail.com \n" +
            "+1 647 786 4048";



    public void AskDetails ()
    {
        // creates an object of Scanner
        Scanner input = new Scanner(System.in);
        String temp;

        System.out.print("Hiring person name: ");
        temp = input.nextLine();
        username =  " " + temp;


        System.out.print("Company name: ");
        temp = input.nextLine();
        hiringCompany = temp.length() > 0 ? " at " + temp : "";

        System.out.print("Job portal: ");
        temp = input.nextLine();
        jobPortal = temp.length() > 0 ? temp : jobPortal;

        System.out.print("Needs format? (default no): ");
        temp = input.nextLine();

        message = message
                .replace("USERNAME", username)
                .replace("PORTFOLIO_LINK", "https://pravasith.com")
                .replace("COMPANY_NAME", hiringCompany)
                .replace("PORTAL_NAME", jobPortal);

        if(temp.length() == 0) {
            message = message.replace("**", "");
        }

        StringSelection stringSelection = new StringSelection(message);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);

        // closes the scanner
        input.close();
    }
}
