package com.factorypattern;

public class RamFactory {
	private static RamFactory instance;
	private RamFactory() {

	}

	public static RamFactory getInstance() {
		if(instance == null) {
			instance = new RamFactory();
		}
		return instance;
	}

	public Ram get(Computer.Budget budget) {

		switch(budget) {
		case LOW:
			return new Ram((byte) 4);
		case MEDIUM:
			return new Ram((byte) 8);
		case HIGH:
			return new Ram((byte) 16);
		}
		return null;

	}
}
