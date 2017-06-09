import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webdriverdemo {
	public static void getBaidu() {
		// 如果你的 FireFox 没有安装在默认目录，那么必须在程序中设置
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files\\Mozilla Firefox\\firefox.exe");
		// 创建一个 FireFox 的浏览器实例
		WebDriver driver = new FirefoxDriver();
		// 让浏览器访问 Baidu
		driver.get("https://www.baidu.com");
		// 用下面代码也可以实现
		// driver.navigate().to("https://www.baidu.com");

		// 获取 网页的 title
		System.out.println("1 Page title is: " + driver.getTitle());

		// 通过 id 找到 input 的 DOM
		WebElement element = driver.findElement(By.id("kw"));

		// 输入关键字
		element.sendKeys("zTree");

		// 提交 input 所在的 form
		element.submit();

		// // 通过判断 title 内容等待搜索页面加载完毕，Timeout 设置10秒
		// (new WebDriverWait(driver, 10)).until(new
		// ExpectedCondition<Boolean>() {
		// public Boolean apply(WebDriver d) {
		// return d.getTitle().toLowerCase().endsWith("ztree");
		// }
		// });
		//
		// // 显示搜索结果页面的 title
		// System.out.println("2 Page title is: " + driver.getTitle());

		// 关闭浏览器
		driver.quit();
	}

	public static void main(String[] args) {
		get163Mail();
	}

	public static void get163Mail() {
		// 如果你的 FireFox 没有安装在默认目录，那么必须在程序中设置
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files\\Mozilla Firefox\\firefox.exe");
		// 创建一个 FireFox 的浏览器实例
		WebDriver driver = new FirefoxDriver();
		// 让浏览器访问 Baidu
		driver.get("http://www.mail.163.com");
		// 用下面代码也可以实现
		// driver.navigate().to("https://www.baidu.com");

		// 获取 网页的 title
		System.out.println("1 Page title is: " + driver.getTitle());



		// 通过判断 title 内容等待搜索页面加载完毕，Timeout 设置3秒
		
		(new WebDriverWait(driver, 100)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return d.getTitle().toLowerCase().endsWith("163网易免费邮--中文邮箱第一品牌");
			}
		});
		
		// 通过 id 找到 input 的 DOM
		WebElement element1 = driver.findElement(By.className("j-inputtext dlemail"));
		// 输入关键字
		element1.sendKeys("martinphl");

		// 通过 id 找到 input 的 DOM

		// WebElement element2 = driver.findElement(By.className(mailpwdclass));
		// // 输入关键字
		//
		// element2.sendKeys("phl55200203");

		// 关闭浏览器
		// driver.quit();
	}

}