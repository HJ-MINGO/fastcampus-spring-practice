package com.fastcampaus.springpractice;

import com.fastcampaus.springpractice.config.Config;
import com.fastcampaus.springpractice.logic.BubbleSort;
import com.fastcampaus.springpractice.logic.Sort;
import com.fastcampaus.springpractice.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.ws.rs.core.Application;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext();
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class); //이렇게 Config.class를 인자로 넣어주면
        // 아까 내가 만든 config파일을 불러오게된다.

        Sort<String> sort = context.getBean(Sort.class); //new 키워드없이 SpringContext에서 빈을 꺼내온 상태
        SortService sortService = context.getBean(SortService.class);
        //  결론
        // ApplicationContext ,스프링컨테이너를 띄우고나서는 new 없이 구현체를가지고와 서비스를 메인프로그램에서 제공
        System.out.println("[Result] " + sortService.doSort(Arrays.asList(args)));
    }
}
