package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.springframework.stereotype.Component;

@Component
public class RateDiscountPolicy implements DiscountPolicy{

    /*
    1.BASIC 회원은 1000원 할인하여 줍니다. 30000원 이상 사면 SILVER회원으로 UPGRADE됩니다.
    2. SILVER회원의 혜택 5%할인, 50000원 이상 사면 GOLD회원으로 UPGRADE됩니다.
    3, GOLD회원의 혜택 10%할인, 100000원 이상 사면 GOLD회원으로 UPGRADE됩니다.
    4,  PLATINUM회원의 혜택 20%할인, 200000원 이상 사면 PLATINUM회원으로 UPGRADE됩니다.
     */
    private int discountPercent_SILVER=5;
    private int discountPercent_GOLD=10;
    private int discountPercent_PLATINUM=20;
    @Override
    public int discount(Member member, int price) {

        if(member.getGrade()== Grade.SILVER)
            return price*discountPercent_SILVER/100;
        else if(member.getGrade()==Grade.GOLD)
            return price*discountPercent_GOLD/100;
        else if(member.getGrade()==Grade.PLATINUM)
            return price*discountPercent_PLATINUM/100;
        else return 0;
    }
}
