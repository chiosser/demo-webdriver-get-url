import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Main {
    public static void main(String[] inputArgs){
        //todo browser
        //todo url
        WebDriver driver= new ChromeDriver();
        driver.get("https://ozon.by/");

        try{
        Thread.sleep(4000);
        driver.quit();}
        catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
