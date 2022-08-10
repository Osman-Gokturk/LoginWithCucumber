 package stepdefinitions;

 import io.cucumber.java.en.And;
 import io.cucumber.java.en.Given;
 import io.cucumber.java.en.When;
 import pages.HomePAge;
 import pages.LoginPage;
 import utilities.ConfigReader;
 import utilities.Driver;

 public class LoginStepDefs {
HomePAge homePAge = new HomePAge();
LoginPage loginPage=new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigReader.getProperty("app_Url"));

    }
    @And("user login dropdown")
    public void user_login_dropdown() {
homePAge.homeLoginButton.click();
    }
    @And("user sends username {string}")
    public void user_sends_username(String string) {
loginPage.username.sendKeys(string);
    }
    @And("user sends password {string}")
    public void user_sends_password(String string) {
loginPage.password.sendKeys(string);
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
loginPage.submitButton.click();
    }
}
