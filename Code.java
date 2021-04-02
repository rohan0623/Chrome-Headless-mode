/*
Add the following lines in your Selenium BaseTest class
*/

System.setProperty("webdriver.chrome.driver", /path/to chromedriver);
ChromeOptions options = new ChromeOptions();
options.addArguments("--window-size=1024,768");
options.setHeadless(true);

/*
Headless chrome does not support all incoming languages and thus some pages do not respond well to that. Supporting the language that page outputs in, loads the page correctly. Add the below line to work it correctly in Chrome (Lnaguage- english(US)). 
*/
options.addArguments("--lang=en_US");     
driver = new ChromeDriver(options);
driver.manage().window().maximize();
