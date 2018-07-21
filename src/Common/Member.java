package Common;

import java.sql.Date;

/**
 * Created by moghadam on 3/26/2018.
 */
public class Member {

    private String memberno;
    private String name;
    private String family;
    private String address;
    private String phone;
    private int agee;
    private Date memdate;
private String mn;


    public String getMemberno() {
        return memberno;
    }

    public void setMemberno(String memberno) {
        this.memberno = memberno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAgee() {
        return age;
    }

    public void setAgee(int age) {
        this.age = age;
    }

    public Date getMemdate() {
        return memdate;
    }

    public void setMemdate(Date memdate) {
        this.memdate = memdate;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberno='" + memberno + '\'' +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + agee +
                ", memdate=" + memdate +
                '}';
    }
}
