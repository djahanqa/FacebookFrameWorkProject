package controller;

import base.ScriptBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount extends ScriptBase {
    @FindBy (xpath = "//*[@name='firstname']")
    WebElement firstname;

    @FindBy(xpath = "//*[@name='lastname']")
    WebElement lastname;

    @FindBy (id= "u_0_j")
    WebElement email;

    @FindBy(id="u_0_m")
    WebElement reEmail;




    public CreateAccount(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
public void creatingAccount(String fname,String lname,String emailAddress,String reEmailAddress){

        firstname.sendKeys(fname);
        lastname.sendKeys(lname);
        email.sendKeys(emailAddress);
        reEmail.sendKeys(reEmailAddress);
}
}
