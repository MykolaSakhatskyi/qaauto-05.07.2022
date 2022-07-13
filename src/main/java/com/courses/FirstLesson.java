package com.courses;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

public class FirstLesson {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement userNameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        String getAllLoginCredentials = driver.findElement(By.id("login_credentials")).getText();
        String[] splitLoginCredentials = getAllLoginCredentials.split("\n");
        String getPasswordCredentials = driver.findElement(By.className("login_password")).getText();
        String[] splitPasswordCredentials = getPasswordCredentials.split("\n");

        userNameField.sendKeys(splitLoginCredentials[1]);
        passwordField.sendKeys(splitPasswordCredentials[1]);
        loginButton.click();

        WebElement addToCardButtonSauceLabsBikeLight = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        WebElement sortingDropdownButton = driver.findElement(By.className("product_sort_container"));
        WebElement sortingFromZtoA = driver.findElement(By.xpath("//option[@value='za']"));

        WebElement burgerMenuButton = driver.findElement(By.id("react-burger-menu-btn"));
        WebElement logOutButton = driver.findElement(By.id("about_sidebar_link"));

        addToCardButtonSauceLabsBikeLight.click();
        sortingDropdownButton.click();
        sortingFromZtoA.click();
        WebElement addToCartSauceLabsFleeceJacket = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
        addToCartSauceLabsFleeceJacket.click();
        burgerMenuButton.click();
        logOutButton.click();


        driver.quit();
    }
}
