package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount=1000; //1000원 할인

    @Override
    public int discount(Member member, int price) {
        //BASIC회원은 할인 1000원 할인하여 줍니다.
        if(member.getGrade()== Grade.BASIC){
            return discountFixAmount;
        }else{
            return 0;
        }
    }
}
