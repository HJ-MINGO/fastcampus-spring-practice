package com.fastcampaus.springpractice.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan("com.fastcampaus.springpractice") // 해당 명시 경로를 기본루트로 삼아서 해당경로 이하에 모든 빈들을 스캔한다는 의미
@Configuration //스프링전용 Configuration클래스 생성
public class Config {

}
