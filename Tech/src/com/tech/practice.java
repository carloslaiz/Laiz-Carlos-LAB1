package com.tech;

public class practice {
	private String name;
	private String gpu;
	private String procc;
	private int ram;

	practice(String name, String gpu, String procc, int ram){
		this.name = name;
		this.gpu = gpu;
		this.procc = procc;
		this.ram = ram;
		
		System.out.println("Hello what device would you like??");
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getGpu() {
		return this.gpu;
	}

	public String getProcc() {
		return this.procc;
	}

	public int getRam() {
		return this.ram;
	}
	
	
	
	
	
	
	}


