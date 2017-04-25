
public class SignInFailed {

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
	public void test1() throws InterruptedException{
		driver.findElement(By.id("com.sololearn.htmltrial:id/input_email")).sendKeys("shruti.patl3101@gmail.com");
		 driver.findElement(By.id("com.sololearn.htmltrial:id/input_password")).sendKeys("Abc@123");
		
		 Thread.sleep(2000);
		 driver.navigate().back();
		 driver.findElement(By.id("com.sololearn.htmltrial:id/login_button")).click();
		 
		 if(driver.findElement(By.id("com.sololearn.htmltrial:id/alertTitle"))!=null){
			 
			 System.out.println("SignIn Failed Test case True");
		 }
		 else{
		
			 System.out.println("SignIn Failed Test Case failed");
		 }
		 
		 
	}


}

