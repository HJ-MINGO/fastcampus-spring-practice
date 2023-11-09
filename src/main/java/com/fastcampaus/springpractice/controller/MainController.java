package com.fastcampaus.springpractice.controller;

import com.fastcampaus.springpractice.service.SortService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 *  @RestController vs @Controller
 *  RestController어노테이션은 Controller을 포함하면서 ResoponseBody를 하나 더 포함한다.
 *  그냥 Controller어노테이션을 사용했을때는 API의 응답을 view-reservoir가 view로 변환해준다.
 *  그래서 viex를 찾아서 화면을 뿌려준다.
 *  근데 우리는 지금 서버에서 데이터 받는 걸 테스트하기때문에
 *  ResoponseBody가 추가되면서 response에 body-context를 그대로 넣어서 받겠다는 의미이다.
 *  클래스에 선언하면 모든 메서드적용
 *  특정 메서드에만 적용하면 해당 메서드만 적용
 * */
@RestController
public class MainController {

    // final을 쓰는 의미는 한먼만 초기화 할거기때문
    // 우리가 딱 한번만 초기화 할수 있는 이유는 우리가 생성자 주입을 할 거기 때문
    private final SortService sortService;
    //생성자 의존성 주입
    public MainController(SortService sortService) {
        // sortService에 대한 의존성이 컨트롤러의 생성자 단에서 노출됨.
        // 웹애플리케이션이 뜨게되면 Spring컨테이너가 자동으로 작업해줌
        this.sortService = sortService;
    }
    // 기본 스펙
    // @RequestParam 어노테이션을 붙인 파라미터는 필수값이 된다.
    // 즉 요청하는쪽에서 무조건 해당 서버로 던져줘야하는 필수값인것~!
    // 하지만 필수값이 아닌 옵션으로(있어도되고 없어도되는) 설정하고싶을경우는
    // @RequestParam(required = false) 로 설정해두면된다.기본값은 true임
    @GetMapping("/")
    public String hello(@RequestParam List<String> list){
        return sortService.doSort(list).toString();
    }
}
