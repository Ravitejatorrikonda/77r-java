package com.interfacee.Telivision;

public class DishTv implements Smarttv {

	@Override
	public void powerOn() {
		System.out.println("to power on the dish Tv");
		
	}

	@Override
	public void powerOf() {
	System.out.println("to power of the dish tv");
		
	}

	@Override
	public void volumeIncrease(double volume) {
		System.out.println("to increseae the volume"+(Smarttv.defaultVolume+volume));
		
	}

	@Override
	public void volumeDecerease(double volume) {
		System.out.println("to decrease the dish tv volume"+(Smarttv.defaultVolume-volume));
		
	}

	@Override
	public void changeChannel(double channelNumber) {
		System.out.println("changing the channel number"+channelNumber);
		
	}

}
