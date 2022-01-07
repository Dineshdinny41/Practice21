package com.config.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public Properties p;
	public ConfigurationReader() throws IOException {
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\AutomationPractice\\src\\main\\java\\com\\config\\properties\\ConfigurationProperties");
		FileInputStream fis = new FileInputStream(f);
		p=new Properties();
		p.load(fis);
		
	}
	public String geturl() {
		String url = p.getProperty("url");
		return url;
	}
	public String getUsername() {
		String username = p.getProperty("username");
		return username;
	}
	public String getpassword() {
		String password =p.getProperty("password");
		return password;
		
	}

}
