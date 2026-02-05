package com.interfacee.Telivision;

public class SmarttvMain {

	public static void main(String[] args) {
		Smarttv tv;
		tv=new DishTv();
		tv.powerOf();
		tv.powerOn();
		tv.volumeIncrease(34);
		tv.volumeDecerease(43);
		tv.changeChannel(05);

	}

}
