package stepdef;

import geico.bdd.base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutoQuoteTestSteps extends BaseClass {

@Given("verify home page title")
public void verify_home_page_title() {
	homePage.verifyHomePageTitle("The Insurance Savings You Expect");
}

@Given("insert zipcode field {string}")
public void insert_zipcode_field(String string) {
	homePage.insertZipcodeField("10461");
}

@When("click go button")
public void click_go_button() {
	homePage.clickGoBtn();
}

@When("click auto LOB")
public void click_auto_lob() {
	homePage.clickAutoLOB();
}

@Then("click start my quote")
public void click_start_my_quote() {
	homePage.clickStartMyQuote();
	
}



}
