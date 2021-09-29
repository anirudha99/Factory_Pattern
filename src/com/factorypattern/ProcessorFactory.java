package com.factorypattern;

public class ProcessorFactory {
	private static ProcessorFactory instance;
	
	private ProcessorFactory() {

	}
	
	public static ProcessorFactory getInstance() {
		if(instance == null) {
			instance = new ProcessorFactory();
		}
		return instance;
	}

	public Processor get(Computer.Budget budget) {

		switch(budget) {
		case LOW:
			return new Processor("Ryzen3", "AMD");
		case MEDIUM:
			return new Processor("i5", "Intel");
		case HIGH:
			return new Processor("i7", "Intel");
		}
		return null;
	}
}
