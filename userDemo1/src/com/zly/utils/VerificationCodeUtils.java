package com.zly.utils;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


//������֤��ͼƬ
public class VerificationCodeUtils {

	 //1.����map���� �洢��֤���ַ�������֤��ͼƬ����
	static Map<String, Object> codeMap;
	
	//2.����char���鱣����֤������ַ�
	private static char[] codeSequence = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
	
	//3.���������涨��֤��ͼƬ��ͼƬ���ַ�λ��
	private static final int IMAGESWIDTH = 200;
	private static final int IMAGESHEIGHT = 50;
	private static final int STRINGPOSITIONWIDTH = 45;
	private static final int STRINGPOSITIONHEIGHT = 35;
	private static int fontHeight = 18;
	
	public static Map<String, Object> GenerateVerificationCodeImages(){
		//5.ʵ����������֤���ַ���ͼƬmap����
		codeMap = new HashMap<String, Object>();
		
		//6.����BufferedImageͼƬ����������
		BufferedImage bi = new BufferedImage(IMAGESWIDTH,IMAGESHEIGHT,BufferedImage.TYPE_INT_RGB);
		
		//7.����Graphics����
		Graphics graphics = bi.createGraphics();
		
		//8.�涨������ɫ
		graphics.setColor(Color.GREEN);
		
		//8.��������
		graphics.fillRect(0, 0, IMAGESWIDTH, IMAGESHEIGHT);
		
		Font font = new Font("Fixedsys", Font.BOLD, fontHeight);

		graphics.setFont(font);
		
		//9.����BufferString����洢�����
		StringBuffer randomCode = new StringBuffer();
		
		//10.�������������
		Random random = new Random();
		
		//11.������֤���ַ���ɫ
		graphics.setColor(Color.RED);
		
		//12.��������� ��Ⱦgraphics����
		for(int i = 1;i<=4;i++){
			int index = random.nextInt(35);
			randomCode.append(codeSequence[index]);
			graphics.drawString(codeSequence[index]+"",STRINGPOSITIONWIDTH*i , STRINGPOSITIONHEIGHT);
		}
		
		//13.�������������ȾGraphics
		graphics.setColor(Color.BLUE);
	    for (int i = 0; i < 30; i++) {
            int x = random.nextInt(IMAGESWIDTH);
            int y = random.nextInt(IMAGESHEIGHT);
            int xl = random.nextInt(12);
            int yl = random.nextInt(12);
            graphics.drawLine(x, y, x + xl, y + yl);
	    }
		
	    //14.ͼƬ��֤�봢���map����
	    codeMap.put("codeString", randomCode.toString());
	    codeMap.put("codeImages", bi);
		
		return codeMap;
	}
}
