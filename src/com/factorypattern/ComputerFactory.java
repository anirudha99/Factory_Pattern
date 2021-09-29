package com.factorypattern;

public class ComputerFactory {

	public Computer getComputer(Computer.Budget budget,
			short hardDiskName, String mouseName, String keyboardName) {
		
		Ram ram = RamFactory.getInstance().get(budget);
		HardDisk hardDisk = new HardDisk(hardDiskName);
		Processor processor = ProcessorFactory.getInstance().get(budget);
		Mouse mouse = new Mouse(mouseName);
		Keyboard keyboard = new Keyboard(keyboardName);
		Computer computer = new Computer();
		
		
		
		computer.setRam(ram);
		computer.setHardDisk(hardDisk);
		computer.setProcessor(processor);
		computer.setMouse(mouse);
		computer.setKeyboard(keyboard);
		computer.setPrice(55000);

		return computer;
	}
}
