package com.ch1.no3;

/**
 * Created by BossNam on 2018. 9. 16..
 */
public class MyArray {

    private int size;
    private String[] datas;

    public MyArray() {
        this.size = 1;
        this.datas = new String[size];
        datas[0] = "first data";
    }

    public MyArray(int size) {
        this.size = size;
        this.datas = new String[size];
        for(int i = 0; i<size; i++){
            datas[i] = "tmp data"+i;
        }
    }

    public MyArray(String[] datas) {
        this.size = datas.length;
        this.datas = datas;
    }

    public int getSize() {
        return size;
    }

    public String[] getDatas() {
        return datas;
    }

    public boolean addData(String data) {
        if(size == 0)
            return false;

        size += 1;
        String[] newDataAry = new String[size];
        for (int i=0; i<size; i++){
            if(i != size-1)
                newDataAry[i] = datas[i];
            else
                newDataAry[i] = data;
        }
        datas = newDataAry;
        return true;
    }

    public boolean addData(int index, String data) {
        if(size == 0 || index < 0 || index > size)
            return false;

        size += 1;
        String[] newDataAry = new String[size];
        for (int i=0; i<size-1; i++){
            if(i >= index)
                newDataAry[i+1] = datas[i];
            else
                newDataAry[i] = datas[i];
        }
        newDataAry[index] = data;

        datas = newDataAry;
        return true;
    }

    public boolean deleteData() {
        if(size == 0)
            return false;

        size -= 1;
        String[] newDataAry = new String[size];
        for (int i=0; i<size; i++){
            newDataAry[i] = datas[i];
        }
        datas = newDataAry;

        return true;
    }

    public boolean deleteData(int index) {
        if(size == 0 || index < 0 || index >= size)
            return false;

        size -= 1;
        String[] newDataAry = new String[size];
        for (int i=0; i<size; i++){
            if(i >= index)
                newDataAry[i] = datas[i+1];
            else
                newDataAry[i] = datas[i];
        }
        datas = newDataAry;

        return true;
    }

    public void printArray(){
        if(size == 0)
            System.out.println("There is no data!");

        for(int i=0; i<size; i++){
            System.out.println(i + " :: "+datas[i]);
        }
    }

}
