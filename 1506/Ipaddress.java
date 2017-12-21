package com.test;

import java.util.regex.*;
import java.util.*;


public class Ipaddress {
	
		
	public static void main(String[] args) {
		boolean val;
		String ip;
		Scanner iscan = new Scanner(System.in);
		System.out.println("Please enter the IP Adress :");
		ip = iscan.nextLine();
		val = Pattern.matches("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$" , ip);
		
		if (val == true)
		{
			System.out.println("This is a valid IP Address");
		}
		else
		{
			System.out.println("This is a not a valid IP Address");
		}
		
			
	}

}
