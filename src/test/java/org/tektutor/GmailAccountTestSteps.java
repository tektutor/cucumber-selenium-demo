package org.tektutor;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import gherkin.lexer.El;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import java.io.File;
import org.apache.commons.io.FileUtils;

public class GmailAccountTestSteps {

    @Given("^I provided all valid details$")
    public void i_provided_all_valid_details() throws Throwable {
        ChromeDriver chrome = new ChromeDriver();
        chrome.get("https://accounts.google.com/SignUp?hl=en");

        chrome.findElementById("FirstName").sendKeys("Nitesh");
        chrome.findElementById("LastName").sendKeys("Jeganathan");
        chrome.findElementById("GmailAddress").sendKeys("jeganabac");
        chrome.findElementById("Passwd").sendKeys("**Password");
        chrome.findElementById("PasswdAgain").sendKeys("**Password");
        chrome.findElement(By.xpath(".//*[@id='BirthMonth']/div")).click();        //WebElement month = chrome.findElement (By.id(":0")).sendKeys("January");
        chrome.findElement(By.xpath(".//*[@id=':4']/div")).click();

        chrome.findElement(By.xpath(".//*[@id='BirthDay']")).sendKeys("4");        //WebElement month = chrome.findElement (By.id(":0")).sendKeys("January");
        chrome.findElement(By.xpath(".//*[@id='BirthYear']")).sendKeys("1980");        //WebElement month = chrome.findElement (By.id(":0")).sendKeys("January");

        chrome.findElement(By.id("Gender")).click();
        chrome.findElement(By.id(":f")).click(); 

        chrome.findElement(By.id("RecoveryPhoneNumber")).sendKeys("123-456-7890");
        chrome.findElement(By.id("RecoveryEmailAddress")).sendKeys("xyzabc@gmail.com");

        File scrFile = ((TakesScreenshot)chrome).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("screenshot.png"));
        //chrome.close();
    }
    
    @When("^I click the submit button$")
    public void i_click_the_submit_button() throws Throwable {
    }
    
    @Then("^I expect a user created message\\.$")
    public void i_expect_a_user_created_message() throws Throwable {
    }

}