package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {

    public static void main(String[] args) {
        //AppConfig appConfig=new AppConfig();
        //MemberService memberService=appConfig.memberService();

        //스프링 컨테이너가 다 관리를 해준다.
        ApplicationContext applicationContext= new
                AnnotationConfigApplicationContext(AppConfig.class);

        MemberService memberService=
                applicationContext.getBean("memberService",MemberService.class);

        Member memberA= new Member(1L,"memberA", Grade.BASIC);
        Member memberB=new Member(2L,"memberB",Grade.SILVER);
        Member memberC=new Member(3L,"memberC",Grade.GOLD);
        Member memberD=new Member(4L,"memberD",Grade.PLATINUM);

        memberService.join(memberA);

        memberService.join(memberB);
        memberService.join(memberC);
        memberService.join(memberD);

        Member findMember=memberService.findMember(1L);
        System.out.println("new member = "+memberA.getName());
        System.out.println("find member = "+findMember.getName());
    }
}
