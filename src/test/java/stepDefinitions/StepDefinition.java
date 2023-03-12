package stepDefinitions;

import io.cucumber.java.After;
import org.junit.Assert;
import pages.LandingPage;
import setup.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Setup {

    LandingPage landingPage;
    @Given("I am on the GitHub homepage")
    public void i_am_on_the_github_homepage() {
        driver.get("https://github.com/");
    }
    @When("I search for {string}")
    public void i_search_for(String searchData) throws InterruptedException {
        landingPage = new LandingPage(driver);
        landingPage.doSearch(searchData);
    }
    @Then("I should see {string} as the first result")
    public void i_should_see_as_the_first_result(String expectedTitle) throws InterruptedException {
        landingPage = new LandingPage(driver);
        String actualTitle = landingPage.setFirstResult();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        driver.close();
    }


    @When("I click the \"About\" link in the footer")
    public void i_click_the_link_in_the_footer() {
        landingPage = new LandingPage(driver);
        landingPage.clickOnAbout();
    }
    @Then("I should be on the GitHub About page")
    public void i_should_be_on_the_git_hub_about_page() throws InterruptedException {
        landingPage = new LandingPage(driver);
        String actualTitle  = landingPage.assertAboutHeading();
        String expectedTitle = "Let's build from here";
        Assert.assertEquals(expectedTitle, actualTitle);
        driver.close();

    }

}
