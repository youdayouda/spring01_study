package hello.core.member;

import hello.core.AppConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MemberServiceTest {

   MemberService memberService;

   @BeforeEach
    public void beforeEach(){
       AppConfig appConfig=new AppConfig();
       memberService = appConfig.memberService();
   }
}