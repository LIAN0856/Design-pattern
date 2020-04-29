package DProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ClocalPicShow {
	private Object target;
	public ClocalPicShow(Object target)
	{
		super();
		this.target=target;
	}
	public Object getProxyInstance()
	{
		return Proxy.newProxyInstance(
				target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(),
				new InvocationHandler() {

					@Override
					public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
						// TODO Auto-generated method stub
						System.out.println("◊º±∏‘ÿ»ÎÕº∆¨"+arg2[0].toString());
						Thread thr=new Thread(new Runnable() {
							public void run() {
								try {
									arg1.invoke(target, arg2);
								} catch (IllegalAccessException | IllegalArgumentException
										| InvocationTargetException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						});//new thread end
						thr.start();
						return null;
					}
				});
				
	  }
}			
	
