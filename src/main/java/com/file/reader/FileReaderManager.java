package com.file.reader;

import java.io.IOException;

import com.config.reader.ConfigurationReader;

public class FileReaderManager {
	private FileReaderManager() {
		
	}
	public static FileReaderManager getInstanceFRM() {
		FileReaderManager frm= new FileReaderManager();
		return frm;
	}
	public ConfigurationReader getInstanceCR() throws IOException {
		ConfigurationReader reader = new ConfigurationReader();
		return reader;
	}

}
