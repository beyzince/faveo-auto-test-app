package org.testapp.Ui.Pages.Faveo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testapp.Ui.Pages.BasePage;

import java.util.List;

public class HomePage extends BasePage {
    private By myProfileDropDownLocator = By.xpath("//*[@id=\"navbarDropdown\"]");
/*    private By dropdownDashboardButtonLocator = By.xpath("//*[@id=\"dropdown_content\"]/a[2]");

    private By dropdownLogoutButtonLocator = By.cssSelector("#dropdown_content > a:nth-child(1)");*/

//    List<WebElement> dropdownElements = driver.findElements(myProfileDropDownLocator);

    private By dashboardButtonLocator = By.xpath("//*[@id=\"dropdown_content\"]/a[2]");



/*
    private By dropDownContent = By.id("dropdown_content");
    Select dropdown = new Select(findBy(dropDownContent));

*/

    private By profileDropdownLoc = By.xpath("//*[@id=\"navbarDropdown\"]");
    private By dashboardLoc = By.xpath("//*[@id=\"dropdown_content\"]/a[2]");




    DashboardPage dashboardPage;
    public HomePage(WebDriver driver) {
        super(driver);
    }


    public DashboardPage getDashboardPage(){
//        click(dropdownDashboardButtonLocator);
//        dropdown.selectByVisibleText("Dashboard"); //div olduğu için patlıyor
//        dropdownElements.get(2).click();// out of bounds exception
//        click(dropdownElements.get(2));



        click(profileDropdownLoc);
        click(dashboardLoc);
        return dashboardPage = new DashboardPage(driver);
    }

    public void logout(){
        click(myProfileDropDownLocator);
//        click(dropdownLogoutButtonLocator);
    }


    public boolean isHomePageOpened(){
        if(isDisplayed(myProfileDropDownLocator)){
            return true;
        }else{
            return false;
        }
    }
}
