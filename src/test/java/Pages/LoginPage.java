package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void browse(String url) {
        driver.get(url);
    }
    public void signup() {
    	driver.findElement(By.xpath("//a[@class='btn btn-outline-light me-2']")).click();
    }
    public void Username() {
    	WebElement name= driver.findElement(By.xpath("//input[@id='username']"));
    	name.clear();
    	name.sendKeys("j7ee");
    	
    }
    public void password() {
    	WebElement pass= driver.findElement(By.xpath("//input[@id='password']"));
    	pass.clear();
    	pass.sendKeys("Rohi");
    	
}
    public void login() {
    	WebElement log =driver.findElement(By.xpath("//button[@class='btn btn-success']"));
    	log.click();
    }
    public void Fishoption() {
    	WebElement fi =driver.findElement(By.xpath("//div[@id='SidebarContent']/h4/a"));
    	fi.click();
    }
    public void fishtype() {
    	WebElement ftype =driver.findElement(By.xpath("//*[@id=\"jpetstore-content\"]/div[2]/table/tbody/tr[2]/td[1]/a"));
    	ftype.click();
    }
    public void Addcart() {
    	WebElement addcrt =driver.findElement(By.xpath("//a[@class='btn btn-primary btn-sm']"));
    	addcrt.click();
    }
public void quantiy() {
	WebElement qty =driver.findElement(By.xpath("//input[@name='EST-3']"));
	qty.clear();
	qty.sendKeys("5");
}
public void update() {
	WebElement udte =driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm']"));
	udte.click();
}
public void checkout() {
	WebElement check =driver.findElement(By.xpath("//div[@class='text-center']/a"));
	check.click();
}
public void cardtype() {
	WebElement crtype =driver.findElement(By.name("cardType"));
	Select select = new Select(crtype);
	select.selectByVisibleText("MasterCard");
}
}
	
	
	


