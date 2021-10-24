package org.add;

public class GreensTech {
	
	private void greensOmr() {
		System.out.println("Greens Details");
	}
	
	private void greensOmr(float add,String address) {
		System.out.println("add is"+add+address);
	}
	public static void main(String[] args) {
		GreensTech a=new GreensTech();
		a.greensOmr();
		a.greensOmr(1/8f, "no8 shanthi nagar");
		
	}

}
