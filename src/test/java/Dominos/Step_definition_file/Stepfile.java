package Dominos.Step_definition_file;

import base.baseclass.base_class_fie;
import base.pom.Home_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Stepfile extends base_class_fie {
    public static Home_Page home_page = new Home_Page();

    @Given("user opens the {string} and Login to the Dominos website")
    public void user_opens_the_and_login_to_the_dominos_website(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions chromeoption1 = new ChromeOptions();
            chromeoption1.addArguments("incognito");
            driver = new ChromeDriver(chromeoption1);
        } else if (browser.equalsIgnoreCase("firefox")) {
            FirefoxOptions fire = new FirefoxOptions();
            fire.addArguments("private");
            driver = new FirefoxDriver(fire);
        } else if (browser.equalsIgnoreCase("edge")) {
            EdgeOptions edge = new EdgeOptions();
            edge.addArguments("Inprivate");
            driver = new EdgeDriver(edge);
        }
        driver.get("https://www.dominos.co.in/");
        log("Dominos page launched ");
        Maximize(driver);
    }

    @When("user enter the address and select the first suggestion")
    public void user_enter_the_address_and_select_the_first_suggestion() {
        driver.findElement(home_page.order_Online).click();
        log("order online button clicked");
        explixitwait(driver.findElement(home_page.dont_allow_button), driver);
        driver.findElement(home_page.dont_allow_button).click();
        driver.findElement((home_page.address)).click();
        quit();
    }

    @When("user add the Farmhouse {string} and count {string} in the cartitems")
    public void user_add_the_farmhouse_and_count_in_the_cartitems(String string, String string2) {
    }

    @When("user add the Margherita {string} and count {string} in the cartitems")
    public void user_add_the_margherita_and_count_in_the_cartitems(String string, String string2) {
    }

    @When("user add the Peppy Paneer {string} and count {string} in the cartitems")
    public void user_add_the_peppy_paneer_and_count_in_the_cartitems(String string, String string2) {
    }

    @Then("user check the cart subtotal")
    public void user_check_the_cart_subtotal() {
    }

    @Then("user add the beverage {string} and count {string} in the cartitems")
    public void user_add_the_beverage_and_count_in_the_cartitems(String string, String string2) {

    }

    @Then("user remove {string} the qty of Margherita {string}")
    public void user_remove_the_qty_of_margherita(String string, String string2) {

    }

    @Then("user remove {string} the qty of beverage {string}")
    public void user_remove_the_qty_of_beverage(String string, String string2) {

    }

    @Then("user get the subtotal and click checkout")
    public void user_get_the_subtotal_and_click_checkout() {
    }

}
