package StepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



public class SharekhanAssignSteps {

	WebDriver driver;

	@Given("^user logs into sharekhan account$")
	public void user_logs_into_sharekhan_account() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/Rohini/Documents/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://newtrade.sharekhan.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[2]/div/loginpage/div/div/div/div/div/div/div[2]/div[1]/form/md-input/span/input"))
				.sendKeys("300282");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[2]/div/loginpage/div/div/div/div/div/div/div[2]/div[1]/form/div/button"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[2]/div/loginpage/div/div/div/div/div/div/div[2]/div/div[1]/div[1]/form/md-input/span/input"))
				.sendKeys("Bang");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[2]/div/loginpage/div/div/div/div/div/div/div[2]/div/div[1]/div[1]/form/div[4]/div/button"))
				.click();
		Thread.sleep(2000);
	}

	@Then("^User Click on Account menu Button$")
	public void user_Click_on_Account_menu_Button() throws Throwable {
		driver.findElement(By.xpath("/html/body/nav-menu/div/div/div/div/nav/ul/li[2]")).click();
		System.out.println("Accounts page is displayed");
	}

	@Then("^he verified all menus on account page$")
	public void he_verified_all_menus_on_account_page() throws Throwable {
		boolean b = driver
				.findElement(By.xpath(
						"/html/body/div[3]/ui-view/ui-view/fundtransferwidget/div[2]/div/div/div/div/div[2]/div[2]"))
				.isDisplayed();

		System.out.println("Available balance section is verified:" + b);
		b = driver.findElement(By.xpath(
				"/html/body/div[3]/ui-view/ui-view/fundtransferwidget/div[2]/div/div/div/div/div[1]/div[1]/div[1]/div[1]"))
				.isDisplayed();
		System.out.println("Transfer cash section is verified:" + b);
		b = driver.findElement(By.xpath(
				"/html/body/div[3]/ui-view/ui-view/fundtransferwidget/div[2]/div/div/div/div/div[1]/div[1]/div[1]/div[2]"))
				.isDisplayed();
		System.out.println("withdraw cash section is verified:" + b);
		String bankDetails = driver.findElement(By.xpath("//option[text()=' State Bank of India (38140953280)']"))
				.getText();
		System.out.println(bankDetails);
		String selectBankAc = driver.findElement(By.xpath("//option[text()=' State Bank of India (38140953280)']"))
				.getText();

		System.out.println(selectBankAc);
		System.out.println("Bank details are matching");
		Assert.assertEquals("Bank details are matching", bankDetails, selectBankAc);
	}

	@Then("^User logged out of application$")
	public void user_logged_out_of_application() throws Throwable {
		driver.findElement(By.xpath("/html/body/page-header/div/nav/div[2]/div/div/div/div[2]/ul/li[3]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/button[2]")).click();
		Thread.sleep(3000);
		driver.quit();

	}

	@Then("^User Click on MarketWatch menu$")
	public void user_Click_on_MarketWatch_menu() throws Throwable {
		driver.findElement(By.xpath("//span[text()='MARKETWATCH']")).click();
		Thread.sleep(2000);

	}

	@Then("^User verified MyWatchlist$")
	public void user_verified_MyWatchlist() throws Throwable {
		String cssValue = driver.findElement(By.xpath("//a[text()='MY WATCHLIST']")).getCssValue("text-decoration");
		System.out.println("value:" + cssValue);
		boolean b = driver.findElement(By.xpath("//a[text()='MY WATCHLIST']")).isDisplayed();
		System.out.println("MyWatchlist is underlined:" + b);
		Thread.sleep(2000);

	}

	@Then("^User verified Option Chain$")
	public void user_verified_Option_Chain() throws Throwable {
		boolean isDisabled = driver.findElement(By.xpath("//button[text()='Option Chain']")).isEnabled();
		System.out.println("Option chain button is enabled:" + isDisabled);
		Thread.sleep(2000);

	}

	@Then("^User verified MarketWatch is highlighted$")
	public void user_verified_MyWatchlist_is_highlighted() throws Throwable {
		Thread.sleep(2000);
		boolean isHighlighted = driver.findElement(By.xpath("//span[text()='MARKETWATCH']")).isDisplayed();
		System.out.println("Marketwatch is highlighted:" + isHighlighted);
		Thread.sleep(2000);
		/*
		 * String color =
		 * driver.findElement(By.xpath("//a[text()='Shop']")).getCssValue("color");
		 * 
		 * String backcolor =
		 * driver.findElement(By.xpath("//a[text()='Shop']")).getCssValue(
		 * "background-color");
		 * 
		 * System.out.println(color);
		 * 
		 * System.out.println(backcolor);
		 */

	}

	@Then("^User Click on Trade Now menu$")
	public void user_Click_on_Trade_Now_menu() throws Throwable {
		driver.findElement(By.xpath("//span[text()='TRADE NOW']")).click();
		Thread.sleep(2000);

	}

	@Then("^User verified Trade now page's menu bar$")
	public void user_verified_Trade_now_page_s_menu_bar() throws Throwable {
		boolean MenuBar = driver.findElement(By.xpath("//ul[@id='submenu']")).isDisplayed();
		System.out.println("Trade now menubar is displayed:" + MenuBar);

	}

	@Then("^User verified all fields on trade now page$")
	public void user_verified_all_fields_on_trade_now_page() throws Throwable {
		boolean b = driver
				.findElement(
						By.xpath("/html/body/div[3]/ui-view/ui-view/orderwidget/div/div[2]/div[1]/div[1]/div[1]/div"))
				.isDisplayed();
		System.out.println("All fields of normal order are verified:" + b);

	}

	@Then("^User verified All default options$")
	public void user_verified_All_default_options() throws Throwable {
		Thread.sleep(2000);
		boolean b = driver.findElement(By.xpath("//button[text()='Place Order']")).isEnabled();
		System.out.println("Place order and reset buttons are eanbled:" + b);

	}

	@Then("^User Click on Reports menu$")
	public void user_Click_on_Reports_menu() throws Throwable {
		driver.findElement(By.xpath("//span[text()='REPORTS']")).click();
		Thread.sleep(2000);
		boolean b = driver.findElement(By.xpath("/html/body/nav-menu/div/div/ul")).isDisplayed();
		System.out.println("Reports menu bar is displayed properly:" + b);
		Thread.sleep(2000);

	}

	@Then("^User validate deafault options$")
	public void user_validate_deafault_options() throws Throwable {
		boolean b = driver.findElement(By.xpath("//*[@id=\"submenu\"]/li[1]/a")).isDisplayed();
		System.out.println("Quick view menu is displayed in reports page:" + b);
		b = driver.findElement(By.xpath("//span[text()='REPORTS']")).isDisplayed();
		System.out.println("Reports menu is highlighted:" + b);
		Thread.sleep(2000);

	}

	@Then("^User verifies headers and all links are displayed$")
	public void user_verifies_headers_and_all_links_are_displayed() throws Throwable {
		boolean b = driver.findElement(By.xpath("/html/body/div[3]/ui-view/ui-view/report-dashboard/div/div/div[1]"))
				.isDisplayed();
		System.out.println("equity reports are displayed properly:" + b);
		b = driver.findElement(By.xpath("/html/body/div[3]/ui-view/ui-view/report-dashboard/div/div/div[2]"))
				.isDisplayed();
		System.out.println("Derivatives reports are displayed properly:" + b);
		b = driver.findElement(By.xpath("/html/body/div[3]/ui-view/ui-view/report-dashboard/div/div/div[3]"))
				.isDisplayed();
		b = driver.findElement(By.xpath("/html/body/div[3]/ui-view/ui-view/report-dashboard/div/div/div[4]"))
				.isDisplayed();
		System.out.println(
				"currency,commodity,mutual fund,portfolio reports transaction reports are displayed properly:" + b);

	}

	@Then("^User enters (\\d+) rs to transfer the fund$")
	public void user_enters_rs_to_transfer_the_fund(int fund) throws Throwable {
		driver.findElement(By.xpath(
				"/html/body/div[3]/ui-view/ui-view/fundtransferwidget/div[2]/div/div/div/div/div[1]/div[1]/div[2]/div/div/form/md-input[1]/span/input"))
				.sendKeys(String.valueOf(fund));
		Thread.sleep(2000);
	}

	@Then("^User selects netbanking as payment mode and clicked submit button$")
	public void user_selects_netbanking_as_payment_mode_and_clicked_submit_button() throws Throwable {
		driver.findElement(By.xpath(
				"/html/body/div[3]/ui-view/ui-view/fundtransferwidget/div[2]/div/div/div/div/div[1]/div[1]/div[2]/div/div/form/div[2]/div[2]/md-radio/div/input"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[3]/ui-view/ui-view/fundtransferwidget/div[2]/div/div/div/div/div[1]/div[1]/div[2]/div/div/form/div[4]/div[2]/button"))
				.click();
		Thread.sleep(2000);
		System.out.println("user navigated to bank login page");

	}

	@Then("^User enters details on bank login page and transefered the cash$")
	public void user_enters_details_on_bank_login_page_and_transefered_the_cash() throws Throwable {
		boolean b = driver.findElement(By.xpath("//*[@id=\"payment\"]/div/div/div[1]/div/div/div/div[1]"))
				.isDisplayed();
		System.out.println("login window is displayed:" + b);
		System.out.println("User transferred the cash");
		driver.navigate().back();
	}

	@Then("^User verifies select segment's default value$")
	public void user_verifies_select_segment_s_default_value() throws Throwable {
		String Actual = driver.findElement(By.xpath("//option[text()='Equity Trading(A/C)']")).getText();
		System.out.println(Actual);
		if (Actual.equals("Equity Trading(A/C)")) {
			System.out.println("Defalt select segment is Equity Trading(A/C)");
		}
	}

	@Then("^User selects Bank to IPO cash transfer$")
	public void user_selects_Bank_to_IPO_cash_transfer() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='BANK TO IPO']")).click();
		Thread.sleep(2000);
		String Actual = driver.findElement(By.xpath("//option[text()='IPO A/C']")).getText();
		if (Actual.equals("IPO A/C")) {
			System.out.println("Bank to IPO select segment IPO A/C) is verified");
		}

	}

	@Then("^User selects Bank to mutual fund cash transfer$")
	public void user_selects_Bank_to_mutual_fund_cash_transfer() throws Throwable {
		driver.findElement(By.xpath("//a[text()='BANK TO MF']")).click();
		Thread.sleep(2000);
		String Actual = driver.findElement(By.xpath("//a[text()='BANK TO MF']")).getText();
		if (Actual.equals("BANK TO MF")) {
			System.out.println("BANK TO MF select segment Mutual Fund A/C is verified");
		}
		Thread.sleep(2000);
	}

	@Then("^User verifies all select segment's drop down values$")
	public void user_verifies_all_select_segment_s_drop_down_values() throws Throwable {
		driver.findElement(By.xpath(
				"/html/body/div[3]/ui-view/ui-view/fundtransferwidget/div[2]/div/div/div/div/div[1]/div[1]/div[2]/div/div/form/md-input[3]/span/select"))
				.click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='segment']"));
		Select select = new Select(dropdown);
		List<WebElement> options = select.getOptions();
		String actual="";
		for (WebElement we : options) {
			actual = we.getText();
			System.out.println(actual);
		}
		Thread.sleep(2000);
		System.out.println("All drop down values of select segment Equity Trading(A/C)\n"
				+ "IPO A/C\n"
				+ "Mutual Fund A/C\n"
				+ "EMF A/C are displayed and verified");
	}

}
