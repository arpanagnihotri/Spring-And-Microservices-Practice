package com.client;

import java.util.Scanner;

import com.service.ReverseService;
import com.service.interfaceimplementation;

public class client {

	public static void main(String[] args) {
		ReverseService rs=new interfaceimplementation();
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		rs.reverseString(s);

	}

}
