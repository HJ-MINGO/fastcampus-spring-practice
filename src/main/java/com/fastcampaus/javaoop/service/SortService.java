package com.fastcampaus.javaoop.service;

import com.fastcampaus.javaoop.logic.JavaSort;
import com.fastcampaus.javaoop.logic.Sort;

import java.util.List;

public class SortService {
    // 생성자 주입방식 일반코드방식(의존성 주입)
    // 해당 필드는 SortService 생성자를 만들때 한번만 만들기때문에 final로 선업
    private final Sort<String> sort;

    public SortService(Sort<String> sort) {
        this.sort = sort;
        System.out.println("[구현체]: " + sort.getClass().getName());
    }
//    public List<String> doSort(List<String> list) {
//        // 이것또한 결국은 서비스 로직에서 내가 무슨 정렬을 하질 알고있음 (강한결합)
//        // 그래서 이걸 느슨하게 만들고자 의존성 주입 방식으로 해결 (생성자 주입방식)
//        Sort<String> sort = new JavaSort<>();
//        return sort.sort(list);
//    }
    public List<String> doSort(List<String> list) {
        //의존성 주입방식
        //의존성 주입 덕분에 Sort인터페이스를 통해 
        //정렬을 알아서 전달만 해주니 이부분에서 무슨정렬인지 알필요가없어짐.(결합도 느슨)
        return sort.sort(list);
    }
}
