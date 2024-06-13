package practice;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumintro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		///give me the count of links on the page
		//links starts with @
		
		
		System.out.println(driver.findElements(By.tagName("a")).size());
//give number of links in footer section
	
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
//links count of only first column in footer section
		
		WebElement columndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul[1]"));
		System.out.println(	columndriver.findElements(By.tagName("a")).size());
		
//click on link each link in cloumn and check if the page is opening
		for(int i=1;i< columndriver.findElements(By.tagName("a")).size();i++)
		{
			String clickontab= Keys.chord(Keys.CONTROL,Keys.ENTER); 
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickontab);
			Thread.sleep(5000L);
			
		}
			Set<String> abc=  driver.getWindowHandles();
			
			Iterator<String> itr= abc.iterator();
			while(itr.hasNext())
			{
				driver.switchTo().window(itr.next());
				System.out.println(driver.getTitle());
			}
			
		}
				
		
	
	
	
}
