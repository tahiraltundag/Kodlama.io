public class MemberManager implements MemberService{

    private MemberCheckManager memberCheckManager;

    public MemberManager(MemberCheckManager memberCheckManager){
        this.memberCheckManager = memberCheckManager;
    }
    @Override
    public void registerMember(Member member) {
        if (memberCheckManager.isValid(member)){
            System.out.println("Üye kayıt oldu : " + member.getFirstName());
        }
    }

    @Override
    public void deleteMember(Member member) {
        if (memberCheckManager.isValid(member)){
            System.out.println("Üye kaydını silmiştir : " + member.getFirstName());
        }
    }

    @Override
    public void updateMember(Member member) {
        if (memberCheckManager.isValid(member)){
            System.out.println("Üye bilgileri güncellenmiştir : " + member.getFirstName());
        }
    }
}
