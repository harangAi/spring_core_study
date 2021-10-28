package com.spring.core.oop.config;

import com.spring.core.oop.member.DataBaseMemberRepository;
import com.spring.core.oop.member.MemberController;
import com.spring.core.oop.member.MemberRepository;
import com.spring.core.oop.member.MemoryMemberRepository;
import com.spring.core.oop.order.OrderController;

// 역할 : 객체를 생성해서 필요한 곳에 넣어주는 역할
public class Factory {
    // 회원 저장소 객체를 만드는 기능
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    // 회원 컨트롤러 객체를 만드는 기능
    public MemberController memberController() {
        return new MemberController(memberRepository());
    }

    // 주문컨트롤러 객체를 만드는 기능
    public OrderController orderController() {
        return new OrderController(memberRepository());
    }
}
