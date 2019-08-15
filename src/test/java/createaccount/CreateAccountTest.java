package createaccount;

import base.ScriptBase;
import controller.CreateAccount;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class CreateAccountTest extends ScriptBase{


        CreateAccount createAccount;

        @BeforeTest
        public void beforetest() {
            init();

        }

        @Test
        public void varifycreatingAccount() {
            createAccount = new CreateAccount(driver);
            createAccount.creatingAccount("moh","shina","mohshina_huda79@yahoo.com","mohshina_huda79@yahoo.com","facebook123");
        }

        @AfterTest
        public void closebrowser() {
//            driver.close();
//            driver.quit();

        }

    }