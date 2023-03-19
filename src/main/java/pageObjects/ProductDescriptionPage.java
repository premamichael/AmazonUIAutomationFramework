package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductDescriptionPage {
    public WebDriver driver;

    public ProductDescriptionPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="native_dropdown_selected_size_name")
    public WebElement selectSize;

    @FindBy(id="add-to-cart-button")
    public WebElement addToBasketBtn;

    public void selectSizeOption(String size)
    {
        //new Select(driver.findElement(By.id("native_dropdown_selected_size_name"))).
       // new Select(driver.findElement(By.id("native_dropdown_selected_size_name"))).selectByVisibleText(size);
        new Select(selectSize).selectByVisibleText(size);
    }

    public void clickAddToBasketBtn()
    {
        addToBasketBtn.click();
    }
}
