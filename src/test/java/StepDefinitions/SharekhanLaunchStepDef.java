package StepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



public class SharekhanLaunchStepDef {

	ChromeDriver driver;
	Locatable item;
	Coordinates cord;

	@Given("^I open chrome$")
	public void i_open_chrome() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/Rohini/Documents/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Then("^I entered url as \"(.*?)\" in browser$")
	public void i_entered_url_as_in_browser(String url) throws Throwable {
		driver.get(url);
	}

	@Then("^I verify Title and Menu Items$")
	public void i_verify_Title_and_Menu_Items() throws Throwable {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expTitle = "Sharekhan";

		if (actualTitle.contains(expTitle)) {
			System.out.println("Title is verified");
		} else {
			System.out.println("Wrong title");
		}

		try {
			driver.findElement(By.xpath("/html/body/div[3]/div[1]/header/nav")).isDisplayed();
			System.out.println("Sharekhan Menu verified");
		} catch (Exception e) {
			System.out.println("Sharekhan Menu not verified");

		}

	}

	@Then("^I verify Lgin/Trade button$")
	public void i_verify_Lgin_Trade_button() throws Throwable {
		try {
			driver.findElement(By.xpath("/html/body/div[3]/div[1]/header/div/div[2]/div[2]/div/ul/li[1]/a[1]"))
					.isDisplayed();
			System.out.println("Login/Trade button verified");
		} catch (Exception e) {
			System.out.println("Login/Trade button not verified");

		}
	}

	@Then("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
		Thread.sleep(3000);
		driver.close();
	}

	@Then("^I click on main menu$")
	public void i_click_on_main_menu() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/header/div/div[2]/div[2]/ul/li[7]/a/img")).click();
		try {
			driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/div/ul[1]/li[1]/a")).isDisplayed();
			System.out.println("Trade button Verified");
		} catch (Exception e) {
			System.out.println("Trade button not Verified");

		}
	}

	@Then("^I verify Main menu options$")
	public void i_verify_Main_menu_options() throws Throwable {
		try {
			driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/div")).isDisplayed();
			System.out.println("Main menu options Verified");
		} catch (Exception e) {
			System.out.println("Main menu options not Verified");

		}
		try {
			driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/div/ul[3]/li[7]/a")).isDisplayed();
			System.out.println("one of Main menu options Verified");
		} catch (Exception e) {
			System.out.println("one of Main menu options not Verified");

		}

	}

	@Then("^I Mouse hover on Market,New to Market$")
	public void i_Mouse_hover_on_Market_New_to_Market() throws Throwable {
		EventFiringWebDriver webdriver = new EventFiringWebDriver(driver);
		ListenerCode listener = new ListenerCode();
		EventFiringMouse mouse = new EventFiringMouse(driver, listener);
		driver.manage().window().maximize();
		try {
			item = (Locatable) driver.findElement(By.xpath("/html/body/div[3]/div[1]/header/nav/ul/li[1]/a"));
			cord = item.getCoordinates();
			mouse.mouseMove(cord);
			Thread.sleep(2000);
			System.out.println("Market menu Mouse hover Verified");
		} catch (Exception e) {
			System.out.println("Market menu Mouse hover Not Verified");
		}
		try {
			item = (Locatable) driver.findElement(By.xpath("/html/body/div[3]/div[1]/header/nav/ul/li[2]/a"));
			cord = item.getCoordinates();
			mouse.mouseMove(cord);
			System.out.println("New to Market menu Mouse hover Verified");
		} catch (Exception e) {
			System.out.println("New to Market menu Mouse hover Not Verified");
		}

	}

	@Then("^I mouse Hover on Super Investor and Active trader$")
	public void i_mouse_Hover_on_Super_Investor_and_Active_trader() throws Throwable {
		EventFiringWebDriver webdriver = new EventFiringWebDriver(driver);
		ListenerCode listener = new ListenerCode();
		EventFiringMouse mouse = new EventFiringMouse(driver, listener);
		driver.manage().window().maximize();
		try {
			item = (Locatable) driver.findElement(By.xpath("/html/body/div[3]/div[1]/header/nav/ul/li[3]/a"));
			cord = item.getCoordinates();
			mouse.mouseMove(cord);
			Thread.sleep(2000);
			System.out.println("Super Investor Mouse hover Verified");
		} catch (Exception e) {
			System.out.println("Super Investor Mouse hover Not Verified");
		}
		try {
			item = (Locatable) driver.findElement(By.xpath("/html/body/div[3]/div[1]/header/nav/ul/li[4]/a"));
			cord = item.getCoordinates();
			mouse.mouseMove(cord);
			System.out.println("Active trader Mouse hover Verified");
		} catch (Exception e) {
			System.out.println("Active trader Mouse hover Not Verified");
		}
	}

	@Then("^I verify Super Investor and Active trader menu options$")
	public void i_verify_Super_Investor_and_Active_trader_menu_options() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^I verify Market,new to market menu options$")
	public void i_verify_Market_new_to_market_menu_options() throws Throwable {
		boolean b = driver
				.findElement(By.xpath("/html/body/div[3]/div[1]/header/nav/ul/li[1]/div/div/div[1]/ul/li[1]/a"))
				.isDisplayed();
		System.out.println("market summary verified" + b);
	}

	@Then("^I Entered loginid$")
	public void i_Entered_loginid() throws Throwable {
		driver.get("https://newtrade.sharekhan.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[2]/div/loginpage/div/div/div/div/div/div/div[2]/div[1]/form/md-input/span/input"))
				.sendKeys("3002828");
		Thread.sleep(2000);
		// driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/loginpage/div/div/div/div/div/div/div[2]/div[1]/form/md-input/span/input")).sendKeys("3002828");
	}

	@Then("^I click on next and entered password as \"(.*?)\"$")
	public void i_click_on_next_and_entered_password_as(String password) throws Throwable {
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[2]/div/loginpage/div/div/div/div/div/div/div[2]/div[1]/form/div/button"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[2]/div/loginpage/div/div/div/div/div/div/div[2]/div/div[1]/div[1]/form/md-input/span/input"))
				.sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[2]/div/loginpage/div/div/div/div/div/div/div[2]/div/div[1]/div[1]/form/div[4]/div/button"))
				.click();
	}

	@Then("^I entered url$")
	public void i_entered_url() throws Throwable {
		driver.get("https://www.sharekhan.com/");
	}

	@Then("^I Click on login button$")
	public void i_Click_on_login_button() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/header/div/div[2]/ul/li[3]/a[1]")).click();
		Thread.sleep(5000);
	}

	@Then("^I entered loginid$")
	public void i_entered_loginid() throws Throwable {
		driver.findElement(By.xpath("//div[@class='modal-body']")).findElement(By.name("emailLoginId"))
				.sendKeys("abcd");
	}

	@Then("^I click on next$")
	public void i_click_on_next() throws Throwable {
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[2]/div/loginpage/div/div/div/div/div/div/div[2]/div[1]/form/div/button"))
				.click();
	}

	@Then("^I verify All menus$")
	public void i_verify_All_menus() throws Throwable {
		boolean b = driver.findElement(By.xpath("/html/body/nav-menu/div/div/div/div/nav/ul/li[1]/a")).isEnabled();
		System.out.println("Portfolio menu is highlighted:" + b);
		List<WebElement> menus = driver.findElements(By.cssSelector("#menu"));
		for (WebElement verify : menus) {
			if (verify.isDisplayed()) {
				System.out.println("sharekhan menus verified");
			}
			// #menu

		}

	}
}
