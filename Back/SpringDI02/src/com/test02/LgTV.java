package com.test02;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component("lg")
public class LgTV implements TV {

	public LgTV() {
		super();
		System.out.println("LgTV constructor");
	}

	@Override
	public void powerOn() {
		System.out.println("lg tv on");

	}

	@Override
	public void powerOff() {
		System.out.println("lg tv off");
		// TODO Auto-generated method stub

	}

	@Override
	public void volumnUp() {
		System.out.println("lg tv volumnUp");
		// TODO Auto-generated method stub

	}

	@Override
	public void volumnDown() {
		System.out.println("lg tv volumnDown");
		// TODO Auto-generated method stub

	}

}
