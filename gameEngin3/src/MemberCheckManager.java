public class MemberCheckManager implements MemberCheckService{
    @Override
    public boolean isValid(Member member) {
        if (member.getFirstName().equals("Tahir")){
            System.out.println("Validition true");
        }
        else{
            System.out.println("Validition yapılamadı");
            return false;
        }
        return true;
    }
}
