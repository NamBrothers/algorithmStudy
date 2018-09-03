package com.ch1.no1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestMain {
	public static void main(String[] args) {
		Data[] sampleDatas = 
			{new Data("홍길동", "010-uuuu-uuuu")
				, new Data("김 철수", "010-xxxx-xxxx")
				, new Data("김영희", "010-yyyy-yyyy")
				, new Data("이영희", "02-zzzz-zzzz")
				, new Data("라영찬", "010-uuuu-uuuu")
				, new Data("김철  수", "010-dddd-dddd")
				, new Data("      김철수 ", "010-xxxx-dasd")
				, new Data("김철수 ", "010-ggad-xxxx")
				, new Data("       김    철수", "010-alkj-adsf")
				, new Data("손아길", "010-xxxx-xxxx")
				, new Data("길용훈", "010-yyyy-yyyy")
				, new Data("신준훈", "02-zzzz-zzzz")};
		
		
		// ex1. 위에서부터 차례로 추가한다
		DataStructureOrderOfArrival stackOfArrival = new DataStructureOrderOfArrival();
		stackOfArrival.push(sampleDatas);
		
		System.out.println("============ Example no 1 ============");
		System.out.println("First Data's PhoneNo :: "+stackOfArrival.getFirstPhoneNo("  김철수")+"\n");
		System.out.println("Last Data's PhoneNo :: "+stackOfArrival.getLastPhoneNo("김철   수 ")+"\n");
		System.out.println("Get 김철수's Datas");
		for(Data data : stackOfArrival.getDatas("김   철수  "))
			System.out.println(data);
		System.out.println("\nGet 김철수's PhoneNos");
		for(String phoneNo : stackOfArrival.getPhoneNos("   김  철 수  "))
			System.out.println(phoneNo);
		
		
		// ex2. 이름을 가나다순으로 관리한다
		DataStructureOrderOfABC stackOfABC = new DataStructureOrderOfABC();
		stackOfABC.push(sampleDatas);
		
		System.out.println("\n\n============ Example no 2 ============");
		System.out.println("First Data's PhoneNo :: "+stackOfABC.getFirstPhoneNo("  김철수")+"\n");
		System.out.println("Last Data's PhoneNo :: "+stackOfABC.getLastPhoneNo("김철   수 ")+"\n");
		System.out.println("Get 김철수's Datas");
		for(Data data : stackOfABC.getDatas("김   철수  "))
			System.out.println(data);
		System.out.println("\nGet 김철수's PhoneNos");
		for(String phoneNo : stackOfABC.getPhoneNos("   김  철 수  "))
			System.out.println(phoneNo);
		
		
		// cf. 선착순과 가나다순 조합
		Comparator<Data> nameCmp = new Comparator<Data>() {
			public int compare(Data d1, Data d2) {
				return (d1.getName().compareTo(d2.getName()));
			}
		};
		List<Data> sortedDataList = new ArrayList<>();
		sortedDataList.addAll(stackOfArrival.getDataList());
		Collections.sort(sortedDataList, nameCmp);
		
		System.out.println("\n\n============ Confer ============");
		for(Data data : sortedDataList)
			System.out.println(data);
	}
}
