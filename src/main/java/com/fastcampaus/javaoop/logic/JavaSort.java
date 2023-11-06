package com.fastcampaus.javaoop.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaSort <T extends Comparable<T>> implements Sort<T>{
    @Override
    public List<T> sort(List<T> list) {
        List<T> output = new ArrayList<>(list);
        Collections.sort(output); //Collections 정렬 자동으로 해줌 문서보기 (F1 단축키,아니면 직접 코드를 타고들어가서 보는게 좋음)
        return output;
    }
}
