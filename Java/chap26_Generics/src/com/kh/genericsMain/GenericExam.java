package com.kh.genericsMain;

public class GenericExam {

	public static void main(String[] args) {
		//정수형 데이터를 저장하는 Book 인스턴스 생성
		Book<Integer> intBook = new Book<>();
		intBook.put(5);
		intBook.put(1);
		int intValue = intBook.get();//형변환 필요없음
		
		//문자열 데이터를 저장하는 Book 인스턴스 생성
		Book<String> strBook = new Book<>();
		strBook.put("Hello");
		strBook.put("Java");
		strBook.put("C");
		strBook.put("C++");
		String strValue = strBook.get();//형변환 필요없음
		
		//제너릭 클래스를 사용해서 다양한 데이터 유형을 처리할 수 있고 출력할 수 있음.
		System.out.println("Int Value : " + intValue);
		System.out.println("String Value : " + strValue);
	}

}
