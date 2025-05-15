package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Ex04 {

	public static void main(String[] args) throws IOException{

		Reader fr = new FileReader("/Users/kangsubin/Desktop/javaStudy/PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		List<Person> pList = new ArrayList<Person>();
		
		while(true) {
			
			String str = br.readLine();
			
			if(str == null) {
				break;
			}
			
			String[] pArray = str.split(",");
			
			String name = pArray[0];
			String hp = pArray[1];
			String company = pArray[2];
			
			Person person = new Person(name, hp, company);
			pList.add(person);
		
			
			//System.out.println(str);
		
		}
		for(Person p : pList) {
			p.showInfo();
		}//이게 맞나,,,,,,,ㅜㅜ
		
		
		br.close();
		
	}

}
