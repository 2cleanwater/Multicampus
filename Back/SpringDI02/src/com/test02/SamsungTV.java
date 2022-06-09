package com.test02;

import org.springframework.stereotype.Component;

@Component("samsung")
public class SamsungTV implements TV {

	public SamsungTV() {
		super();
		System.out.println("SamsungTV constructor");
	}

	@Override
	public void powerOn() {
		System.out.println("SamsungTV  on");

	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV  off");
		// TODO Auto-generated method stub

	}

	@Override
	public void volumnUp() {
		System.out.println("SamsungTV  volumnUp");
		// TODO Auto-generated method stub

	}

	@Override
	public void volumnDown() {
		System.out.println("SamsungTV  volumnDown");
		// TODO Auto-generated method stub

	}

}
