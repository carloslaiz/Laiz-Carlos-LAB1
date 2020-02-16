package com.sample;


public class source {

	public static void main(String[] args) {
		practice c1 = new practice("Acer Nitro 5", "GTX 1050ti","i5", 8);
		practice c2 = new practice("TUF ASUS", "RTX 2060","Ryzen 3750", 16);
		practice c3 = new practice("ZEPHYRUS G", "RTX 2080ti","i9", 32);
			

				
		System.out.println(c1.getName() +" w/ "+ c1.getGpu() +" and "+ c1.getProcc() + " RAM:" + c1.getRam() +"GB");
		System.out.println(c2.getName() +" w/ "+ c2.getGpu() +" and "+ c2.getProcc() + " RAM:" + c2.getRam() +"GB");
		System.out.println(c3.getName() +" w/ "+ c3.getGpu() +" and "+ c3.getProcc() + " RAM:" + c3.getRam() +"GB");
		
		
		System.out.println("Congrats you have chosen:");
		String x = "One";
		switch(x)
		{
		case "One":
		{
		System.out.println("Acer Nitro 5");
		break;
	    }
		case "Two":
		{
		System.out.println("TUF ASUS");
		break;
	    }
		case "Three":
		{
		System.out.println("ZEPHYRUS G");
		break;
	    }
			
			
		}
		
		}
	}


