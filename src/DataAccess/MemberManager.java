package DataAccess;

import Common.Member;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by moghadam on 3/26/2018.
 */
public class MemberManager {

    public static void Insert(Member objMember) throws SQLException {

        PreparedStatement pre=DBConnector.getConnection().prepareStatement("insert into member(mno,name,family,address,phone,memdate,age) values (?,?,?,?,?,?,?)");

        pre.setString(1,objMember.getMemberno());
        pre.setString(2,objMember.getName());
        pre.setString(3,objMember.getFamily());
        pre.setString(4,objMember.getAddress());
        pre.setString(5,objMember.getPhone());
        pre.setDate(6,objMember.getMemdate());
        pre.setInt(7,objMember.getAge());

        pre.execute();



    }
}
