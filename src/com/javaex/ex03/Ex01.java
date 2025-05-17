package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex01 {

	public static void main(String[] args) throws IOException{

		//UTF-8로 해석돼서 깨진다, 파일은 MS949형식
		
		
		//주 스트림 준비
		//window => "C:\\javaStudy\\MS949.txt"
		//mac => "/Users/kangsubin/Desktop/javaStudy/MS949.txt"
		Reader fr = new FileReader("C:\\javaStudy\\MS949.txt");
		//보조 스트림 준비
		BufferedReader br = new BufferedReader(fr);
		System.out.println("-------------------------스트림 준비완료");
		
		while(true) {
			
			String str = br.readLine();
			
			if(str == null) {
				System.out.println("-------------------------파일 읽기 끝");
				break;
			}
			
			System.out.println(str);
		}
		
		
		//스트림 닫기
		br.close();
		
		System.out.println("-------------------------프로그램 종료");
		
	}

}
