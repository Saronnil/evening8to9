package Framework;

public enum BrowserTypes {
    CHROME ("chrome"),
    FIREFOX ("firefox"),
    EDGE ("edge"),
    SAFARI ("safari");

    private String browser;
    BrowserTypes(String browser){
        this.browser = browser;
    }

    public String getBrowser(){
        return browser;
    }
}

