package liu;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvis {
	
	public Object  around(ProceedingJoinPoint pj) throws Throwable{
		System.out.println("我是环绕通知前半段");
		Object proceed = pj.proceed();
		System.out.println("我是环绕通知后半段");
		return proceed;
	}
	
	
	public void  fater(){
		System.out.println("我是后置通知，并且异常也执行！");
	}
	
	
	public void  before(){
		System.out.println("我是前置通知");
	}
	
	
	public void  afterReturning(){
		System.out.println("我是后置返回通知");
	}
	
	
	public void  afterThrowing(){
		System.out.println("我是后置异常通知");
	}
	

}
