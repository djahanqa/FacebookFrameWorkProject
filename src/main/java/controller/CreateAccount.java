package controller;

import base.ScriptBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount extends ScriptBase {
    @FindBy (xpath = "//*[@name='firstname']")
    WebElement firstname;

    public CreateAccount(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
public void creatingAccount(String fname){

        firstname.sendKeys(fname);
}
}
