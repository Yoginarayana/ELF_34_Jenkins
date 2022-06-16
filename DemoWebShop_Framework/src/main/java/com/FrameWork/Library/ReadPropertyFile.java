package com.FrameWork.Library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile implements FrameWorkConstants {
	public static String getUrl(String url) throws IOException {
		FileInputStream fis = new FileInputStream(propertyPath);
		Properties property = new Properties();
		property.load(fis);
		return property.getProperty(url);
		}

}
