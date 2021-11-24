package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefAss19to25 {
	WebDriver driver;

	@Given("^User is on home page after login$")
	public void user_is_on_home_page_after_login() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/Rohini/Documents/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://newtrade.sharekhan.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[2]/div/loginpage/div/div/div/div/div/div/div[2]/div[1]/form/md-input/span/input"))
				.sendKeys("30028");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[2]/div/loginpage/div/div/div/div/div/div/div[2]/div[1]/form/div/button"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[2]/div/loginpage/div/div/div/div/div/div/div[2]/div/div[1]/div[1]/form/md-input/span/input"))
				.sendKeys("Banga");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[2]/div/loginpage/div/div/div/div/div/div/div[2]/div/div[1]/div[1]/form/div[4]/div/button"))
				.click();
		Thread.sleep(2000);

	}

	@Then("^user verify MyWatchList tooltip$")
	public void user_verify_MyWatchList_tooltip() throws Throwable {
		String expectedTooltip = "MyWatchlist";

		// Find the age field
		WebElement ele = driver.findElement(By.id("watchlist"));
		;

		// get the value of the "title" attribute
		String actualTooltip = ele.getAttribute("title");

		// Comparing tooltip’s value with expected value
		System.out.println("Actual Title of Tool Tip:" + actualTooltip);
		if (actualTooltip.equals(expectedTooltip)) {
			System.out.println("Test Case Passed:My watchlist tooltip verified");
		}
		Thread.sleep(3000);
	}

	@Then("^user verify MyPortfolio tooltip$")
	public void user_verify_MyPortfolio_tooltip() throws Throwable {
		String expectedTooltip = "MyPortfolio";

		// Find the age field
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"Portfolio\"]/a"));

		// get the value of the "title" attribute
		String actualTooltip = ele.getAttribute("title");

		// Comparing tooltip’s value with expected value
		System.out.println("Actual Title of Tool Tip:" + actualTooltip);
		if (actualTooltip.equals(expectedTooltip)) {
			System.out.println("Test Case Passed:MyPortfolio tooltip verified");
		}
		Thread.sleep(3000);
	}

	@Then("^user verify Investment cart$")
	public void user_verify_Investment_cart() throws Throwable {
		String expectedTooltip = "Investment Cart";

		// Find the age field
		WebElement ele = driver.findElement(By.id("investmentCart"));
		;

		// get the value of the "title" attribute
		String actualTooltip = ele.getAttribute("title");

		// Comparing tooltip’s value with expected value
		System.out.println("Actual Title of Tool Tip:" + actualTooltip);
		if (actualTooltip.equals(expectedTooltip)) {
			System.out.println("Test Case Passed:Investment Cart tooltip verified");
		}
	}

	@Then("^user verified Alert$")
	public void user_verified_Alert() throws Throwable {
		String expectedTooltip = "Alert";

		// Find the age field
		WebElement ele = driver
				.findElement(By.xpath("/html/body/page-header/div/nav/div[1]/div[1]/div[2]/div[2]/ul/li[6]/a"));

		// get the value of the "title" attribute
		String actualTooltip = ele.getAttribute("title");

		// Comparing tooltip’s value with expected value
		System.out.println("Actual Title of Tool Tip:" + actualTooltip);
		if (actualTooltip.equals(expectedTooltip)) {
			System.out.println("Test Case Passed:Alert tooltip verified");
		}
	}

	@Then("^user clicked on Trade now button$")
	public void user_clicked_on_Trade_now_button() throws Throwable {
		driver.findElement(By.xpath("//span[text()='TRADE NOW']")).click();
		Thread.sleep(2000);

	}

	@Then("^user searched and selects Opto Circuits scrip$")
	public void user_searched_and_selects_Opto_Circuits_scrip() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"scripSearchTrade\"]/md-input/span/input")).sendKeys("optocircui");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/ul/li/a")).click();
		Thread.sleep(2000);
	}

	@Then("^user entered values in all fields with sell$")
	public void user_entered_values_in_all_fields_with_sell() throws Throwable {
		driver.findElement(By.xpath(
				"/html/body/div[3]/ui-view/ui-view/orderwidget/div/div[2]/div[1]/div[1]/div[1]/div/form/div[1]/div/div[1]/div[1]/md-input/span/select"))
				.click();
		Thread.sleep(2000);
		Select dropBuySell = new Select(driver.findElement(By.xpath(
				"/html/body/div[3]/ui-view/ui-view/orderwidget/div/div[2]/div[1]/div[1]/div[1]/div/form/div[1]/div/div[1]/div[1]/md-input/span/select")));
		dropBuySell.selectByVisibleText("Sell");
		System.out.println("insufficient sell quantity");
		Thread.sleep(2000);
	}

	@Then("^user entered values in all fields$")
	public void user_entered_values_in_all_fields() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.id("qty")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("qty")).sendKeys("1");
		Thread.sleep(2000);

	}

	@Then("^user click on place order$")
	public void user_click_on_place_order() throws Throwable {
		driver.findElement(By.xpath(
				"/html/body/div[3]/ui-view/ui-view/orderwidget/div/div[2]/div[1]/div[1]/div[1]/div/form/div[3]/button[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.name("tr_pwd")).sendKeys("Reyaan@2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()='Confirm Order']")).click();
//		Thread.sleep(2000);

	}

	@Then("^user click on place buy order$")
	public void user_click_on_place_buy_order() throws Throwable {
		driver.findElement(By.xpath(
				"/html/body/div[3]/ui-view/ui-view/orderwidget/div/div[2]/div[1]/div[1]/div[1]/div/form/div[3]/button[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.name("tr_pwd")).sendKeys("Reyaan@2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Confirm Order']")).click();
		Thread.sleep(2000);

	}
	@Then("^user click on place sell order$")
	public void user_click_on_place_sell_order() throws Throwable {
		driver.findElement(By.xpath(
				"/html/body/div[3]/ui-view/ui-view/orderwidget/div/div[2]/div[1]/div[1]/div[1]/div/form/div[3]/button[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.name("tr_pwd")).sendKeys("Reyaan@2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(3000);
		driver.quit();
//		driver.findElement(By.xpath("//span[text()='Confirm Order']")).click();
//		Thread.sleep(2000);

	}

	@Then("^user validate all fields$")
	public void user_validate_all_fields() throws Throwable {
		String ScripName = driver.findElement(By.xpath("//td[text()='OPTOCIRCUI']")).getText();

		String requestTYpe = driver.findElement(By.xpath("//td[text()='NEW']")).getText();
		String buySell = driver.findElement(By.xpath("//td[text()='Buy']")).getText();
		String quantity = driver.findElement(By.xpath("//td[text()='1']")).getText();
		if (ScripName.equals("OPTOCIRCUI") && requestTYpe.equals("NEW") && buySell.equals("Buy")
				&& quantity.equals("1")) {
			System.out.println(
					"Order fields Scrip name,Request type ,Buy or SEll,Quanity if confirm oredr is matched with Order fields");

		}
		Thread.sleep(2000);

	}

	@Then("^User signed out of application$")
	public void user_signed_out_of_application() throws Throwable {
		driver.findElement(By.xpath("/html/body/page-header/div/nav/div[2]/div/div/div/div[2]/ul/li[3]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/button[2]")).click();
		Thread.sleep(3000);
		driver.quit();
	}

	@Then("^user clicked detailed view of portfolio$")
	public void user_clicked_detailed_view_of_portfolio() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		js.executeScript("window.scrollBy(0,1000)");
		// driver.findElement(By.xpath("//*[@id=\"menu\"]/div/nav/ul/li[1]/a/span")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/ui-view/div/div[2]/div[1]/div[2]/span[1]")).click();
		System.out.println("detailed portfolio page is displayed");
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(2000);
	}

	@Then("^user renamed the virtual portfoilo$")
	public void user_renamed_the_virtual_portfoilo() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[3]/ui-view/div/div/div/div/div[1]/ul/li[3]")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/div[3]/ui-view/div/div/div/div/div[1]/ul/li[4]")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Rename Portfolio']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/form/md-input/span/input")).sendKeys("demo");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/form/div[2]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/form/div[2]/button[2]")).click();

		Thread.sleep(2000);
		String renamedPortfolio = driver.findElement(By.xpath("//li[text()='demo']")).getText();
		if (renamedPortfolio.equals("demo")) {
			System.out.println("virtual portfoilo renamed successfully");
		} else {
			System.out.println("virtual portfoilo not  renamed successfully");
		}

	}

	@Then("^user clicked on the Marketwatch menu$")
	public void user_clicked_on_the_Marketwatch_menu() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"menu\"]/div/nav/ul/li[3]")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/div[3]/ui-view/ui-view/my-watchlist/div/div[2]/ul/li[1]/div/md-input/span/select"))
				.click();
		Thread.sleep(2000);
	}

	@Then("^user renamed a watchlist$")
	public void user_renamed_a_watchlist() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[3]/ui-view/ui-view/my-watchlist/div/div[1]/ul/li[14]/span"))
				.click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/div[3]/ui-view/ui-view/my-watchlist/div/div[1]/ul/li[14]/ul/li[3]/a/span"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/form/md-input[2]/span/input"))
				.sendKeys("demo");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/form/button[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/form/button[3]")).click();
		Thread.sleep(2000);
	}

	@Then("^user verified renamed watchlist$")
	public void user_verified_renamed_watchlist() throws Throwable {
		String renamedWatchlist = driver.findElement(By.xpath("//option[text()='DEMO']")).getText();
		if (renamedWatchlist.equals("DEMO")) {
			System.out.println("watchlist renamed successfully");
		} else {
			System.out.println("watchlist not  renamed successfully");
		}
	}

	@Then("^user searched and selects idea scrip$")
	public void user_searched_and_selects_idea_scrip() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"scripSearchTrade\"]/md-input/span/input")).sendKeys("idea");
		Thread.sleep(2000);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/ul/li/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"qty\"]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("1");
	}

	@Then("^user entered limit price to buy scrip$")
	public void user_entered_limit_price_to_buy_scrip() throws Throwable {
		driver.findElement(By.xpath(
				"/html/body/div[3]/ui-view/ui-view/orderwidget/div/div[2]/div[1]/div[1]/div[1]/div/form/div[1]/div/div[1]/div[3]/md-input/span/input"))
				.clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[3]/ui-view/ui-view/orderwidget/div/div[2]/div[1]/div[1]/div[1]/div/form/div[1]/div/div[1]/div[3]/md-input/span/input"))
				.sendKeys("10.50");
		Thread.sleep(2000);
		Select validity = new Select(driver.findElement(By.xpath("//*[@id=\"validityTrade\"]/md-input/span/select")));
		validity.selectByVisibleText("IOC");
		System.out.println("limit price for immediate or cancel order (IOC) is selected");
		Thread.sleep(2000);
	}

	@Then("^user entered limit price to sell scrip$")
	public void user_entered_limit_price_to_sell_scrip() throws Throwable {
		driver.findElement(By.xpath(
				"/html/body/div[3]/ui-view/ui-view/orderwidget/div/div[2]/div[1]/div[1]/div[1]/div/form/div[1]/div/div[1]/div[3]/md-input/span/input"))
				.clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[3]/ui-view/ui-view/orderwidget/div/div[2]/div[1]/div[1]/div[1]/div/form/div[1]/div/div[1]/div[3]/md-input/span/input"))
				.sendKeys("10.70");
		Thread.sleep(2000);
		Select dropBuySell = new Select(driver.findElement(By.xpath(
				"/html/body/div[3]/ui-view/ui-view/orderwidget/div/div[2]/div[1]/div[1]/div[1]/div/form/div[1]/div/div[1]/div[1]/md-input/span/select")));
		dropBuySell.selectByVisibleText("Sell");
		System.out.println("insufficient sell quantity");
		Thread.sleep(2000);
		Select validity = new Select(driver.findElement(By.xpath("//*[@id=\"validityTrade\"]/md-input/span/select")));
		validity.selectByVisibleText("IOC");
		System.out.println("limit price for immediate or cancel order (IOC) is selected");
		Thread.sleep(2000);

	}
}
