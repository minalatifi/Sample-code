import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class MyFrame extends JFrame implements ActionListener

{
	private Zoom zoom = new Zoom();
	private Rotate rotate = new Rotate();
	private JFrame frame = new JFrame("Image Viewer");
	private JPanel imagePanel= new JPanel();
	private JPanel buttonPanel = new JPanel();
	private JMenuBar menuBar = new JMenuBar();
	private JMenu fileMenu = new JMenu("File");
	private JMenuItem openItem = new JMenuItem("Open");
	private JMenuItem quitItem = new JMenuItem("Quit");
	private JMenu editMenu = new JMenu("Edit");
	private JMenuItem rotateLeftItem = new JMenuItem("Rotate left");
	private JMenuItem rotateRightItem = new JMenuItem("Rotate right");
	private JMenuItem zoomInItem = new JMenuItem("Zoom In");
	private JMenuItem zoomOutItem = new JMenuItem("Zoom Out");
	private JLabel label = new JLabel();
	private BorderLayout layout = new BorderLayout(5,5); 
	private JFileChooser fileChooser= new JFileChooser(); 
	private ArrayList<File> selectedFiles = new ArrayList<File>();
	private Icon image;
	private  BufferedImage bufferImage = null;
	private Container contentPane = frame.getContentPane();
	private JButton nextButton = new JButton("Next");
	private JButton previousButton = new JButton("Previous");
	private int index=0;
	
	public MyFrame()
	{
		makeFrame();
		makeMenuBar();
	}
	
	private void makeFrame()
	{
		frame.setLayout(layout);
		frame.setBounds(100, 100, 1600, 1600);
		buttonPanel.add(previousButton,BorderLayout.LINE_START);
		buttonPanel.add(nextButton,BorderLayout.LINE_START);
	    contentPane.add(buttonPanel,BorderLayout.NORTH);
	    nextButton.addActionListener(this);
	    previousButton.addActionListener(this);
	    frame.setVisible(true);
	   
	}
	
	private void makeMenuBar()
	{
		frame.setJMenuBar(menuBar);
		menuBar.add(fileMenu);
		fileMenu.add(openItem);
		openItem.addActionListener(this);
		fileMenu.add(quitItem);
		quitItem.addActionListener(this);
		menuBar.add(editMenu);
		editMenu.add(rotateLeftItem);
		rotateLeftItem.addActionListener(this);
		editMenu.add(rotateRightItem);
		rotateRightItem.addActionListener(this);
		editMenu.add(zoomInItem);
		zoomInItem.addActionListener(this);
		editMenu.add(zoomOutItem);
		zoomOutItem.addActionListener(this);

	}
	
	public void openImage()
	{
		String input= JOptionPane.showInputDialog("How many images? ");
		int in = Integer.parseInt(input);

		fileChooser.setMultiSelectionEnabled(true);
		fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
		int result;
		System.out.println(in);
		for(int i=0 ; i<in ; i++)
		{
			result = fileChooser.showOpenDialog(this);
			if (result == JFileChooser.APPROVE_OPTION) 
			{
				selectedFiles.add ( fileChooser.getSelectedFile());
				System.out.println("Selected file: " + selectedFiles.get(i).getAbsolutePath());
		    }
			try
			{
				bufferImage = ImageIO.read(new File(selectedFiles.get(0).getAbsolutePath()));
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			image = new ImageIcon(bufferImage);
		    label.setIcon(image);
		    
		    imagePanel.add(label);
		}
	}

	@Override
	public void actionPerformed(ActionEvent event) 
	{
		String command = event.getActionCommand();
		
		
		if(command.equals("Open")) 
		{
			openImage();
			contentPane.add(imagePanel,BorderLayout.CENTER);
			frame.pack();
		}
		else if(command.equals("Next"))
		{
			index++;
			System.out.println(index);
	        try
	        {
	          bufferImage = ImageIO.read(new File(selectedFiles.get(index).getAbsolutePath()));
	        }
	        catch (Exception e)
	        {
	        	index--;
	        	System.out.print("Exeption ");
	        }
			image = new ImageIcon(bufferImage);
		    label.setIcon(image);
		    imagePanel.add(label);
		    contentPane.add(imagePanel,BorderLayout.CENTER);
		}
		
		else if(command.equals("Previous"))
		{
			index--;
			System.out.println(index);
	        try
	        {
	          bufferImage = ImageIO.read(new File(selectedFiles.get(index).getAbsolutePath()));
	        }
	        catch (Exception e)
	        {
	          System.out.print("Exeption ");
	          index++;
	        }
			image = new ImageIcon(bufferImage);
		    label.setIcon(image);
		    imagePanel.add(label);
		    contentPane.add(imagePanel,BorderLayout.CENTER);
		}
		else if(command.equals("Zoom In"))
		{
			bufferImage=zoom.ZoomIn(2,bufferImage);
			image = new ImageIcon(bufferImage);
			
		    label.setIcon(image);
		    imagePanel.add(label);
		}
		else if(command.equals("Zoom Out"))
		{
			bufferImage=zoom.ZoomOut(2, bufferImage);
			image = new ImageIcon(bufferImage);
		    label.setIcon(image);
		    imagePanel.add(label);
		}
		else if(command.equals("Rotate right"))
		{
			bufferImage=rotate.rotateRight(bufferImage);
			image = new ImageIcon(bufferImage);
		    label.setIcon(image);
		    imagePanel.add(label);
		}
		else if(command.equals("Rotate left"))
		{
			bufferImage=rotate.rotateLeft(bufferImage);
			image = new ImageIcon(bufferImage);
		    label.setIcon(image);
		    imagePanel.add(label);
		}
		else if(command.equals("Quit"))
		{
	        System.exit(0);
		}
	}
 
	

}
