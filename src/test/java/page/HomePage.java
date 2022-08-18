package page;

import base.BaseBlaze;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BaseBlaze {
    @FindBy (css = "[class=\"nav-link\"][data-toggle=\"modal\"][data-target=\"#exampleModal\"]")
    WebElement contact;
    @FindBy (id="recipient-email")
    WebElement email;
    @FindBy (id="recipient-name")
    WebElement name;
    @FindBy (id="message-text")
    WebElement message;
    @FindBy (xpath = "//*[contains(text(),\"Send message\")]")
    WebElement send;
    @FindBy (xpath = "//*[@id=\"exampleModal\"]/div/div/div[3]/button[1]")
    WebElement close;
    @FindBy (xpath = "//*[@id=\"exampleModal\"]/div/div/div[1]/button/span")
    WebElement X;
    @FindBy (css = "[class=\"nav-link\"][href=\"index.html\"]")
    WebElement home;

    public HomePage () {
        PageFactory.initElements(driver, this);
    }
    public HomePage clickContact() {
        wdWait.until(ExpectedConditions.elementToBeClickable(contact));
        contact.click();
        return this;
    }




    public HomePage inputEmail (String x) {
        wdWait.until(ExpectedConditions.elementToBeClickable(email));
        email.clear();
        email.sendKeys(x);
        return this;
    }
    public HomePage inputName (String x) {
        wdWait.until(ExpectedConditions.elementToBeClickable(name));
        name.clear();
        name.sendKeys(x);
        return this;

    }
    public void inputMessage (String x) {
        wdWait.until(ExpectedConditions.elementToBeClickable(message));
        message.clear();
        message.sendKeys(x);

    }

    public void clickSend () {
        wdWait.until(ExpectedConditions.elementToBeClickable(send));
        send.click();

    }
    public void clickClose () {
        wdWait.until(ExpectedConditions.elementToBeClickable(close));
        close.click();
    }
    public void clickX () {
        wdWait.until(ExpectedConditions.elementToBeClickable(X));
        X.click();
    }

    public String moveToBannerText () {
       return driver.switchTo().alert().getText();

    }
    public boolean isHomeDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(home));
        return home.isDisplayed();
    }
    public String homeText () {
        wdWait.until(ExpectedConditions.elementToBeClickable(home));
        return home.getText();

    }




}
