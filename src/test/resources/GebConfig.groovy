// download the chrome driver from: https://sites.google.com/a/chromium.org/chromedriver/downloads
// firefox doesn't requieres executable
// explorer from: https://github.com/SeleniumHQ/selenium/wiki/InternetExplorerDriver


import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.ie.InternetExplorerDriver

driver = {
	//System.setProperty('webdriver.chrome.driver', '.\\drivers\\ChromeDriver\\chromedriver.exe')
	//new ChromeDriver()
	
	//new FirefoxDriver()
	
	System.setProperty('webdriver.ie.driver', '.\\drivers\\IEDriverServer\\IEDriverServer.exe')
	new InternetExplorerDriver() // ver drivers\readme.png para que funcione IE
}

baseUrl = 'https://es.wikipedia.org/'

