package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex02 {

	public static void main(String[] args) throws IOException{
		
		//window => "C:\\javaStudy\\MS949.txt"
		//mac => "/Users/kangsubin/Desktop/javaStudy/MS949.txt"
		
		//읽기스트림 준비
		InputStream in = new FileInputStream("C:\\javaStudy\\MS949.txt"); //주 스트림 --> 2진수로 읽어온다
		InputStreamReader isr = new InputStreamReader(in, "MS949");	//보조 스트림 --> 2진수를 MS949형식으로 해석한다
		BufferedReader br = new BufferedReader(isr);	//보조 스트림 --> MS949로 해석된 글자를 버퍼에 담아서 처리한다
		
		//쓰기스트림 준비
		OutputStream out = new FileOutputStream("C:\\javaStudy\\MS949-copy.txt"); //주 스트림
		OutputStreamWriter osw = new OutputStreamWriter(out, "MS949"); //보조 스트림
		BufferedWriter bw = new BufferedWriter(osw); //보조 스트림 
		
		
		System.out.println("----------------------------------스트림준비완료");
		
		while(true) {
			
			String str = br.readLine();
			
			if(str == null) {
				System.out.println("----------------------------------읽기 끝");
				break;
			}
			
			System.out.println(str);
			
			bw.write(str);
			bw.newLine(); //줄바꿈
			
		}
		
		//스트림 종료
		bw.close();
		br.close();
		System.out.println("----------------------------------프로그램종료");
		
		
		
		
		
		
		
	}

}
