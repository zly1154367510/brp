package com.zly.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.text.Format;

import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import com.zly.domain.User;

public class XmlUtils {
	
	private static String filePath;
	
	//获取xml文件位置
	static{
		filePath = XmlUtils.class.getClassLoader().getResource("User.xml").getPath();
	}
	
	public static Document getDocument() throws DocumentException{
		
		SAXReader reader = new SAXReader();
		Document document = reader.read(new File(filePath));
		return document;
	}
	
	public static void writeXml(int document) throws IOException{
		
		OutputFormat outputStream = OutputFormat.createPrettyPrint();
		outputStream.setEncoding("UTF-8");
		XMLWriter writer = new XMLWriter(new FileOutputStream(filePath));
		writer.write(document);
		writer.close();
		
		
	}
}
