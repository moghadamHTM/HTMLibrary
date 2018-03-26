package Controller;

import BusinessLogic.BookLogic;
import Common.Member;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

/**
 * Created by moghadam on 3/26/2018.
 */
@WebServlet(name = "InsertMemberController")
public class InsertMemberController extends HttpServlet {

    private static final Long serialVersionUID=1L;

    public InsertMemberController() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        Member member=new Member();

        member.setMemberno(request.getParameter("txtmno"));
        member.setName(request.getParameter("txtname"));
        member.setFamily(request.getParameter("txtfamily"));
        member.setAddress(request.getParameter("txtaddress"));
        member.setPhone(request.getParameter("txtphone"));
        member.setAge(Integer.parseInt(request.getParameter("txtage")));

        java.sql.Date date=new java.sql.Date(new Date().getTime());
        member.setMemdate(date);

        BookLogic bookLogic=new BookLogic();
        try {
            bookLogic.addMember(member);
            response.sendRedirect("InsertMember.jsp?Ido=1");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
