package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.Utilities.Utility;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    //By WomenMenuOption = By.xpath("//span[contains(text(),'Women')]");
    //By mouseHoverOnTopMenuOption = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    //By jacketsOption = By.xpath("//a[@id='ui-id-11']");
    //By sortProductNameInDropDownOption = By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]");
    //By menMenuOption = By.xpath("//span[normalize-space()='Men']");
    //By mouseHoverOnBottomsMenuOption = By.xpath("//a[@id='ui-id-18']");
    //By pantsOption = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    //By mouseHoverOnProductNameOption = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    //By mouseHoverAndClickOnProductNameOption = By.xpath("//div[@class='swatch-option text'])[1]");
    //By mouseHoverAndClickOnColourNameOption = By.xpath("//div[@class='swatch-option color'])[1]");
    //By mouseHoverAndClickOnAddToCartOption = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");
    //By addedToYourShoppingCartMethodText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    //By shoppingCartOption = By.xpath("//a[normalize-space()='shopping cart']");
    //By shoppingCartTextMethod = By.xpath("//span[@class='base']");
    //By pantTextMethod = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    //By sizeTextMethod = By.xpath("//dd[contains(text(),'32')]");
    //By colourTextMethod = By.xpath("//dd[contains(text(),'Black')]");

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Women')]")
    WebElement WomenMenuOption;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement mouseHoverOnTopMenuOption;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']")
    WebElement jacketsOption;

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]")
    WebElement sortProductNameInDropDownOption;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Men']")
    WebElement menMenuOption;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']")
    WebElement mouseHoverOnBottomsMenuOption;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pantsOption;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement mouseHoverOnProductNameOption;

    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-option text'])[1]")
    WebElement mouseHoverAndClickOnProductNameOption;

    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-option color'])[1]")
    WebElement mouseHoverAndClickOnColourNameOption;

    @CacheLookup
    @FindBy(xpath = "(//span[contains(text(),'Add to Cart')])[1]")
    WebElement mouseHoverAndClickOnAddToCartOption;

    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addedToYourShoppingCartMethodText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCartOption;

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement shoppingCartTextMethod;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement pantTextMethod;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement sizeTextMethod;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement colourTextMethod;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement mouseHoverOnGearOption;

    @CacheLookup
    @FindBy(xpath = "(//span[normalize-space()='Gear']")
    WebElement mouseHoverGearAndClickOption;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement duffleBagOption;

    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement quantityOption;

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement overNightDuffleText;

    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement youAddedText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement cartOption;

    @CacheLookup
    @FindBy(xpath = "//input[@title='Qty']")
    WebElement qtyText;

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement nightDuffleText;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span)[2]")
    WebElement priceText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement qtyOption;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shopCartOption;

    @CacheLookup
    @FindBy(xpath = "/span[@class='cart-price']//span)[2]")
    WebElement priceTextMethod;

    //By mouseHoverOnGearOption = By.xpath("//span[normalize-space()='Gear']");
    //By mouseHoverGearAndClickOption = By.xpath("(//span[normalize-space()='Gear']");
    //By duffleBagOption = By.xpath("//a[normalize-space()='Overnight Duffle']");
    //By quantityOption = By.xpath("//input[@id='qty']");
    //By overNightDuffleText = By.xpath("//span[@class='base']");
    //By youAddedText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    //By cartOption = By.xpath("//a[normalize-space()='shopping cart']");
    //By qtyText = By.xpath("//input[@title='Qty']");
    //By nightDuffleText = By.xpath("//span[@class='base']");
    //By priceText = By.xpath("//span[@class='cart-price']//span)[2]");
    //By qtyOption = By.xpath("//input[@id='qty']");
    //By shopCartOption = By.xpath("//a[normalize-space()='shopping cart']");
    //By priceTextMethod = By.xpath("/span[@class='cart-price']//span)[2]");

    public void mouseHoverOnGearMenuAndClicksOnBagsOption() {
        Reporter.log("Mouse hover and click Gear Menu" + mouseHoverAndClickOnAddToCartOption.toString());
        mouseHoverToElementAndClick(mouseHoverAndClickOnAddToCartOption);
        CustomListeners.test.log(Status.PASS, "Mouse hover and click gear menu");

    }

    public void clickODuffleBagOption() {
        Reporter.log("Click on duffle option" + duffleBagOption.toString());
        clickOnElement(duffleBagOption);
        CustomListeners.test.log(Status.PASS, "Click on duffle bag option");
    }

    public String verifyOvernightDuffleText() {
        Reporter.log("Verify overnight duffle text" + overNightDuffleText.toString());
        String message = getTextFromElement(overNightDuffleText);
        CustomListeners.test.log(Status.PASS, "Verify overnight Duffle text");
        return message;

    }

    public void quantitySpaceOption() {
        Reporter.log("Enter quantity 3" + quantityOption.toString());
        clickOnElement(quantityOption);
        sendTextToElement(quantityOption, Keys.CONTROL + "a"); // Select all existing text
        sendTextToElement(quantityOption, "3"); // Type in the new text
        CustomListeners.test.log(Status.PASS, "Change quantity to 3");

    }

    public String verifyYouAddedOvernightDuffleToYourShoppingCartText() {
        Reporter.log("Verify overnight duffle text" + youAddedText.toString());
        String message = getTextFromElement(youAddedText);
        CustomListeners.test.log(Status.PASS, "Verify you have added duffle bag to shopping cart");
        return message;
    }

    public void clickOnShoppingCartLinkOption() {
        Reporter.log("Click on Shopping cart link option" + cartOption.toString());
        clickOnElement(cartOption);
        CustomListeners.test.log(Status.PASS, "Click on shopping cart link");

    }

    public String verifyOvernightDuffleTextMethod() {
        Reporter.log("Verify overnight duffle text" + nightDuffleText.toString());
        String message = getTextFromElement(nightDuffleText);
        CustomListeners.test.log(Status.PASS, "Verify overnight duffle text");
        return message;
    }

    public String verifyQuantityText() {
        Reporter.log("Verify quantity" + qtyText.toString());
        String message = getTextFromElement(qtyText);
        CustomListeners.test.log(Status.PASS, "Verify quantity text");
        return message;
    }

    public String verifyProductPrice() {
        Reporter.log("Verify product price" + priceText.toString());
        String message = getTextFromElement(priceText);
        CustomListeners.test.log(Status.PASS, "Verify product price");
        return message;
    }

    public void quantityUpdateText() {
        Reporter.log("Update quantity" + qtyOption.toString());
        clickOnElement(qtyOption);
        sendTextToElement(qtyOption, Keys.CONTROL + "a"); // Select all existing text
        sendTextToElement(qtyOption, "5"); // Type in the new text
        CustomListeners.test.log(Status.PASS, "Enter quantity 5" + qtyOption);

    }

    public void clickOnShoppingCartButtonOption() {
        Reporter.log("Click on shopping cart button" + shopCartOption.toString());
        clickOnElement(shopCartOption);
        CustomListeners.test.log(Status.PASS, "Click on shopping cart button");

    }

    public String verifyUpdatedPriceText() {
        Reporter.log("Get text from" + priceTextMethod.toString());
        String message = getTextFromElement(priceTextMethod);
        CustomListeners.test.log(Status.PASS, "Verify updated price text");
        return message;
    }

    public void mouseHoverOnWomenMenuTab() {
        Reporter.log("Mouse Hover over womens menu" + WomenMenuOption.toString());
        mouseHoverToElement(WomenMenuOption);
        CustomListeners.test.log(Status.PASS, "Mouse hover over womens menu");

    }

    public void mouseHoverOnWomenTopMenuOption() {
        Reporter.log("Mouse Hover over womens top menu" + mouseHoverOnTopMenuOption.toString());
        mouseHoverToElement(mouseHoverOnTopMenuOption);
        CustomListeners.test.log(Status.PASS, "Mouse hover over womens top menu");

    }

    public void setJacketsOption() {
        Reporter.log("Set Jackets Options" + jacketsOption.toString());
        clickOnElement(jacketsOption);
        CustomListeners.test.log(Status.PASS, "Set Jackets options");
    }

    public void productSortByProductName(String product) {
        Reporter.log("Selected text from Drop down" + sortProductNameInDropDownOption.toString());
        selectByVisibleTextFromDropDown(sortProductNameInDropDownOption, product);
        CustomListeners.test.log(Status.PASS, "Sort by product name");
    }

    public void mouseHoverOnMenMenuTab() {
        Reporter.log("Mouse hover on mens Menu Tab" + menMenuOption.toString());
        mouseHoverToElement(menMenuOption);
        CustomListeners.test.log(Status.PASS, "Mouse hover on mens menu tab");

    }

    public void mouseHoverOnMenBottomsMenuOption() {
        Reporter.log("Mouse hover on mens bottom menu" + mouseHoverOnBottomsMenuOption.toString());
        mouseHoverToElement(mouseHoverOnBottomsMenuOption);
        CustomListeners.test.log(Status.PASS, "Mouse hover on mens bottom menu");
    }

    public void setPantsOption() {
        Reporter.log("Set pants options" + pantsOption.toString());
        clickOnElement(pantsOption);
        CustomListeners.test.log(Status.PASS, "set Pants");
    }

    public void mouseHoverOnMenPantsProductNameOption() {
        Reporter.log("Mouse hover over pants product name option" + mouseHoverOnProductNameOption.toString());
        mouseHoverToElement(mouseHoverOnProductNameOption);
        CustomListeners.test.log(Status.PASS, "Mouse hover over mens pants product name option");

    }

    public void mouseHoverOnProductNameCronusYogaPantAndClicksOnSizeOption(String pant) {
        Reporter.log("Click Cronus yoga pants size option" + mouseHoverOnProductNameOption.toString());
        mouseHoverToElementAndClick(mouseHoverAndClickOnProductNameOption);
        CustomListeners.test.log(Status.PASS, "Click cronus yoga pants size option");

    }

    public void mouseHoverOnProductNameCronusYogaPantAndClicksOnColourOption(String pant) {
        Reporter.log("Click on cronus pants colour option" + mouseHoverAndClickOnColourNameOption.toString());
        mouseHoverToElementAndClick(mouseHoverAndClickOnColourNameOption);
        CustomListeners.test.log(Status.PASS, "Click on cronus pants colour option");
    }

    public void mouseHoverOnProductNameCronusYogaPantAndClicksOnAddToCartOption() {
        Reporter.log("Mouse hover on Product name and add to cart" + mouseHoverAndClickOnAddToCartOption.toString());
        mouseHoverToElementAndClick(mouseHoverAndClickOnAddToCartOption);
        CustomListeners.test.log(Status.PASS, "Mouse hover on Product name and add to cart");
    }

    public String youAddedCronusYogaPantToYourShoppingCartMethodTextMethodText() {
        Reporter.log("Verify text you added pants to Shopping Cart" + addedToYourShoppingCartMethodText.toString());
        String message = getTextFromElement(addedToYourShoppingCartMethodText);
        CustomListeners.test.log(Status.PASS, "Verify text you added pants to Shopping Cart");
        return message;
    }

    public void clickOnShoppingCartOption() {
        Reporter.log("Click on Shopping cart option" + pantsOption.toString());
        clickOnElement(pantsOption);
        CustomListeners.test.log(Status.PASS, "Click on shopping cart option");

    }

    public String shoppingCartText() {
        Reporter.log("Get text from" + shoppingCartTextMethod.toString());
        String message =  getTextFromElement(shoppingCartTextMethod);
        CustomListeners.test.log(Status.PASS, "Get Shopping Cart text");
        return message;
    }

    public String cronusPantText() {
        Reporter.log("Get text from" + pantTextMethod.toString());
        String message = getTextFromElement(pantTextMethod);
        CustomListeners.test.log(Status.PASS, "Get cronus pants text");
        return message;
    }

    public String verifySizeText() {
        Reporter.log("Get text from" + sizeTextMethod.toString());
        String message = getTextFromElement(sizeTextMethod);
        CustomListeners.test.log(Status.PASS, "Verify size text");
        return message;
    }

    public String verifyColourOfPantText() {
        Reporter.log("Get text from" + colourTextMethod.toString());
        String message =  getTextFromElement(colourTextMethod);
        CustomListeners.test.log(Status.PASS, "Verify colour of pant text");
        return message;
    }

    public void mouseHoverOnGearMenuOption() {
        Reporter.log("Mouse hover on gear menu" + mouseHoverOnGearOption.toString());
        mouseHoverToElement(mouseHoverOnGearOption);
        CustomListeners.test.log(Status.PASS, "Mouse hover on gear menu");

    }
}
