package com.fastcampaus.springpractice;

import com.fastcampaus.springpractice.config.Config;
import com.fastcampaus.springpractice.logic.BubbleSort;
import com.fastcampaus.springpractice.logic.Sort;
import com.fastcampaus.springpractice.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.ws.rs.core.Application;
import java.util.Arrays;


/*
*  MyWebApplicationInitializer.class에서 AnnotationConfigWebApplicationContext을 이용해
* 애플리케이션 컨텍스트를 만들고 스프링 래퍼런스를 보면
* The following example of the Java configuration registers and initializes the DispatcherServlet, which is auto-detected by the Servlet container
* 디스패치 서블릿을 초기화해주고 등록해주는데요, 그것은 자동으로 발견됩니다. 서블릿 컨테이너에 의해서!!
* 즉 톰캣을이용해 해당 어플리케이션을 올리면  MyWebApplicationInitializer.class 코드가 자동으로
* 온스타트업이 자동으로 인식된다는 의미이다. 그러면 ApplicationContext가 자동으로 생성이 되기 때문에
*  Main클래스에서 굳이 ApplicationContext을 생성해줄필요가없다. (중복) 주석처리~
* 이렇게 될경우.. 즉 스프링 webMvc를 쓰게되면 기존 메인테스트나 기존의 테스트코드들은 사용할수없음
* 스프링 웹 MVC에 맞는방식으로 작성해야함
* **/
//public class Main {
//    public static void main(String[] args) {
////        ApplicationContext context = new AnnotationConfigApplicationContext();
//        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class); //이렇게 Config.class를 인자로 넣어주면
//        // 아까 내가 만든 config파일을 불러오게된다.
//
//        Sort<String> sort = context.getBean(Sort.class); //new 키워드없이 SpringContext에서 빈을 꺼내온 상태
//        SortService sortService = context.getBean(SortService.class);
//        //  결론
//        // ApplicationContext ,스프링컨테이너를 띄우고나서는 new 없이 구현체를가지고와 서비스를 메인프로그램에서 제공
//        System.out.println("[Result] " + sortService.doSort(Arrays.asList(args)));
//    }
//}
