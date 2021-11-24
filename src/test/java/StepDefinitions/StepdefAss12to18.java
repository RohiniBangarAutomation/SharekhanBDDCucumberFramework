package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepdefAss12to18 {
	WebDriver driver;

	@Given("^user loggs into sharekhan account$")
	public void user_logs_into_sharekhan_account() throws Throwable {
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

	@When("^User clicks view detailed portfolio$")
	public void user_clicks_view_detailed_portfolio() throws Throwable {
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

	@When("^user clicks add virtual portfolio$")
	public void user_clicks_add_virtual_portfolio() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"virtualportfolioaplha\"]/button")).click();
		Thread.sleep(2000);

	}

	@Then("^User enter portfolio name as \"([^\"]*)\" and click add folder$")
	public void user_enter_portfolio_name_as_and_click_add_folder(String pName) throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/form/md-input/span/input"))
				.sendKeys(pName);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/form/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/button")).click();
	}

	@Then("^User verifies Addded folder$")
	public void user_verifies_Addded_folder() throws Throwable {
		if (driver.findElement(By.xpath("/html/body/div[3]/ui-view/div/div/div/div/div[1]/ul/li[3]")).isDisplayed()) {
			System.out.println("Virtual portfolio added successfully");
		} else {
			System.out.println("Virtual portfolio not added");
		}

	}

	@Then("^User clicks Add script in portfolio$")
	public void user_clicks_Add_script_in_portfolio() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Add Scrip']")).click();
		Thread.sleep(2000);

	}

	@Then("^User enters values in script and add the script$")
	public void user_enters_values_in_script_and_add_the_script() throws Throwable {
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div/div/div[2]/form/div[2]/scripsearch/div/div[2]/div/div[3]/div[1]/md-input/span/input"))
				.sendKeys("JPPOWER");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/ul/li/a")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div/div/div[2]/form/div[2]/div/div/div[1]/md-input/span/input"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div/div/div[2]/form/div[2]/div/div/div[1]/md-input/div[1]/ul/li[1]/div/div/div/table/tbody/tr[3]/td[4]/button"))
				.click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div/div/div[2]/form/div[2]/div/div/div[2]/md-input/span/select"))
				.click();
		Thread.sleep(2000);
		Select dropTrans = new Select(driver.findElement(By.xpath("//select[@name='b']")));
		dropTrans.selectByVisibleText("Buy");
		Thread.sleep(2000);
		// driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/form/div[2]/div/div/div[3]/md-input/span/input")).sendKeys("4.30");
		// Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div/div/div[2]/form/div[2]/div/div/div[4]/md-input/span/input"))
				.sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/form/div[3]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
		System.out.println("JPPOWER stock added successfully");
	}

	@Then("^User Added more scripts with details$")
	public void user_Added_more_scripts_with_details() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[3]/ui-view/div/div/div/div/div[1]/ul/li[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/ui-view/div/div/div/div/div[1]/ul/li[4]/button")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div/div/div[2]/form/div[2]/scripsearch/div/div[2]/div/div[3]/div[1]/md-input/span/input"))
				.sendKeys("SUZLON");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/ul/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div/div/div[2]/form/div[2]/div/div/div[1]/md-input/span/input"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div/div/div[2]/form/div[2]/div/div/div[1]/md-input/div[1]/ul/li[1]/div/div/div/table/tbody/tr[3]/td[4]/button"))
				.click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div/div/div[2]/form/div[2]/div/div/div[2]/md-input/span/select"))
				.click();
		Thread.sleep(2000);
		Select dropTrans = new Select(driver.findElement(By.xpath("//select[@name='b']")));
		dropTrans.selectByVisibleText("Buy");
		Thread.sleep(2000);
		// driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/form/div[2]/div/div/div[3]/md-input/span/input")).sendKeys("4.30");
		// Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div/div/div[2]/form/div[2]/div/div/div[4]/md-input/span/input"))
				.sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/form/div[3]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
		System.out.println("Suzlon stock added successfully");
		Thread.sleep(3000);

	}

	@Then("^user clicks delete scrip$")
	public void user_clicks_delete_scrip() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		js.executeScript("window.scrollBy(0,1000)");
		// driver.findElement(By.xpath("//*[@id=\"menu\"]/div/nav/ul/li[1]/a/span")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/ui-view/div/div[2]/div[1]/div[2]/span[1]")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/ui-view/div/div/div/div/div[1]/ul/li[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/ui-view/div/div/div/div/div[6]/table/tbody/tr[1]/td[11]"))
				.click();
		Thread.sleep(2000);
//	    String actual=driver.switchTo().alert().getText();
//		System.out.println(actual);
////	    if(actual.equals("Alert!!!"))
////	    {
////	    	System.out.println("Alert box title is verified");
////	    }
////	    else
////	    	System.out.println("Alert box title is not verified");

	}

	@Then("^User validate alert and click ok button$")
	public void user_validate_alert_and_click_ok_button() throws Throwable {
		String alert = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div")).getText();
		if (alert.equals("Alert!!!")) {
			System.out.println("Alert box title is verified");
		} else
			System.out.println("Alert box title is not verified");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[1]")).click();
		Thread.sleep(2000);
	}

	@Then("^user validate stock gets deleted$")
	public void user_validate_stock_gets_deleted() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button")).click();
		Thread.sleep(2000);
		System.out.println("stock deleted successfully");
	}

	@Then("^User logged out of aplication$")
	public void user_logged_out_of_application() throws Throwable {
		driver.findElement(By.xpath("/html/body/page-header/div/nav/div[2]/div/div/div/div[2]/ul/li[3]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/button[2]")).click();
		Thread.sleep(3000);
		driver.quit();

	}

	@Then("^user clicks virtual portfolio and click delete folder$")
	public void user_clicks_virtual_portfolio_and_click_delete_folder() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript(script, args)
		driver.manage().window().maximize();
		js.executeScript("window.scrollBy(0,1000)");
		// driver.findElement(By.xpath("//*[@id=\"menu\"]/div/nav/ul/li[1]/a/span")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/ui-view/div/div[2]/div[1]/div[2]/span[1]")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/ui-view/div/div/div/div/div[1]/ul/li[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/ui-view/div/div/div/div/div[1]/ul/li[5]/button")).click();
		Thread.sleep(2000);
	}

	@Then("^User validate folder deleted successfully$")
	public void user_validate_folder_deleted_successfully() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/form/div[2]/button")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/form/div[1]")).getText();
		if (text.equals("Portfolio deleted successfully.")) {
			System.out.println("Portfolio deleted successfully.");
		} else
			System.out.println("Portfolio not deleted successfully.");

	}

	@Then("^user validate folder does not appear$")
	public void user_validate_folder_does_not_appear() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/span[2]")).click();
		if (driver.findElement(By.xpath("/html/body/div[3]/ui-view/div/div/div/div/div[3]/div/div")).isDisplayed()) {
			System.out.println("deleted folder does not appear in portfolio");
		}
		Thread.sleep(3000);
	}

	@Then("^user clicks Marketwatch menu and clicks create watchlist button$")
	public void user_clicks_Marketwatch_menu_and_clicks_create_watchlist_button() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"menu\"]/div/nav/ul/li[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/ui-view/ui-view/my-watchlist/div/div[1]/ul/li[1]/button"))
				.click();
		Thread.sleep(2000);

	}

	@Then("^User created watchist name as \"([^\"]*)\" and verified$")
	public void user_created_watchist_name_as_and_verified(String wlistName) throws Throwable {
		driver.findElement(By.name("newWatchlist")).sendKeys(wlistName);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/form/button[1]")).click();
		Thread.sleep(2000);
		String created = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/form/md-input/span/input"))
				.getText();
		if (created.equals("Template has been successfully created.")) {
			System.out.println("Template has been successfully created.");
		} else {
			System.out.println("Template not successfully created.");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/form/button[3]")).click();
		Thread.sleep(2000);
		String VerifyList = driver.findElement(By.xpath("//option[text()='DEMOWATCH']")).getText();
		if (VerifyList.equals("DEMOWATCH")) {
			System.out.println("Watchlist is displayed in drop down");
		} else {
			System.out.println("Watchlist is not displayed in drop down");

		}
	}

	@Then("^user add scrip to watchlist and verified added successfully$")
	public void user_add_scrip_to_watchlist_and_verified_added_successfully() throws Throwable {
		driver.findElement(By.xpath("//input[@apo-click='place order']")).sendKeys("Idea");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[3]/ui-view/ui-view/my-watchlist/div/div[2]/ul/li[2]/div/getscrip/span/div[2]/md-input/ul/li/a"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[3]/ui-view/ui-view/my-watchlist/div/div[2]/ul/li[2]/div/getscrip/span/div[3]/button"))
				.click();
		System.out.println("Idea Scrip added successfully");
		Thread.sleep(2000);
	}

	@Then("^user added few more scrips$")
	public void user_added_few_more_scrips() throws Throwable {
		driver.findElement(By.xpath("//input[@apo-click='place order']")).sendKeys("JPPOWER");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[3]/ui-view/ui-view/my-watchlist/div/div[2]/ul/li[2]/div/getscrip/span/div[2]/md-input/ul/li/a"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[3]/ui-view/ui-view/my-watchlist/div/div[2]/ul/li[2]/div/getscrip/span/div[3]/button"))
				.click();
		System.out.println("jppower Scrip added successfully");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@apo-click='place order']")).sendKeys("SUZLON");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[3]/ui-view/ui-view/my-watchlist/div/div[2]/ul/li[2]/div/getscrip/span/div[2]/md-input/ul/li/a"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[3]/ui-view/ui-view/my-watchlist/div/div[2]/ul/li[2]/div/getscrip/span/div[3]/button"))
				.click();
		System.out.println("suzlon Scrip added successfully");
		Thread.sleep(5000);
	}

	@Then("^user clicks Marketwatch menu$")
	public void user_clicks_Marketwatch_menu() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"menu\"]/div/nav/ul/li[3]")).click();
		Thread.sleep(2000);
	}

	@Then("^User sects scrip to delete$")
	public void user_sects_scrip_to_delete() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"sort\"]/tbody/tr[2]/td[1]/md-checkbox-button/div/input")).click();
		Thread.sleep(2000);
	}

	@Then("^user click delete scrip and verify its deleted$")
	public void user_click_delete_scrip_and_verify_its_deleted() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[3]/ui-view/ui-view/my-watchlist/div/div[1]/ul/li[8]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/button[1]")).click();
		Thread.sleep(2000);
		String msgDelete = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div")).getText();
		if (msgDelete.equals("Scrip has been successfully deleted.")) {
			System.out.println("Selected Scrip successfully deleted.");
		} else
			System.out.println("Scrip not deleted.");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/button")).click();
		System.out.println("scrip removed from watchlist");
		Thread.sleep(3000);
	}
	@Then("^User clicks delete waltchlist$")
	public void user_clicks_delete_waltchlist() throws Throwable {
	   driver.findElement(By.xpath("/html/body/div[3]/ui-view/ui-view/my-watchlist/div/div[1]/ul/li[14]/span")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div[3]/ui-view/ui-view/my-watchlist/div/div[1]/ul/li[14]/ul/li[2]/a/span")).click();
	   Thread.sleep(2000);
	}

	@Then("^user verified scrip is deleted$")
	public void user_verified_scrip_is_deleted() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/button[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/button[2]")).click();
	    Thread.sleep(2000);
	    System.out.println("Watchlist deleted successfully");
	}

@Then("^user verified Marketwatch is highlighted and my watchlist is underlined$")
public void user_verified_Marketwatch_is_highlighted_and_my_watchlist_is_underlined() throws Throwable {
   System.out.println("verified Marketwatch is highlighted and my watchlist is underlined");
}

@Then("^User clicks on my portfolio$")
public void user_clicks_on_my_portfolio() throws Throwable {
   Thread.sleep(2000);
   driver.findElement(By.xpath("/html/body/page-header/div/nav/div[1]/div[1]/div[2]/div[2]/ul/li[2]/a")).click();
   Thread.sleep(2000);
}

@Then("^user verified the heading “MY PORTFOLIO”$")
public void user_verified_the_heading_MY_PORTFOLIO() throws Throwable {
  String header= driver.findElement(By.xpath("/html/body/div[1]/div/div/equity-mf-portfolio/div/div/div[1]/h2/div")).getText();
   Thread.sleep(2000);
   System.out.println(header);
   if(header.equals("MY PORTFOLIO"))
   System.out.println("Heading My Portfolio is verified");
   else
	   System.out.println("Heading My Portfolio is not verified");
}

@Then("^user verified tabs “SUMMARY”, “EQUITY”, “MUTUAL FUND” & “VIRTUAL PORTFOLIO”$")
public void user_verified_tabs_SUMMARY_EQUITY_MUTUAL_FUND_VIRTUAL_PORTFOLIO() throws Throwable {
	Thread.sleep(2000);
	if((driver.findElement(By.xpath("//a[text()='Summary']")).getText()).equals("Summary"));
	System.out.println("summary,equity,MF and virtual portfolio heading is verified");
	driver.findElement(By.xpath("/html/body/div[1]/div/div/equity-mf-portfolio/div/div/div[1]/h2/div/span")).click();
    
}




}
