package com.zly.demo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.ant.FindLeaksTask;

import sun.util.logging.resources.logging;

import com.mysql.jdbc.Buffer;

/**
 * Servlet implementation class TestVerificationCodeServlet
 * 生成验证码图片
 */
@WebServlet("/TestVerificationCodeServlet")
public class TestVerificationCodeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final int IMAGESWIDTH = 200;
	private static final int IMAGESHEIGHT = 50;
	private static final int STRINGPOSITIONWIDTH = 50;
	private static final int STRINGPOSITIONHEIGHT = 15;
	private String code = "1554";
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestVerificationCodeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BufferedImage image = new BufferedImage(IMAGESWIDTH, IMAGESHEIGHT, BufferedImage.TYPE_INT_RGB);
		Graphics graphics = image.createGraphics();
		graphics.drawLine(20, 20, 20, 20);
		graphics.setColor(Color.WHITE);
		response.setContentType("image/jpeg");
		ImageIO.write(image, "jpeg", response.getOutputStream());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
