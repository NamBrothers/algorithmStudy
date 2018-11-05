package com.ch1.no5;

/**
 * Created by BossNam on 2018. 11. 5..
 */
public class Data {
    private int intData;

    public Data() {
        super();
        this.intData=0;
    }

    public Data(int intData) {
        super();
        this.intData = intData;
    }

    public int getIntData() {
        return intData;
    }

    public void setIntData(int intData) {
        this.intData = intData;
    }

    @Override
    public String toString() {
        return "Data [intData=" + intData + "]";
    }
}
