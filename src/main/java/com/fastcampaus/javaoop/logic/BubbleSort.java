package com.fastcampaus.javaoop.logic;


import java.util.ArrayList;
import java.util.List;

// 1.여러가지 자료형을 정렬할수 있는 서비스
// 2. 정렬할수 있는다는거 비교가 가능해야 한다는거 (제네릭을 사용)
//  <T extends Comparable<T>> --> T(제네릭, 즉 비교대상) 은 항상 Comparable 을 상속하는 자료형만 받을수있다.
public class BubbleSort <T extends Comparable<T>> implements Sort<T>{
    @Override
    public List<T> sort(List<T> list) {
        List<T> output = new ArrayList<>(list);
        for (int i=output.size()-1; i>0; i-- ) {
            for (int j = 0; j<i; j++) {
                if (output.get(j).compareTo(output.get(j+1))>0) { //오름차순정렬
                    T tmp = output.get(j);
                    output.set(j,output.get(j+1));
                    output.set(j+1,tmp);
                }
            }
        }
        return output;
    }

}
