package com.syntax.class27;

public class FirefoxDriver implements WebDriver {
    @Override
    public void openBrowser() {
        System.out.println("Open firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close firefox browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize firefox window");
    }

    @Override
    public void findElement() {
        System.out.println("Find element");
    }
}
