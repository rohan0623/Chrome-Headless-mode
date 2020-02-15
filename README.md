# Chrome-Headless-mode
How to properly configure the automation tests in google chrome headless mode


What are the versions of your Chrome browser, chromedriver and Selenium? I tried with:

1. Chrome Version 79.0.3945.36 (Official Build) (64-bit)
2. chromedriver 2.33
3. Selenium 3.141.59


The following code:

System.setProperty("webdriver.chrome.driver", /path/to chromedriver);
ChromeOptions options = new ChromeOptions();
options.addArguments("--window-size=1024,768");
options.setHeadless(true);
options.addArguments("--lang=en_US");     //Headless chrome does not support all incoming languages and thus some pages do not respond well to that. Supporting the language that page outputs in, loads the page correctly
driver = new ChromeDriver(options);
driver.manage().window().maximize();
