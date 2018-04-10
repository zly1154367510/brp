package com.zly.VerificationCode;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;



public class codeUtil {
	private static final int IMAGESWIDTH = 200;
	private static final int IMAGESHEIGHT = 50;
	private static final int STRINGPOSITIONWIDTH = 45;
	private static final int STRINGPOSITIONHEIGHT = 35;
	private static int fontHeight = 18;
	private static char[] codeSequence = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	/**
	 * @param args
	 * 生成验证码
	 */
	
	static Map<String,Object> getCodeImage(){
		Map<String,Object> codeMap = new HashMap<String, Object>();
		
		BufferedImage bi = new BufferedImage(IMAGESWIDTH,IMAGESHEIGHT,BufferedImage.TYPE_INT_RGB);
		
		Graphics graphics = bi.createGraphics();
		
		graphics.setColor(Color.WHITE);
		
		graphics.fillRect(0, 0, IMAGESWIDTH, IMAGESHEIGHT);
		
		Font font = new Font("Fixedsys", Font.BOLD, fontHeight);

		graphics.setFont(font);
		
		StringBuffer randomCode = new StringBuffer();
		
		Random random = new Random();
		graphics.setColor(Color.GREEN);
	    for (int i = 0; i < 30; i++) {
            int x = random.nextInt(IMAGESWIDTH);
            int y = random.nextInt(IMAGESHEIGHT);
            int xl = random.nextInt(12);
            int yl = random.nextInt(12);
            graphics.drawLine(x, y, x + xl, y + yl);
	    }
	

		
		for (int i = 0; i < 4; i++) {
			int index = random.nextInt(35);
			randomCode.append(codeSequence[index]+"");
			graphics.drawString(codeSequence[index]+"",STRINGPOSITIONWIDTH *i, STRINGPOSITIONHEIGHT);
			
		}
		codeMap.put("codeValue", randomCode);
		codeMap.put("codeImages", bi);
		
		return codeMap;
	}


}
