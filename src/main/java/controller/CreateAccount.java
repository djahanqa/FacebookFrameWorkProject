package controller;

import base.ScriptBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount extends ScriptBase {
    @FindBy (xpath = "//*[@name='firstname']")
    WebElement firstname;

    @FindBy(xpath = "//*[@name='lastname']")
    WebElement lastname;

    @FindBy (id= "u_0_j")
    WebElement email;

    @FindBy(id="u_0_m")
    WebElement reEmail;

    @FindBy(id="u_0_q")
    WebElement pass;

    @FindBy (id="month")
    WebElement month;

    @FindBy (id="day")
    WebElement day;

    @FindBy (id="year")
    WebElement year;

    @FindBy(xpath = "//*[@id=\"u_0_8\"][@type='radio']")
    WebElement female;



    public CreateAccount(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
public void creatingAccount(String fname,String lname,String emailAddress,String reEmailAddress,String password){

        firstname.sendKeys(fname);
        lastname.sendKeys(lname);
        email.sendKeys(emailAddress);
        reEmail.sendKeys(reEmailAddress);
        pass.sendKeys(password);
        dropdownMonth(month,"Jan");
        dropdownDay(day,"1");
        dropdownYear(year,"2000");
        female.click();
}


    public void dropdownMonth(WebElement element,String value){
        element=month;
        Select select=new Select(element);
        select.selectByVisibleText(value);
    }

    public void dropdownDay(WebElement element,String value){
        element=day;
        Select select=new Select(element);
        select.selectByVisibleText(value);
    }

    public void dropdownYear(WebElement element,String value){
        element=year;
        Select select=new Select(element);
        select.selectByVisibleText(value);




    }

}
