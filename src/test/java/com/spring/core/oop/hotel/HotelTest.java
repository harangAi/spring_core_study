package com.spring.core.oop.hotel;

import com.spring.core.oop.config.HotelFactory;
import javafx.application.Application;
import org.apache.catalina.core.ApplicationContext;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {
    @Test
    void reserveTest() {
        ApplicationContext ct = new AnnotationConfigApplicationContext(HotelFactory.class);
        Hotel hotel = ct.getBean(Hotel.class);
        hotel.reserve();
    }

}