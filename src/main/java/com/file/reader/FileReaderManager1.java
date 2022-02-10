package com.file.reader;

import java.io.IOException;


import com.config.reader.ConfigurationReader1;

public class FileReaderManager1 {
private FileReaderManager1() {
		
	}
	public static FileReaderManager1 getInstanceFRM() {
		FileReaderManager1 frm1= new FileReaderManager1();
		return frm1;
	}
	public ConfigurationReader1 getInstanceCR() throws IOException {
		ConfigurationReader1 reader = new ConfigurationReader1();
		return reader;
	}

}
