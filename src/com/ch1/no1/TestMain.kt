package com.ch1.no1

import java.util.ArrayList
import java.util.Collections
import java.util.Comparator

object TestMain {
    @JvmStatic
    fun main(args: Array<String>) {
        val sampleDatas = arrayOf(Data("홍길동", "010-uuuu-uuuu"), Data("김 철수", "010-xxxx-xxxx"), Data("김영희", "010-yyyy-yyyy"), Data("이영희", "02-zzzz-zzzz"), Data("라영찬", "010-uuuu-uuuu"), Data("김철  수", "010-dddd-dddd"), Data("      김철수 ", "010-xxxx-dasd"), Data("김철수 ", "010-ggad-xxxx"), Data("       김    철수", "010-alkj-adsf"), Data("손아길", "010-xxxx-xxxx"), Data("길용훈", "010-yyyy-yyyy"), Data("신준훈", "02-zzzz-zzzz"))


        // ex1. 위에서부터 차례로 추가한다
        val stackOfArrival = DataStructureOrderOfArrival()
        stackOfArrival.push(sampleDatas)

        println("============ Example no 1 ============")
        println("First Data's PhoneNo :: " + stackOfArrival.getFirstPhoneNo("  김철수") + "\n")
        println("Last Data's PhoneNo :: " + stackOfArrival.getLastPhoneNo("김철   수 ") + "\n")
        println("Get 김철수's Datas")
        for (data in stackOfArrival.getDatas("김   철수  ")!!) {
            println(data)
        }
        println("\nGet 김철수's PhoneNos")

        for (phoneNo in stackOfArrival.getPhoneNos("   김  철 수  ")!!) {
            println(phoneNo)
        }


        // ex2. 이름을 가나다순으로 관리한다
        val stackOfABC = DataStructureOrderOfABC()
        stackOfABC.push(sampleDatas)

        println("\n\n============ Example no 2 ============")
        println("First Data's PhoneNo :: " + stackOfABC.getFirstPhoneNo("  김철수") + "\n")
        println("Last Data's PhoneNo :: " + stackOfABC.getLastPhoneNo("김철   수 ") + "\n")
        println("Get 김철수's Datas")

        for (data in stackOfABC.getDatas("김   철수  ")!!) {
            println(data)
        }
        println("\nGet 김철수's PhoneNos")

        for (phoneNo in stackOfABC.getPhoneNos("   김  철 수  ")!!) {
            println(phoneNo)
        }


        // cf. 선착순과 가나다순을 조합하면?
        val nameCmp = Comparator<Data> { (name), (name2) -> name!!.compareTo(name2!!) }
        val sortedDataList = ArrayList<Data>()
        sortedDataList.addAll(stackOfArrival.dataList!!)
        Collections.sort(sortedDataList, nameCmp)

        println("\n\n============ Confer ============")
        for (data in sortedDataList) {
            println(data)
        }
    }
}
