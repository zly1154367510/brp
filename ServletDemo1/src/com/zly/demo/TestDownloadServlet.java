package com.zly.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestDownloadServlet
 * response 下载文件Demo
 */
@WebServlet(name = "TestDownloadServlet",urlPatterns ={"/TestDownloadServlet"})
public class TestDownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestDownloadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String realPath = request.getSession().getServletContext().getRealPath("/download/1.JPG");
		/*
		 * 
		 * substring 截取字符串
		 * lastIndexOf 获取字符串最后出现的位置
		 */
		String fileNameString = realPath.substring(realPath.lastIndexOf('\\')+1);
		System.out.println(realPath);
		
		response.setHeader("content-disposition", "attachment;filename="+fileNameString);
		
		InputStream in = null;
		OutputStream out =null;
		in = new FileInputStream("F:/javaEE for Eclipse/ServletDemo1/download/1.docx");
		int len = 0;
		byte buffer[] = new byte[1024];
		out = response.getOutputStream();
		while ((len = in.read(buffer)) != -1) {
			out.write(buffer,0,len);
		}
		
		if (in != null && out != null) {
			in.close();
			out.close();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
