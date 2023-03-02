package geico.bdd.objects; 


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import geico.bdd.common.CommonActions;

public class HomePage {
	CommonActions actions;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new CommonActions(driver);
	}

	@FindBy(tagName = "h1")
	WebElement homepageTitle;

	@FindBy(xpath = "(//input[@class='zip-code-input'])[1]")
	WebElement zipcodeField;

	@FindBy(xpath = "//input[@value='Go']")
	WebElement goBtnElement;

	@FindBy(xpath = "(//div[@class='product-checkbox'])[1]")
	WebElement autoLOBElement;

	@FindBy(xpath = "//a[text()='Start My Quote']")
	WebElement startMyQuote;

	@FindBy(xpath = "(//input[@value='Continue'])[1]")
	WebElement continueBtn;

	@FindBy(xpath = "(//span[text()='Log In'])[1]")
	WebElement logInBtn;

	public void verifyHomePageTitle(String expectedTitle) {
	actions.validate(homepageTitle, expectedTitle);
	}

	public void insertZipcodeField(String zip) {
	actions.insert(zipcodeField, zip);
	}

	public void clickGoBtn() {
	actions.click(goBtnElement);
	}

	public void clickAutoLOB() {
	actions.click(autoLOBElement);

	}

	public void clickStartMyQuote() {
	actions.click(startMyQuote);
	}

	// public void clickLogInBtn() {
	// click(logInBtn);

	// public void clickMotorcycle() {
	// click(motorcycleLOBElement);
}

// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
// wait.until(ExpectedConditions.elementToBeClickable(continueBtn)).click();
