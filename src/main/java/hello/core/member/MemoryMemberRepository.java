package hello.core.member;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long,Member> store=new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
        //member의 id를 이용하여 저장해주었습니다.
        //<id,member객체>
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
