package stepdef;

import geico.bdd.base.BaseClass;
import geico.bdd.reporting.Logs;
import io.cucumber.java.en.Given;

public class CommonSteps extends BaseClass  {
	@Given("this is a quote test")
	public void this_is_a_quote_test() {
		Logs.log("*** This is a bacground step ***");
		
	}

}
