package Message;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Scanner;
import java.lang.*;

public class Text extends Link
{
	public static void main(String[] args) throws AWTException, InterruptedException, IOException 
	{
		
		
		m2();
	}
	
	public  void m3() throws AWTException, InterruptedException   {
		
		String msg= "Goodnight";
		int x=1;
		
		
		Thread.sleep(1000);
		Robot r= new Robot();
		
		
		

		StringSelection ss=new StringSelection(msg);
		Clipboard cl=Toolkit.getDefaultToolkit().getSystemClipboard();
		cl.setContents(ss, null);
		
		
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
		
		
		
		for (int i=0;i<x;i++)
		{
	    
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		}
		
	
	}
	
}
