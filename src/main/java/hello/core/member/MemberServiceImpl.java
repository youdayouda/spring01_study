package hello.core.member;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    //테스트 용도
    public MemberRepository getMemberRepository(){
        return memberRepository;
    }

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    //단지 MemberRepository 인터페이스만 의존한다.
    //MemberServiceImpl입장에서 생성자를 통해 어떤 구현 객체가 들어올지는 알 수 없다.
    //MemberServiceImpl은

    //private final MemberRepository memberRepository= new
    //       MemoryMemberRepository();
    //MemberRepository는 인터페이스 ,MemoryMemberRepository는 클래스입니다.
    // 인터페이스로 구현 객체를 사용하려면 이렇게 인터페이스 변수를 선언하고 구현 객체를 대입해야 합니다.
    //인터페이스 변수는 참조 타입이기 때문에 구현 객체가 대입될 경우 구현 객체의 번지를 저장합니돠.

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

}
