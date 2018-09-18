package com.ch1.no1

import java.util.ArrayList

class DataStructureOrderOfABC {
    private var dataList: MutableList<Data>? = null

    constructor() {
        this.dataList = ArrayList()
    }

    constructor(dataList: MutableList<Data>) {
        this.dataList = dataList
    }

    fun push(data: Data?) {
        if (data != null && isDataValid(data)) {
            pushDataWithCompare(data)
        }
    }

    fun push(name: String, phoneNo: String) {
        if (isDataValid(name) && isDataValid(phoneNo)) {
            pushDataWithCompare(name, phoneNo)
        }
    }

    fun push(datas: Array<Data>?) {
        if (datas != null) {
            for (data in datas) {
                if (isDataValid(data)) {
                    pushDataWithCompare(data)
                }
            }
        }

    }

    fun getFirstData(name: String): Data? {
        if (dataList == null || dataList!!.size == 0)
            return null

        for (i in dataList!!.indices) {
            val data = dataList!![i]
            if (isNameExists(data.name!!, name))
                return data
        }

        return null
    }

    fun getLastData(name: String): Data? {
        if (dataList == null || dataList!!.size == 0)
            return null

        for (i in dataList!!.indices.reversed()) {
            val data = dataList!![i]
            if (isNameExists(data.name!!, name))
                return data
        }

        return null
    }

    fun getDatas(name: String): Array<Data>? {
        if (dataList == null || dataList!!.size == 0)
            return null

        val searchList = ArrayList<Data>()
        for (i in dataList!!.indices) {
            val data = dataList!![i]
            if (isNameExists(data.name!!, name))
                searchList.add(data)
        }

        return if (searchList.size > 0)
            searchList.toTypedArray()
        else
            null
    }

    fun getFirstPhoneNo(name: String): String? {
        if (dataList == null || dataList!!.size == 0)
            return null

        for (i in dataList!!.indices) {
            val (nameFromDataList, phoneNo) = dataList!![i]
            if (isNameExists(nameFromDataList!!, name))
                return phoneNo
        }

        return null
    }

    fun getLastPhoneNo(name: String): String? {
        if (dataList == null || dataList!!.size == 0)
            return null

        for (i in dataList!!.indices.reversed()) {
            val (nameFromDataList, phoneNo) = dataList!![i]
            if (isNameExists(nameFromDataList!!, name))
                return phoneNo
        }

        return null
    }

    fun getPhoneNos(name: String): Array<String>? {
        if (dataList == null || dataList!!.size == 0)
            return null

        val searchList = ArrayList<String>()
        for (i in dataList!!.indices) {
            val (nameFromDataList, phoneNo) = dataList!![i]
            if (isNameExists(nameFromDataList!!, name))
                searchList.add(phoneNo!!)
        }

        return if (searchList.size > 0)
            searchList.toTypedArray()
        else
            null
    }

    fun getDataList(): List<Data>? {
        return dataList
    }

    private fun pushDataWithCompare(data: Data) {
        if (dataList!!.size == 0) {
            dataList!!.add(data)
            return
        } else {
            var i = 0
            for ((name) in dataList!!) {
                if (name!!.compareTo(data.name!!) > 0) {
                    dataList!!.add(i, data)
                    break
                } else
                    i++
            }
        }
    }

    private fun pushDataWithCompare(name: String, phoneNo: String) {
        if (dataList!!.size == 0) {
            dataList!!.add(Data(name, phoneNo))
            return
        } else {
            var i = 0
            for ((name1) in dataList!!) {
                if (name1!!.compareTo(name) > 0) {
                    dataList!!.add(i, Data(name, phoneNo))
                    break
                } else
                    i++
            }
        }
    }

    private fun isDataValid(data: Data): Boolean {
        return data.name != null && !data.name!!.isEmpty() && data.phoneNo != null && !data.phoneNo!!.isEmpty()
    }

    private fun isDataValid(data: String?): Boolean {
        return data != null && !data.isEmpty()
    }

    private fun isNameExists(originName: String, searchName: String): Boolean {
        return (originName == searchName
                || originName.trim { it <= ' ' } == searchName
                || originName.trim { it <= ' ' }.replace(" ".toRegex(), "") == searchName
                || searchName.trim { it <= ' ' } == originName.trim { it <= ' ' }
                || searchName.trim { it <= ' ' } == originName.trim { it <= ' ' }.replace(" ".toRegex(), "")
                || searchName.trim { it <= ' ' }.replace(" ".toRegex(), "") == originName
                || searchName.trim { it <= ' ' }.replace(" ".toRegex(), "") == originName.trim { it <= ' ' }
                || searchName.trim { it <= ' ' }.replace(" ".toRegex(), "") == originName.trim { it <= ' ' }.replace(" ".toRegex(), ""))
    }

    override fun toString(): String {
        return "DataStructureOrderOfABC [dataList=$dataList]"
    }
}
