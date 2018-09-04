package com.ch1.no1kt

object TestMainKotlin {
    @JvmStatic
    fun main(args: Array<String>) {
        val sampleDataKotlins = arrayOf(DataKotlin("홍길동", "010-uuuu-uuuu"),
                DataKotlin("김 철수", "010-xxxx-xxxx"),
                DataKotlin("김영희", "010-yyyy-yyyy"),
                DataKotlin("이영희", "02-zzzz-zzzz"),
                DataKotlin("라영찬", "010-uuuu-uuuu"),
                DataKotlin("김철  수", "010-dddd-dddd"),
                DataKotlin("      김철수 ", "010-xxxx-dasd"),
                DataKotlin("김철수 ", "010-ggad-xxxx"),
                DataKotlin("       김    철수", "010-alkj-adsf"),
                DataKotlin("손아길", "010-xxxx-xxxx"),
                DataKotlin("길용훈", "010-yyyy-yyyy"),
                DataKotlin("신준훈", "02-zzzz-zzzz"))


        for (DataKotlin in sampleDataKotlins) {
            println(DataKotlin)
        }

    }
}
