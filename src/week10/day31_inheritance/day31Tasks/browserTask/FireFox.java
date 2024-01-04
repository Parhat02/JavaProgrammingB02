package week10.day31_inheritance.day31Tasks.browserTask;

public class FireFox extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("Opening FireFox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing FireFox browser");
    }
}
