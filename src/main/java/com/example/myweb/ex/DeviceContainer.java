package com.example.myweb.ex;

public class DeviceContainer {
	
	// 외부에서 TV명이 들어오면 해당 TV객체를 반환한다.
	public static TV getTV(String tvName, String speakerName) {
		String pkg = "com.example.myweb.ex.";
		try {
			// 스피커 생성
			Speaker speaker = (Speaker) Class.forName(pkg + speakerName).newInstance();
			// TV생성
			TV tv = (TV) Class.forName(pkg + tvName).newInstance();
			tv.setSpeaker(speaker);
			
			return tv;
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}
