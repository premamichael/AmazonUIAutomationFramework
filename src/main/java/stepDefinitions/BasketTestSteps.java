package stepDefinitions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ProductDescriptionPage;
import pageObjects.ProductsPage;
import pageObjects.SearchPage;

public class BasketTestSteps extends CommonFunctions {

    SearchPage searchPage=new SearchPage(driver);
    ProductsPage productsPage=new ProductsPage(driver);

    ProductDescriptionPage productDescriptionPage=new ProductDescriptionPage(driver);

    @When("I click {string} and get redirected to product description page")
    public void clickProduct(String expectedProductName)
    {
        productsPage.clickProductLink(expectedProductName);
    }

    @When("I select size as {string}")
    public void selectProductSize(String size)
    {
        productDescriptionPage.selectSizeOption(size);
    }

    @Then("I click add to basket and see the item added to basket")
    public void verifyAddToBasket()
    {
        productDescriptionPage.clickAddToBasketBtn();
    }
}
