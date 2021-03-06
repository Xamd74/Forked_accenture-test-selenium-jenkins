package net.phptravels.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.accenture.test.ui.WebDriverSession;

/*
 ****************************************************************************
 * HIGHLIGHTS: Example of page object model (google search page)
 * > Class Example
 * > com.projectname.pages package to be used as Object Repository Location
 * > Create one class for each automated application page (easy to find and maintain)
 * > Create a class for sections that are displayed in multiple pages (footers, menus...)
 * > Extend the WebDrierInstance so the driver can be used by objects.
 * > Each page object model will have the same structure.
 * > Use page factory, private web elements, use getters and setters.
 ****************************************************************************
 */

public class HomePage extends WebDriverSession {

	@FindBy(xpath = "//button[contains(text(),'Search')]")
	public WebElement searchButton;

	@FindBy(xpath = "//span[contains(text(),'Search by Hotel or City Name')]")
	public WebElement campoSearchDisabled;

	@FindBy(xpath = "//*[@id = 'select2-drop']/div/input")
	public WebElement campoSearchInput;

	@FindBy(xpath = "//div[contains(text(),'antic, United States')]")
	public WebElement opcionSelect;

	@FindBy(xpath = "//input[@class = 'form input-lg dpd1']")
	public WebElement inputCheckin;

	@FindBy(xpath = "//input[@class = 'form input-lg dpd2']")
	public WebElement inputCheckout;

	public HomePage() {

		PageFactory.initElements(getWebDriverSession(), this);

	}

}