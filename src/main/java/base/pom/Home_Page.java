package base.pom;

import org.openqa.selenium.By;

public class Home_Page {
    public By order_Online = By.xpath("//button[text()='ORDER ONLINE NOW']");
    public By dont_allow_button = By.xpath("//button[text()=\"Don't Allow\"]");
    public By address = By.xpath("//input[@placeholder='Enter your delivery address']");

}
