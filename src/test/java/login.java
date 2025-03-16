import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class login {
    WebDriver driver = new ChromeDriver();


    @Test
    void voaNavigate(){
        driver.manage().window().maximize();
        driver.get("http://voa/visa/applications");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement username = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
        username.sendKeys("voa@gmail.com");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("****");

        WebElement loginButton = driver.findElement(By.xpath("/html/body/div/div/div[4]/div[1]/form/div/input"));
        loginButton.click();

        WebElement applyButton = driver.findElement(By.linkText("Apply for VOA"));
        applyButton.click();

        WebElement agreeButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"voa-terms\"]/div[5]/button")));
        agreeButton.click();

        WebElement voaButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"visa_select_modal\"]/div/div/button[1]")));
        voaButton.click();

        //Providing Information
        WebElement surname = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("surnameInput")));
        //WebElement  = driver.findElement(By.id(""));
        surname.sendKeys("Richard");

        WebElement givenName = driver.findElement(By.id("givenNameInput"));
        givenName.sendKeys("Parker");

        WebElement gender = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("genderInput"))); // Adjust the locator as needed
        Select dropdown = new Select(gender);
        // Select an option from the dropdown
        dropdown.selectByVisibleText("Male");


        WebElement issueCountry = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("countryInput")));
        Select issueCountryDropdown = new Select(issueCountry);
        issueCountryDropdown.selectByVisibleText("AUSTRALIA");


        WebElement otherNationality = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("otherNationalityInput")));
        Select otherNationalityDropdown = new Select(otherNationality);
        otherNationalityDropdown.selectByVisibleText("ARGENTINA");


        WebElement otherResidency = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("otherResidencyInput")));
        Select otherResidencyDropdown = new Select(otherResidency);
        otherResidencyDropdown.selectByVisibleText("AFGANISTAN");


        WebElement passportType = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"passportType\"]")));
        Select passportTypeDropdown = new Select(passportType);
        passportTypeDropdown.selectByVisibleText("Diplomatic");


        WebElement passportNo = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"passportNoInput\"]")));
        passportNo.sendKeys("AB8001");


        WebElement portOfEntry = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("portOfEntryInput")));
        Select portOfEntryDropdown = new Select(portOfEntry);
        portOfEntryDropdown.selectByVisibleText("Shah Amanat International Airport, Chittagong");

        WebElement stayDuration = driver.findElement(By.id("stayDurationInput"));
        stayDuration.sendKeys("12");


        WebElement visitPurpose = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("visitPurposeInput")));
        Select visitPurposeDropdown = new Select(visitPurpose);
        visitPurposeDropdown.selectByVisibleText("CONFERENCE");

        WebElement bgdAddress = driver.findElement(By.id("bgdAddressInput"));
        bgdAddress.sendKeys("1043, Road-9, Avenue-9, Mirpur dohs, mirpur");


        WebElement bgdPhoneNo = driver.findElement(By.id("bgdPhoneNoInput"));
        bgdPhoneNo.sendKeys("01234567890");


        WebElement bgdPhoneContact = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("bgdPhoneContactInput")));
        Select bgdPhoneContactDropdown = new Select(bgdPhoneContact);
        bgdPhoneContactDropdown.selectByVisibleText("Hotel");


        WebElement profession = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("professionInput")));
        Select professionDropdown = new Select(profession);
        professionDropdown.selectByVisibleText("JOURNALIST");

        WebElement dobField = driver.findElement(By.id("birthDateInput"));
        dobField.click();

    }


}
