package Message;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.*;
public class Link
{
  public static void m1() throws AWTException, InterruptedException {
	String num="7609827177";
	Runtime rt=Runtime.getRuntime();
	String url="https://api.whatsapp.com/send/?phone="+ num+"&text&type=phone_number&app_absent=0";
		try
		{
			rt.exec( "rundll32 url.dll,FileProtocolHandler "  + url);
		} catch (IOException e) 
		{
			e.printStackTrace();
		
		}
		
		Thread.sleep(5000);		
		Robot ro=new Robot();
		
		for (int i=1;i<12;i++)
		{
			ro.keyPress(KeyEvent.VK_TAB);
			ro.keyRelease(KeyEvent.VK_TAB);
			if (i==11)
			{
				Thread.sleep(500);		
			}
		}
		
		ro.keyPress(KeyEvent.VK_ENTER);	
		ro.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		for (int i=1;i<3;i++)
		{
			Thread.sleep(1000);
			ro.keyPress(KeyEvent.VK_TAB);
			ro.keyRelease(KeyEvent.VK_TAB);
			
		}
		
		ro.keyPress(KeyEvent.VK_ENTER);	
		ro.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		
		
		
		
		//StringSelection s1=new StringSelection(num);
		//Clipboard cb=Toolkit.getDefaultToolkit().getSystemClipboard();
		//cb.setContents(s1, null);
		
		
		//Thread.sleep(1000);		
		
}
  public static void m2()  throws InterruptedException, AWTException, FileNotFoundException
  {
	  Scanner s = new Scanner(new File("G:\\num.txt"));
	  ArrayList list = new ArrayList();
	  while (s.hasNext())
	  {
	      list.add(s.next());
	  }
	  s.close();
	  for (int h=0;h<list.size();h++)
	  {
	    
	  String num=(String) list.get(h);
		Runtime rt=Runtime.getRuntime();
		if(h==0) {
		String url="https://web.whatsapp.com/";
		
		
		
			try
			{
				rt.exec( "rundll32 url.dll,FileProtocolHandler "  + url);
			} catch (IOException e) 
			{
				e.printStackTrace();
			
			}
			Thread.sleep(20000);
		}
			
			 StringSelection s1=new StringSelection(num);
				Clipboard cb=Toolkit.getDefaultToolkit().getSystemClipboard();
				cb.setContents(s1, null);
					
			Robot ro=new Robot();  
			
		    ro.keyPress(KeyEvent.VK_CONTROL);
		    ro.keyPress(KeyEvent.VK_ALT);
		    ro.keyPress(KeyEvent.VK_N);
		    
		    
		    ro.keyRelease(KeyEvent.VK_CONTROL);
		    ro.keyRelease(KeyEvent.VK_ALT);
		    ro.keyRelease(KeyEvent.VK_N);
			
		    Thread.sleep(1000);
			ro.keyPress(KeyEvent.VK_CONTROL);
			ro.keyPress(KeyEvent.VK_V);
			Thread.sleep(1000);
			
			ro.keyRelease(KeyEvent.VK_CONTROL);
			ro.keyRelease(KeyEvent.VK_V);
			Thread.sleep(1000);
			
			ro.keyPress(KeyEvent.VK_ENTER);	
			ro.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			
			Text link=new Text();
			link.m3();
	  }
	  
  }
			
  
  public void m3() throws AWTException, InterruptedException
  {}
}
