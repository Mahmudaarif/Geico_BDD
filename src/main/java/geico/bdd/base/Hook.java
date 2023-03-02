package geico.bdd.base;

import geico.bdd.utils.ReadProperties;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import static geico.bdd.utils.IConstant.*;

public class Hook {
	BaseClass baseClass;
	ReadProperties envVar = new ReadProperties();

	@Before
	public void initDriver() {
		baseClass = new BaseClass();
		baseClass.setUpDriver(envVar.getProperty(BROWSER));

	}

	@After
	public void exitingDriver() {
		baseClass.tearUp();

	}

}
