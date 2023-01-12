package hello.core.member;

public class MemberServiceImpl implements MemberService{
    //회원저장소 필요
    //private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final MemberRepository memberRepository; //추상화에만 의존

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member); //구현 완료한 MemoryMemberRepository의 save()가 호출
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
