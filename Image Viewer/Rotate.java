
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;



public class Rotate 
{
	private AffineTransform at = new AffineTransform();
	
	
	public BufferedImage rotateRight(BufferedImage image)
	{
		int imageWidth =  image.getWidth();
		int imageHeight = image.getHeight();
		BufferedImage resizedImage = new BufferedImage (imageWidth , imageHeight , BufferedImage.TYPE_INT_ARGB);
		at.translate(imageWidth/2 , imageHeight/2);
		at.rotate(Math.PI/2);
		at.translate(-image.getWidth()/2, -image.getHeight()/2);
		Graphics2D g = resizedImage.createGraphics();
		g.drawImage(image, at, null);
		g.dispose();
		return resizedImage;

		
	}
	public BufferedImage rotateLeft(BufferedImage image)
	{
		int imageWidth =  image.getWidth();
		int imageHeight = image.getHeight();
		BufferedImage resizedImage = new BufferedImage (imageWidth , imageHeight , BufferedImage.TYPE_INT_ARGB);
		at.translate(imageWidth/2, imageHeight/2);
		at.rotate(-Math.PI/2);
		at.translate(-image.getWidth()/2 , -image.getHeight()/2);
		Graphics2D g = resizedImage.createGraphics();
		g.drawImage(image, at, null);
		g.dispose();
		return resizedImage;
		
	}

}
