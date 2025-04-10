package Framework;

public enum BrowserTypes {
    CHROME ("chrome"),
    FIREFOX ("firefox"),
    EDGE ("edge"),
    SAFARI ("safari");

    private final String browser;
    BrowserTypes(String browser){
        this.browser = browser;
    }

    public String getBrowser(){
        return browser;
    }
}

