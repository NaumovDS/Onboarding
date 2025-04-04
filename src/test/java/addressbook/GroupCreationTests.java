package addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GroupCreationTests {
  ChromeDriver wd;

  @BeforeMethod
  public void setUp() throws Exception {
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    login();
  }

  private void login() {
    wd.get("https://www.saucedemo.com/");
    wd.findElement(By.id("user-name")).click();
    wd.findElement(By.id("user-name")).clear();
    wd.findElement(By.id("user-name")).sendKeys("standard_user");
    wd.findElement(By.id("password")).click();
    wd.findElement(By.id("password")).clear();
    wd.findElement(By.id("password")).sendKeys("secret_sauce");
    wd.findElement(By.id("login-button")).click();
  }

  @Test
  public void buyItem() {
    addItemInCart();
    goToCart();
    submitOrder();
    fillPersonalCard();
    submitPersonalCard();
    wd.findElement(By.id("finish")).click();
    wd.findElement(By.id("back-to-products")).click();
  }

  private void submitPersonalCard() {
    wd.findElement(By.id("continue")).click();
  }

  private void fillPersonalCard() {
    wd.findElement(By.id("first-name")).click();
    wd.findElement(By.id("first-name")).clear();
    wd.findElement(By.id("first-name")).sendKeys("Ivan");
    wd.findElement(By.id("last-name")).click();
    wd.findElement(By.id("last-name")).clear();
    wd.findElement(By.id("last-name")).sendKeys("Ivanov");
    wd.findElement(By.id("postal-code")).click();
    wd.findElement(By.id("postal-code")).clear();
    wd.findElement(By.id("postal-code")).sendKeys("410064");
  }

  private void submitOrder() {
    wd.findElement(By.id("checkout")).click();
  }

  private void goToCart() {
    wd.findElement(By.className("shopping_cart_container")).click();
  }

  private void addItemInCart() {
    wd.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
  }

  @AfterMethod
  public void tearDown() {
    wd.quit();
  }

  public static boolean isAlertPresent(ChromeDriver wd) {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }
}
