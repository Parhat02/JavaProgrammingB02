package week10.day31_inheritance.day31Tasks.browserTask;

public class ChromeBrowser extends Browser{


    @Override
    public void openBrowser() {
        System.out.println("Opening chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing chrome browser");
    }
}
