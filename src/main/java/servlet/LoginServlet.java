package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Account;
import service.AuthencationService;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private final AuthencationService authenService = new AuthencationService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/view/Login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		session.removeAttribute("role");
		session.removeAttribute("username");
		session.removeAttribute("fullname");
		session.removeAttribute("rlx");
		session.removeAttribute("rly");

		String username = req.getParameter("username");
		String password = req.getParameter("password");

		// Gọi Service để xác thực thông tin
		Account account = authenService.authenticate(username, password);
		if (account == null) { // Không hợp lệ
			req.setAttribute("error", "Tài khoản hoặc mật khẩu không đúng !");
			req.getRequestDispatcher("/WEB-INF/view/Login.jsp").forward(req, resp);
		} else { // Hợp lệ
			session.setAttribute("fullname", account.getFullname());
			session.setAttribute("role", account.getRole());
			session.setAttribute("username", account.getUsername());
			session.setAttribute("id", account.getId());
			if (account.getRole() == 0) {
				session.setAttribute("rlx", "ADMIN");
			} else if (account.getRole() == 1) {
				session.setAttribute("rly", "ADMIN");
			}
			resp.sendRedirect("/PH14249/index");
		}

	}

}
