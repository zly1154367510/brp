package com.zly.web.controller;

import java.awt.image.RenderedImage;
import java.io.IOException;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.zly.utils.VerificationCodeUtils;

/**
 * Servlet implementation class VerificationCodeServlet
 */
@WebServlet("/VerificationCodeServlet")
public class VerificationCodeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerificationCodeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1.��ȡ�洢��֤���map����
		Map<String, Object> codeMap = VerificationCodeUtils.GenerateVerificationCodeImages();
		//2.����֤���ַ��洢��request�洢�ռ�
		request.getSession().setAttribute("codeString", codeMap.get("codeString"));
		
		//3.�������
		System.out.println(codeMap.get("codeString"));
		
		//4.������Ӧ����ͷ
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", -1);
		response.setContentType("image/jpeg");
		
		//5.����servlet�����
		ServletOutputStream sos = response.getOutputStream();
		ImageIO.write((RenderedImage) codeMap.get("codeImages"), "jpeg", sos);
		sos.close();
	}

}
