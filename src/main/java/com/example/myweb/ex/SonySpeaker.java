package com.example.myweb.ex;

public class SonySpeaker implements Speaker {
	
	private int volume;

	@Override
	public void setVolume(int volume) {
		System.out.println("Sony 스피커 볼륨 셋");
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}

}
