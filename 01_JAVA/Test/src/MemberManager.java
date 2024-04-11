import java.util.ArrayList;
import java.util.List;

public class MemberManager {
    private List<MemberDTO> memberList = new ArrayList<>();

    public void addList(MemberDTO member){
        memberList.add(member);
    }

    public List<MemberDTO> selectList(){

        return memberList;

    }

    public List<MemberDTO> searchId(String id){

        List<MemberDTO> searchList = new ArrayList<>();

        for(MemberDTO member : memberList){

            if(member.getId().contains(id)){
                searchList.add(member);
            }

        }

        return searchList;

    }
    public List<MemberDTO> searchPwd(String pwd){
        List<MemberDTO> searchList = new ArrayList<>();
        for (MemberDTO member : memberList){
            if (member.getPwd().contains(pwd)){
                searchList.add(member);
            }
        }

        return searchList;
    }

    public boolean resetMember(MemberDTO resetMember){

        MemberDTO reset = null;

        for(int i = 0; i < memberList.size(); i++ ){
            if(memberList.get(i).getId() == resetMember.getId()){
                reset = memberList.set((i, resetMember));
            }
        }

        return reset != null;
    }

    public boolean removeMember(String id){

        MemberDTO remove = null;

        for (int i = 0; i < memberList.size(); i++){
            if (memberList.get(i).getId() == id){
                remove = memberList.remove(i);
            }
        }

        return remove != null;
    }





}
