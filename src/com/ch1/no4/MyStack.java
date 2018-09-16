package com.ch1.no4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BossNam on 2018. 9. 16..
 */
public class MyStack {
    private int size;
    private List<String> container;

    public MyStack() {
        this.size = 0;
        this.container = new ArrayList<>();
    }

    public int getSize() {
        return size;
    }

    public List<String> getContainer() {
        return container;
    }

    public void push(String data){
        this.container.add(data);
        this.size = container.size();
    }

    public String pop(){
        if(size == 0)
            return null;

        size -= 1;
        String returnStr = container.get(size);
        container.remove(size);
        return returnStr;
    }

    public void printMyStack(){
        if(size == 0)
            System.out.println("There is no data!!");

        for(int i=size-1; i>=0; i--)
            System.out.println(container.get(i));
    }
}
