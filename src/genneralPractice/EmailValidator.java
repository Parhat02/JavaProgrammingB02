package genneralPractice;

import java.util.Scanner;

public class EmailValidator {

    public static void main(String[] args) {

        boolean correctEmail;

        Scanner input = new Scanner(System.in);
        String email;

        do {
            System.out.println("Enter you email address: ");
            email = input.nextLine();

            char[] arr = email.toCharArray();

            int count = 0;
            for (char c : arr) {
                if (c == '@') {
                    count++;
                }
            }
            if (count != 1) {
                System.err.println("Invalid Email address, only one or at least one '@' should be contained in the email address");
                System.out.println("Invalid Email address, Try Again!");
                correctEmail = false;
                continue;
            }

            int indexOfAt = email.indexOf("@");
            String emailName = email.substring(0, indexOfAt);
            System.out.println("emailName = " + emailName);
            if (emailName.isEmpty() || emailName.isBlank()) {
                System.err.println("Invalid Email address, You do not have a proper email name");
                System.out.println("Invalid Email address, Try Again!");
                correctEmail = false;
                continue;
            }

            String domain = email.substring(indexOfAt + 1);
            System.out.println("domain = " + domain);
            if (!domain.contains(".")) {
                System.err.println("Invalid Email address, at least one dot should be contained in the email address");
                System.out.println("Invalid Email address, Try Again!");
                correctEmail = false;
                continue;
            }

            int indexOfDot = domain.indexOf(".");
            String domainName = domain.substring(0, indexOfDot);
            System.out.println("domainName = " + domainName);
            if (domainName.isBlank() || domainName.isEmpty()) {
                System.err.println("Invalid Email address, You do not have a proper domain name");
                System.out.println("Invalid Email address, Try Again!");
                correctEmail = false;
                continue;
            }

            String topLevelDomain = domain.substring(indexOfDot + 1);
            System.out.println("topLevelDomain = " + topLevelDomain);
            if (topLevelDomain.isEmpty() || topLevelDomain.isBlank()) {
                System.err.println("Invalid Email address, You do not have a proper top-level domain name");
                System.out.println("Invalid Email address, Try Again!");
                correctEmail = false;
                continue;
            }

            correctEmail=true;

        } while (!correctEmail);

        System.out.println("You entered a valid email address : " + email);

        input.close();

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter you email address: ");
//        String email = input.nextLine();
//
//        char[] arr = email.toCharArray();
//
//        int count=0;
//        for (char c : arr) {
//            if (c == '@'){
//                count++;
//            }
//        }
//        if (count != 1){
//            throw new RuntimeException("Invalid Email address, only one or at least one '@' should be contained in the email address");
//        }
//
//        int indexOfAt = email.indexOf("@");
//        String emailName = email.substring(0, indexOfAt);
//        System.out.println("emailName = " + emailName);
//        if (emailName.isEmpty()||emailName.isBlank()){
//            throw new RuntimeException("Invalid Email address, You do not have a proper email name");
//        }
//
//        String domain = email.substring(indexOfAt+1);
//        System.out.println("domain = " + domain);
//        if (!domain.contains(".")){
//            throw new RuntimeException("Invalid Email address, at least one dot should be contained in the email address");
//        }
//
//        int indexOfDot = domain.indexOf(".");
//        String domainName = domain.substring(0,indexOfDot);
//        System.out.println("domainName = " + domainName);
//        if (domainName.isBlank() || domainName.isEmpty()){
//            throw new RuntimeException("Invalid Email address, You do not have a proper domain name");
//        }
//
//        String topLevelDomain = domain.substring(indexOfDot+1);
//        System.out.println("topLevelDomain = " + topLevelDomain);
//        if (topLevelDomain.isEmpty()||topLevelDomain.isBlank()){
//            throw new RuntimeException("Invalid Email address, You do not have a proper top-level domain name");
//        }
//
//        System.out.println("You entered a valid email address : " + email);
    }
}
