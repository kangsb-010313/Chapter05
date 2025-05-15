package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		/*
	    //반복
		Phone08.txt 파일을 한 줄 씩 읽는다, (MS949방식으로 저장되어 있음)
		
		"이효리,010-2222-3333,031-2323-4441" 을 ","로 구분한다 --> 배열
		
		
		//반복
		===>리스트에 정리
		[0x111] [0x333] [0x888]
		
		0x111 name = 이효리, hp = 010-2222-3333, company = 031-2323-4441 ==>Person
		
		for문으로 출력
		=> 문제에 있는 형식으로 출력
		*/
		
		Reader fr = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		
		while(true) {
			
			String str = br.readLine();
			
			if(str == null) {
				break;
			}
			
			String[] iArray = str.split(",");
			
			String name = iArray[0];
			String hp = iArray[1];
			String company = iArray[2];
			
			
			
			System.out.println("이름: " + name);
			System.out.println("핸드폰: " + hp);
			System.out.println("회사: " + company);
			System.out.println("");
			
			//System.out.println(str);
			
		}
		
		
		br.close();
		


		
		
		
		
		
	}

}
