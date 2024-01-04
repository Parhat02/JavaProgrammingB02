package week10.day31_inheritance.day31Tasks.browserTask;

public class Browser {

    private String browserName;

    public String getBrowserName() {
        return browserName;
    }

    public void setBrowserName(String browserName) {
        this.browserName = browserName;
    }

    public void openBrowser(){
        System.out.println("Opening " + browserName + " browser.");
    }

    public void closeBrowser(){
        System.out.println("Closing " + browserName + " browser.");
    }
}
