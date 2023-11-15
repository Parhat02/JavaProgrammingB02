package week01.week01_review;

public class Review_Task {
    public static void main(String[] args) {

        // Email Generator
        String firstName = "James";
        int birthYear = 1995;
        String emailName = firstName.toLowerCase()+ "_"+birthYear;
        String gmailAddress = "Gmail : "+ emailName +"@gmail.com";
        String yahooAddress = "Yahoo : "+ emailName +"@yahoo.com";
        String outlookAddress = "Outlook : "+ emailName +"@outlook.com";
        String hotmailAddress = "Hotmail : "+ emailName +"@hotmail.com";
        System.out.println(gmailAddress);
        System.out.println(yahooAddress);
        System.out.println(outlookAddress);
        System.out.println(hotmailAddress);
        System.out.println("Your generated emails are: \n\t"+gmailAddress+"\n\t"+yahooAddress+"\n\t"+outlookAddress+
                "\n\t"+hotmailAddress);

    }
}
