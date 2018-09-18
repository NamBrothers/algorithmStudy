package com.ch1.no1

import java.util.ArrayList

class DataStructureOrderOfArrival {
    var dataList: MutableList<Data>? = null

    constructor() {
        this.dataList = ArrayList()
    }

    constructor(dataList: MutableList<Data>) {
        this.dataList = dataList
    }

    fun push(data: Data?) {
        if (data != null && isDataValid(data))
            dataList!!.add(data)
    }

    fun push(name: String, phoneNo: String) {
        if (isDataValid(name) && isDataValid(phoneNo))
            dataList!!.add(Data(name, phoneNo))
    }

    fun push(datas: Array<Data>?) {
        if (datas != null) {
            for (data in datas) {
                if (isDataValid(data))
                    dataList!!.add(data)
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
            val (name1, phoneNo) = dataList!![i]
            if (isNameExists(name1!!, name))
                return phoneNo
        }

        return null
    }

    fun getLastPhoneNo(name: String): String? {
        if (dataList == null || dataList!!.size == 0)
            return null

        for (i in dataList!!.indices.reversed()) {
            val (name1, phoneNo) = dataList!![i]
            if (isNameExists(name1!!, name))
                return phoneNo
        }

        return null
    }

    fun getPhoneNos(name: String): Array<String>? {
        if (dataList == null || dataList!!.size == 0)
            return null

        val searchList = ArrayList<String>()
        for (i in dataList!!.indices) {
            val (name1, phoneNo) = dataList!![i]
            if (isNameExists(name1!!, name))
                searchList.add(phoneNo!!)
        }

        return if (searchList.size > 0)
            searchList.toTypedArray()
        else
            null
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
        return "DataStructureOrderOfArrival [dataList=$dataList]"
    }
}
