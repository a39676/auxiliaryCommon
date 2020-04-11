package image.service;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import image.pojo.bo.PixColor;

public class ImageService {

	public BufferedImage pickImage(String filePath) throws IOException {
		File tmpScreenshotFile = new File(filePath);
		return ImageIO.read(tmpScreenshotFile);
	}
	
	public boolean hadColor(BufferedImage image, PixColor pc) {
		if(image == null || pc == null) {
			return false;
		}
		
		int clr = 0;
		PixColor p = null;
		for (int x = 1; x < image.getWidth(); x++) {
			for (int y = 1; y < image.getHeight(); y++) {
				p = new PixColor();
				clr = image.getRGB(x, y);
				p.setRed((clr & 0x00ff0000) >> 16);
				p.setGreen((clr & 0x0000ff00) >> 8);
				p.setBlue(clr & 0x000000ff);
				if(pc.equals(p)) {
					return true;
				}
			}
		}
		return false;
	}
	
}
