package com.config.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader1 {
	public Properties p;
	public ConfigurationReader1() throws IOException {
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\AutomationPractice\\src\\main\\java\\com\\config\\properties\\ConfigurationProperties1");
		FileInputStream fis = new FileInputStream(f);
		p=new Properties();
		p.load(fis);
		
	}
	public String getbrowser() {
		String browser=p.getProperty("browser");
		return browser;
		
	}
	public String geturl() {
		String url=p.getProperty("url");
		return url;
	}
	public String getusername() {
		String username=p.getProperty("username");
		return username;
		
	}
	public String getpassword() {
		String password=p.getProperty("password");
		return password;
	}

}
