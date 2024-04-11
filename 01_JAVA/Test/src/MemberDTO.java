public class MemberDTO {
    private static int nextId = 1;
    public int Mn;
    public String id;
    public String pwd;

    public MemberDTO(String id, String pwd) {
        this.Mn = MemberDTO.nextId++;
        this.id = id;
        this.pwd = pwd;
    }

    public MemberDTO(int Mn, String id, String pwd) {
        this.Mn = Mn;
        this.id = id;
        this.pwd = pwd;
    }

    public int getMn() {
        return Mn;
    }

    public void setMn(int mn) {
        this.Mn = mn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "memberDTO{" +
                "mn=" + Mn +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
