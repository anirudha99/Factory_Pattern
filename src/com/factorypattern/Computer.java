package com.factorypattern;

public class Computer {
	Ram ram;
	HardDisk hardDisk;
	Mouse mouse;
	Keyboard keyboard;
	Processor processor;
	int price;

	enum Budget{ LOW, MEDIUM, HIGH};

	public Ram getRam() {
		return ram;
	}

	public int getPrice() {
		return price;
	}

	public Computer setPrice(int price) {
		this.price = price;
		return this;
	}

	public Computer setRam(Ram ram) {
		this.ram = ram;
		return this;
	}

	public HardDisk getHardDisk() {
		return hardDisk;
	}

	public Computer setHardDisk(HardDisk hardDisk) {
		this.hardDisk = hardDisk;
		return this;
	}

	public Mouse getMouse() {
		return mouse;
	}

	public Computer setMouse(Mouse mouse) {
		this.mouse = mouse;
		return this;
	}

	public Keyboard getKeyboard() {
		return keyboard;
	}

	public Computer setKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
		return this;
	}

	public Processor getProcessor() {
		return processor;
	}

	public Computer setProcessor(Processor processor) {
		this.processor = processor;
		return this;
	}

}
