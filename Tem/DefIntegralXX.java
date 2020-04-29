package Tem;

public class DefIntegralXX extends ADefiniteIntegral{
	private double a,b;
	private int c;
	
	public DefIntegralXX(double a,double b,int c)
	{this.a=a;this.b=b;this.c=c;}
	
	protected double geta() {
		return a;
	}
	
	protected double getb() {
		return b;
	}
	
	protected int getc() {
		return c;
	}
	
	protected double function(double x) {
		return x;
	}
}
