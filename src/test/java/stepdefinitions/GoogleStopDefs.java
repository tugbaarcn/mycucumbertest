package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.Driver;

public class GoogleStopDefs {
    GooglePage googlePage = new GooglePage();
    @Given("user is on the google page")
    public void user_is_on_the_google_page() {
        //Our JAVA Logic Goes Here
        //THIS IS SAME AS @Test In JUnit or testNG

        Driver.getDriver().get("https://www.google.com");
        try {
            Driver.getDriver().findElement(By.id("L2AGLb")).click();
        }catch (Exception e){

        }
    }
    @When("user search for iphone on google")
    public void user_search_for_iphone_on_google() {
        googlePage.googleSearchBox.sendKeys("Iphone"+ Keys.ENTER);

    }
    @Then("verify the result has iPhone related results")
    public void verify_the_result_has_i_phone_related_results() {
        String title = Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains("Iphone"));


    }
    @When("user search for Tea Pot on google")
    public void user_search_for_tea_pot_on_google() {
        googlePage.googleSearchBox.sendKeys("Tea Pot" + Keys.ENTER);

    }
    @Then("verify the result has Tea Pot related results")
    public void verify_the_result_has_tea_pot_related_results() {
        String title = Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains("Tea Pot"));

    }
    @When("user search for flower on google")
    public void user_search_for_flower_on_google() {
        googlePage.googleSearchBox.sendKeys("flower"+Keys.ENTER);

    }
    @Then("verify the result has flower related")
    public void verify_the_result_has_flower_related_results() {
        String title = Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains("flower"));

    }
}