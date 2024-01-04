package week10.day31_inheritance.day31Tasks.browserTask;

public class Safari extends Browser {

    @Override
    public void openBrowser() {
        System.out.println("Opening Safari browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Safari browser");
    }
}

