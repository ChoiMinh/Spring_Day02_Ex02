package com.example.myweb.ex;

public class SamsungTV implements TV {
	
	private Speaker speaker;
	
	@Override
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	@Override
	public void turnOn() {
		System.out.println("삼성 TV 켜기");
	}

	@Override
	public void turnOff() {
		System.out.println("삼성 TV 끄기");
	}

	@Override
	public void changeVolume(int volume) {
		speaker.setVolume(volume);
		System.out.println("삼성 TV 스피커 볼륨 = " + speaker.getVolume());
	}

}
