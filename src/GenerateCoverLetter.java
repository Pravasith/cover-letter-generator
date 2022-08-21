import java.util.Scanner;

import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

public class GenerateCoverLetter
{
    private String hiringPerson = "hiring manager";
    String hiringRole;
    String hiringCompany;
    String jobPortal = "LinkedIn";
    String message = "Dear **HIRER_NAME**,\n" +
            "\n" +
            "I hope you are well! Before I go on, I'd love it if you took glanced at my portfolio - **PORTFOLIO_LINK** because it tells my story in an appealing way.\n" +
            "\n" +
            "I was excited when I saw the **DEV_ROLE** listing at **COMPANY_NAME** that was posted on **JOB_PORTAL** as it closely matches the exact role that I am looking for. I have over 5 years of experience in building software, and I’m highly enthusiastic about joining your team so I can contribute what I know, and also learn what I can.\n" +
            "\n" +
            "I work really hard, and if you give me a shot, I will do my best to prove it to you.\n" +
            "\n" +
            "I hope to hear back from you!\n" +
            "\n" +
            "Thank you,\n" +
            "\n" +
            "Pravasith Chinthoju. \n" +
            "[www.pravasith.com](http://www.pravasith.com/) \n" +
            "[pravasith@gmail.com](mailto:pravasith@gmail.com) \n" +
            "+1 647 786 4048";

    @Override
    public String toString()
    {
        return "GenerateCoverLetter{" +
                "hiringPerson='" + hiringPerson + '\'' +
                ", hiringRole='" + hiringRole + '\'' +
                ", hiringCompany='" + hiringCompany + '\'' +
                ", jobPortal='" + jobPortal + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public void AskDetails ()
    {
        // creates an object of Scanner
        Scanner input = new Scanner(System.in);
        String temp;

        System.out.print("Hiring person name: ");
        temp = input.nextLine();
        hiringPerson = temp.length() > 0 ? temp : hiringPerson;

        System.out.print("Role posted: ");
        temp = input.nextLine();
        hiringRole = temp.length() > 0 ? temp : hiringRole;

        System.out.print("Company name: ");
        temp = input.nextLine();
        hiringCompany = temp.length() > 0 ? temp : hiringCompany;

        System.out.print("Job portal: ");
        temp = input.nextLine();
        jobPortal = temp.length() > 0 ? temp : jobPortal;

        System.out.print("Needs format? (default no): ");
        temp = input.nextLine();

        message = message
                .replace("HIRER_NAME", hiringPerson)
                .replace("PORTFOLIO_LINK", "https://pravasith.com")
                .replace("DEV_ROLE", hiringRole)
                .replace("COMPANY_NAME", hiringCompany)
                .replace("JOB_PORTAL", jobPortal);

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
