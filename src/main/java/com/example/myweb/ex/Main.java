package com.example.myweb.ex;

public class Main {
	
	public static void main(String[] args) {
		
		TV tv = null;
		if(args.length >= 2) {
			tv = DeviceContainer.getTV(args[0], args[1]);
		} else {
			tv = DeviceContainer.getTV("LgTV", "SonySpeaker");
		}
		
		tv.turnOn();
		tv.changeVolume(6);
		tv.turnOff();
	}
	
}
