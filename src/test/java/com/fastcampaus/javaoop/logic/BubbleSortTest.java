package com.fastcampaus.javaoop.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
// jumit5 는 엑세스모디5 public,private를 쓰지않음
class BubbleSortTest {
    @DisplayName("버블소트 - 리스트를 넣으면 정렬된 결과를 보여준다.") //@DisplayName어노테이션을 사용해 이름을 지을수있음
    @Test
    void given_List_WhenExectuing_ThenReturn() {
//        gwt : given whene then 탬플릿
        //Given
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        //when
        List<Integer> actual = bubbleSort.sort(List.of(3,2,4,5,1)); //이뮤터블 오브젝트

        //then
        assertEquals(List.of(1,2,3,4,5), actual); // junit 제공 메서드 , 첫번째 변수는 기대값(성공 예상값 ,두번쨰는 실제 값)
    }
}