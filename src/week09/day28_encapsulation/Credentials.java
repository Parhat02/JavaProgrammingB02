package week09.day28_encapsulation;

public class Credentials {
    private String username, passWord;

    public Credentials() {
    }

    public Credentials(String username, String passWord) {
        setUsername(username);
        setPassWord(passWord);
//        this.username = username;
//        this.passWord = passWord;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        boolean isStrongPassWord = isStrongPassWord(passWord);
        if (!isStrongPassWord){
            System.err.println("The password MUST be a strong password");
            System.exit(1);
        }
        this.passWord = passWord;
    }

    public boolean isStrongPassWord(String passWord){
        boolean hasSpecialChar = false;
        boolean hasDigit = false;
        boolean hasCapitalLetter = false;
        boolean noSpace = true;
        for (char a : passWord.toCharArray()){
            if (Character.isLetter(a) && Character.isUpperCase(a)){
                hasCapitalLetter = true;
            }
            if (Character.isDigit(a)){
                hasDigit = true;
            }
            if (!Character.isLetterOrDigit(a)){
                hasSpecialChar = true;
            }
            if (a ==' '){
                noSpace = false;
                System.err.println("Should not contain space");
                System.exit(1);
            }
            if (passWord.length() < 8){
                System.err.println("The password MUST be at least eight characters long");
                System.exit(1);
            }
        }
        return hasDigit && hasCapitalLetter && hasSpecialChar;
    }

    @Override
    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
