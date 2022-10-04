package com.service;

public class interfaceimplementation implements ReverseService {

	@Override
	public void reverseString(String s) {
		char[] st=s.toCharArray();
		for(int i=st.length-1;i>=0;i--) {
			System.out.print(st[i]);
		}
		
		
	}

}
