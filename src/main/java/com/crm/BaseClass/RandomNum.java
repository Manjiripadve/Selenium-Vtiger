package com.crm.BaseClass;

import java.util.Random;

public class RandomNum {

	public static int random()
	{
		Random r=new Random();
		int num = r.nextInt(100);
		return num;
	}
	
}
