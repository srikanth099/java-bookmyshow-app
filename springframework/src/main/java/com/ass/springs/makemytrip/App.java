package com.ass.springs.makemytrip;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ass.springs.makemytrip.config.AppConfiguration;
import com.ass.springs.makemytrip.util.BookTicket;
import com.ass.springs.makemytrip.util.PaymentGateWay;
//we are using one of the incrementation class of application context(Interface)
public class App 
{
    public static void main( String[] args )
    {
    	
//    	BookTicket ticket = new BookTicket();
//    	PaymentGateWay py=new PaymentGateWay();
    	
    	@SuppressWarnings("resource")
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
    	ctx.register(AppConfiguration.class);
    	ctx.refresh();
    	PaymentGateWay gateWay = ctx.getBean(PaymentGateWay.class);
//    	gateWay.makePayment();
//    	System.out.println(gateWay);
  
    	BookTicket bean=ctx.getBean(BookTicket.class);
    	System.out.println(bean);
    	
    }
}

/*Object Life cycle::life cycle is nothing but a process which will be starting to ending.
 * 
 * 1)pre constructor destroy()
 * 2)post constructor destroy()
 * 
 * 
 * containers:-
 * to manage our lifecycles:
 * Spring Container
 * 1)BeanFactory(Interface) how internal objects are created basic application**AOP and web module 
 * 2)Application(Interface) Context
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */