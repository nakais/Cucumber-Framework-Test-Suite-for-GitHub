package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LandingPage {
   //@FindBy(className = "form-control")
    //List<WebElement> fieldSearch;
    @FindBy(name = "q")
    WebElement fieldSearch;
    @FindBy(xpath = "//ul[@class='repo-list']//a[@href='/facebook/create-react-app']")
    WebElement firstResult;

    @FindBy(xpath = "//a[contains(text(),'About')]")
    WebElement searchAbout;
    @FindBy(xpath = "//h1[contains(text(),\"Let's build from here\")]")
    WebElement headingAbout;
    public LandingPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void doSearch(String searchData) throws InterruptedException {
        fieldSearch.click();
        fieldSearch.sendKeys(searchData);
        Thread.sleep(1500);
        fieldSearch.sendKeys(Keys.ENTER);
    }
    public String setFirstResult() throws InterruptedException {
        Thread.sleep(1500);
        return firstResult.getText();
    }
    public void clickOnAbout(){
        searchAbout.click();
    }
    public String assertAboutHeading() throws InterruptedException {
        Thread.sleep(1500);
        return headingAbout.getText();
    }


}
