package com.interfacee.Telivision;

public interface Smarttv {

	double defaultVolume=100;
	
	void powerOn();
	void powerOf();
	
	void volumeIncrease(double volume);
	void volumeDecerease(double volume);
	void changeChannel(double channelNumber);
	
}
