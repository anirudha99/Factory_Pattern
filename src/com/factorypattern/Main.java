package com.factorypattern;

public class Main {

	public static void main(String[] args) {
		Ram ram = new Ram((byte) 16);
		HardDisk hardDisk = new HardDisk((short) 500);
		Processor processor = new Processor("i5", "intel");
		Mouse mouse = new Mouse("Logitech");
		Keyboard keyboard = new Keyboard("HP");
		Computer computer = new Computer();
		
		computer.setRam(ram);
		computer.setHardDisk(hardDisk);
		computer.setProcessor(processor);
		computer.setMouse(mouse);
		computer.setKeyboard(keyboard);
		computer.setPrice(55000);
		
		computer.setHardDisk(hardDisk).setKeyboard(keyboard)
		.setMouse(mouse).setPrice(50000).setProcessor(processor);
		
		Ram ram2 = new Ram((byte) 8);
		HardDisk hardDisk2 = new HardDisk((short) 256);
		Processor processor2 = new Processor("i3", "intel");
		Mouse mouse2 = new Mouse("Readgear");
		Keyboard keyboard2 = new Keyboard("HP");
		Computer computer2 = new Computer();
		
		computer2.setRam(ram);
		computer2.setHardDisk(hardDisk);
		computer2.setProcessor(processor);
		computer2.setMouse(mouse);
		computer2.setKeyboard(keyboard);
		computer2.setPrice(45000);
		
		computer2.setHardDisk(hardDisk).setKeyboard(keyboard)
		.setMouse(mouse).setPrice(60000).setProcessor(processor);
		
		ComputerFactory computerFactory = new ComputerFactory();
		Computer computer3 = computerFactory.getComputer(Computer.Budget.LOW,(short) 1000, "Dell", "Logitech");
	}
}
