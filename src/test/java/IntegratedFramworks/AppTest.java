package IntegratedFramworks;

import org.apache.log4j.Logger;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AppTest extends Base{

	public static Logger logs = Logger.getLogger(AppTest.class.getName());
	@Test
	@Parameters("browser")
    public void myTest(String browser)
    {
		browserSetup(browser);
		driver.get("https://www.youtube.com/");
		logs.info("----------------------Test executed.-----------------------");
		
    }
}
