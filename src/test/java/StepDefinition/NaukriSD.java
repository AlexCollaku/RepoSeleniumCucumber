package StepDefinition;

import Drivers.Web;
import cucumber.api.java.en.Given;

public class NaukriSD {

    @Given("^Launch \"https://www.naukri.com\"$")
    public void launchNaukriPage() {

        Web.initDriver("https://www.naukri.com/");
    }
}
