import java.util.Comparator;

public class DescArtist implements Comparator<MemberDTO> {

    @Override
    public int compare(MemberDTO o1, MemberDTO o2) {
        return o2.getPwd().compareTo(o1.getPwd());
    }

}
