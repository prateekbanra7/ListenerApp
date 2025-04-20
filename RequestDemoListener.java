package in.abc.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class RequestDemoListener implements ServletRequestListener {

	public static int count = 0;

	public RequestDemoListener() {
		// TODO Auto-generated constructor stub
	}

	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("Request object destroyed ::" + new java.util.Date());
	}

	public void requestInitialized(ServletRequestEvent sre) {
		count++;
		System.out.println("Request object got created at ::" + new java.util.Date());
		System.out.println("No of hit for this webapplication is ::" + count);
	}

}
