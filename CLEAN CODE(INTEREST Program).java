import java.util.*;
public class Interest {
	public  float p,t,r;
	public float si;
	public void simpleInterest(int p,int t,int r) {
		si=(p*t*r)/100;
		System.out.format(" Simple Interest : %f",si);
		
	}
	float ci;
	public void compoundInterest(int p,int t,int r) {
		ci=(float) ((p*Math.pow((1+(r/100)),t)));
		System.out.format("\n Compound Interest : %f",ci);
	}
	}