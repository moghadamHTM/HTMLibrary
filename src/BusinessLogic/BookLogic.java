package BusinessLogic;

import Common.Member;
import DataAccess.MemberManager;

import java.sql.SQLException;

/**
 * Created by moghadam on 3/26/2018.
 */
public class BookLogic {

    public void addMember(Member member) throws SQLException {
        MemberManager.Insert(member);
    }
}
