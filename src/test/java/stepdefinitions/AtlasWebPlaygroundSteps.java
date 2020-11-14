package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AtlasWebPlaygroundPage;

public class AtlasWebPlaygroundSteps {

  private AtlasWebPlaygroundPage page = new AtlasWebPlaygroundPage();

  @When("User select color {string}")
  public void userSelectColor(String color) {
    page.selectColor(color);
  }

  @Given("User open atlas web playgroud")
  public void userOpenAtlasWebPlaygroud() {
    page.openPage();

  }

  @When("User input quote {string}")
  public void userInputQuote(String quote) {
    page.inputQuote(quote);
  }

  @When("User click button add quote")
  public void userClickButtonAddQuote() {
    page.clickAddQuote();
  }

  @Then("User see quote {string} with backgorund color {string}")
  public void userSeeQuoteWithBackgorundColor(String quote, String backgroundColor) {
    boolean isAppear = page.isQuoteWithColorVisible(quote, backgroundColor);
    Assert.assertTrue(isAppear);
  }

  @When("User click table view")
  public void userClickTableView() {
    page.clickTableView();

  }

  @When("User hover on button Hover to Show Table")
  public void userHoverOnButtonHoverToShowTable() {
    page.hoverOnButtonShowTable();
  }

  @Then("User see table quotes is appear")
  public void userSeeTableQuotesIsAppear() {
    boolean result = page.isTableAppear();
    Assert.assertTrue(result);
  }

  @When("User click button click to show table")
  public void userClickButtonClickToShowTable() {
    page.clickButtonShowTableAfterTenSec();
  }
}
