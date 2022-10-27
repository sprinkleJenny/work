package com.example.Layer.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired //현재 많이 사용
    MemberRepository memberRepository;

    //예전버전
//    void setMemberRepository(MemberRepository memberRepository)
//        this.memberRepository = memberRepository;

    //현재 사용하고 있는 버전
//    MemberService(MemberRepository memberRepository){
//        this.memberRepository = memberRepository;
//    }

    void save(Member member){
        memberRepository.save(member);

    }

}
