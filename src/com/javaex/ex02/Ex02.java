package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {

	public static void main(String[] args) throws IOException{
		
		//주 스트림 준비
		Reader fr = new FileReader("C:\\javaStudy\\song.txt"); 
		
		//보조 스트림 준비
		BufferedReader br = new BufferedReader(fr);
		
		System.out.println("스트림 준비완료");
		
		while(true) {
			
			String str = br.readLine(); //한 줄 출력(?)
			
			if(str == null) { //str.equals(null) 아닌 이유 -> 문자가 같냐 물어보는게 아님
				System.out.println("파일 읽기 끝");
				break;
			}
			
			System.out.println(str);
		
		}
		
		//스트림 정리
		br.close();
		
		System.out.println("프로그램 종료");
		
	}

}
