package com.example.myweb.ex;

public class LgTV implements TV {
private Speaker speaker;
	
	@Override
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	@Override
	public void turnOn() {
		System.out.println("LG TV 켜기");
	}

	@Override
	public void turnOff() {
		System.out.println("LG TV 끄기");
	}

	@Override
	public void changeVolume(int volume) {
		speaker.setVolume(volume);
		System.out.println("LG TV 스피커 볼륨 = " + speaker.getVolume());
	}
}
