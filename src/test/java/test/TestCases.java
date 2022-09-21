package test;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestCases extends BaseClass {

    String emailid = "email";
    String password = "pass";
    String loginbtn = "login";
   

    @Test
    public void test001_verify_email(){
        WebElement email = driver.findElement(By.id(emailid));
        Assert.assertEquals(email.isDisplayed(), true);
        System.out.println("Email is Displayed!");
    }

    @Test
    public void test002_verify_password(){
    	 WebElement pass = driver.findElement(By.id(password));
         Assert.assertEquals(pass.isDisplayed(), true);
         System.out.println("login is Displayed!");
        }
    

    @Test
    public void test003_verify_login(){
    	 WebElement login = driver.findElement(By.name(loginbtn));
         Assert.assertEquals(login.isDisplayed(), true);
         System.out.println("login is Displayed!");
        }
    }

   
