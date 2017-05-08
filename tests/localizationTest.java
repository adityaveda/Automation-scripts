public class localizationTest {
	
	
	AndroidDriver<AndroidElement> driver;
	
	
	@Before
	public void setUp() throws MalformedURLException{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		  
		  
		  
		  // Set android deviceName desired capability. Set your device name.
		  capabilities.setCapability("deviceName", "ZY222ZKWQL");

		  // Set BROWSER_NAME desired capability. It's Android in our case here.
		  capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");

		  // Set android VERSION desired capability. Set your mobile device's OS version.
		  capabilities.setCapability(CapabilityType.VERSION, "6.0.0");

		  // Set android platformName desired capability. It's Android in our case here.
		  capabilities.setCapability("platformName", "Android");
		  
		  // Set android appPackage desired capability. It is
		  capabilities.setCapability("appPackage", "com.sololearn.htmltrial");

		  // Set android appActivity desired capability. It is
		  capabilities.setCapability("appActivity", "com.sololearn.app.MainActivity");
		  
		  driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  System.out.println("After launch");


	}
	@Test
	public void Test2() throws InterruptedException{
		Dimension size = driver.manage().window().getSize();
		int starthx = (int) (size.width * 0.01);
		  int endx = (int) (size.width*0.70);
		  int starthy = size.height / 2;
		  
		  Thread.sleep(2000);
		  driver.swipe(starthx, starthy, endx, starthy, 3000);
		  Thread.sleep(2000);
		  driver.findElement(By.name("Settings")).click();
		  driver.findElement(By.name("Language")).click();
		  
		  driver.findElement(By.name("Español")).click();
		  Thread.sleep(8000);
	}		

	

}
