package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy=new RateDiscountPolicy();

    @Test
    @DisplayName("SILVER는 5% 할인이 적용되어야 한다.")
    void silver(){
        //given
        Member member=new Member(2L,"memberB", Grade.SILVER);
        //when
        int discount= discountPolicy.discount(member,10000);
        //then
        assertThat(discount).isEqualTo(500);
    }

    @Test
    @DisplayName("GOLD는 10% 할인이 적용되어야 한다.")
    void gold(){
        //given
        Member member=new Member(3L,"memberC", Grade.GOLD);
        //when
        int discount= discountPolicy.discount(member,10000);
        //then
        assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("PLATINUM는 20% 할인이 적용되어야 한다.")
    void platinum(){
        //given
        Member member=new Member(4L,"memberD", Grade.PLATINUM);
        //when
        int discount= discountPolicy.discount(member,10000);
        //then
        assertThat(discount).isEqualTo(2000);
    }
}