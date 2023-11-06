package com.fastcampaus.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main(){
        //Given
        String[] args = {"3","1","2"};

        //when & then
        Main.main(args);
    }
}