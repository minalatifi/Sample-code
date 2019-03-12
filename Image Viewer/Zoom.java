import java.awt.Graphics2D;
import java.awt.image.BufferedImage;


public class Zoom 
{
	public BufferedImage ZoomIn(int factor , BufferedImage image)
	{
		int newImageWidth =  image.getWidth() * factor;
		int newImageHeight = image.getHeight() * factor;
		BufferedImage resizedImage = new BufferedImage (newImageWidth , newImageHeight,BufferedImage.TYPE_INT_ARGB);
		Graphics2D g = resizedImage.createGraphics();
		g.drawImage(image,0,0, newImageWidth , newImageHeight , null);
		g.dispose();
		return resizedImage;
	}
	public BufferedImage ZoomOut(int factor , BufferedImage image)
	{
		int newImageWidth =  image.getWidth() / factor;
		int newImageHeight = image.getHeight() / factor;
		BufferedImage resizedImage = new BufferedImage (newImageWidth , newImageHeight,BufferedImage.TYPE_INT_ARGB);
		Graphics2D g = resizedImage.createGraphics();
		g.drawImage(image,0,0, newImageWidth , newImageHeight , null);
		g.dispose();
		return resizedImage;
	}

}
