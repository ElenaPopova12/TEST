import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWeb {

    @Test
    public void testwebDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/elenapopova/Downloads/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/elements");

        //WebElement buttonButtons = driver.findElement(By.xpath("//*[@class=\"element-list collapse show\"]//*[@id=\"item-4\"]"));
        //buttonButtons.click();

        driver.navigate().to("https://demoqa.com/buttons");

        WebElement buttonClickMe = driver.findElement(By.xpath("//*[text()=\"Click Me\"]"));
        buttonClickMe.click();
        WebElement textMessage = driver.findElement(By.id("dynamicClickMessage"));
        System.out.println(textMessage.getText());
    }
    
    @Test
    public void testwebDriver1() {
        System.setProperty("webdriver.chrome.driver", "/Users/elenapopova/Downloads/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/webtables");

        WebElement buttonAdd = driver.findElement(By.id("addNewRecordButton"));
        buttonAdd.click();

        WebElement userFirstName = driver.findElement(By.id("firstName"));
        userFirstName.sendKeys("Elena");

        WebElement userLasttName = driver.findElement(By.id("lastName"));
        userLasttName.sendKeys("Popova");

        WebElement userEmail = driver.findElement(By.id("userEmail"));
        userEmail.sendKeys("leonoria@ukr.net");

        WebElement userAge = driver.findElement(By.id("age"));
        userAge.sendKeys("42");

        WebElement userSalary = driver.findElement(By.id("salary"));
        userSalary.sendKeys("300");

        WebElement userDepartament = driver.findElement(By.id("department"));
        userDepartament.sendKeys("IT");

        WebElement buttonSubmit = driver.findElement(By.id("submit"));
        buttonSubmit.submit();


        WebElement buttonEdit = driver.findElement(By.xpath("//*[@id=\"edit-record-4\"]"));
        buttonEdit.click();


        WebElement userSalaryEdit = driver.findElement(By.id("salary"));
        userSalaryEdit.clear();
        userSalaryEdit.sendKeys("3000");

        WebElement buttonSubmit1 = driver.findElement(By.id("submit"));
        buttonSubmit1.submit();

    }
}
