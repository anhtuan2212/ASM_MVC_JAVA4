package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;
import service.AuthencationService;

@WebServlet("/register")
public class SingupServlet extends HttpServlet {
	private final AuthencationService acsv = new AuthencationService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/view/Singup.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fullname = req.getParameter("fullname");
		String username = req.getParameter("username");
		String password1 = req.getParameter("password1");
		String password2 = req.getParameter("password2");

		Account ac = new Account();
		ac.setFullname(fullname);
		ac.setUsername(username);
		ac.setPassword(password1);
		ac.setRole(1);		
		
		if (password1.equals(password2)) {
			acsv.singup(ac);
			req.getRequestDispatcher("/WEB-INF/view/Login.jsp").forward(req, resp);
		}else {
			String tb = ("Nhập lại mật khẩu không khớp !");
			req.setAttribute("thongbao", tb);
			req.getRequestDispatcher("/WEB-INF/view/Singup.jsp").forward(req, resp);
		}
		}
//		public Account getByUsername(String username) {
//			List<Account> list = getAll();
//			// Duyệt ds
//			for(Account account : list) {
//				// Nếu tên tài khoản trùng với giá trị tìm kiếm
//				if (account.getUsername().equalsIgnoreCase(username)) {
//					return account; // thì trả về Tài khoản
//				}
//			}
//			// Không tìm thấy
//			return null;
//		}

	}

