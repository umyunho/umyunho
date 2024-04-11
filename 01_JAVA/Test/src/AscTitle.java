import java.util.Comparator;

public class AscTitle implements Comparator<MemberDTO> {

    @Override
    public int compare(MemberDTO o1, MemberDTO o2) {
        return o1.getId().compareTo(o2.getId());
    }

}
