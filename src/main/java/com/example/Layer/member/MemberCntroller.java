package com.example.Layer.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MemberCntroller {

    //1.usage
    //의존성
    MemberService memberService;

    MemberCntroller(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/create")
    String create(){
        //가짜 객체 생성
        Member member = new Member(1, "songa");
        // 객체를 서비스에게 전달하면, 일하라고 지시
        memberService.save(member);

        return "create 메소드가 호출되었습니다";
    }

}
