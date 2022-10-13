package fillter;

import java.io.IOException;

import javax.servlet.*;

import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpSession;
import model.Account;

@WebFilter("/admin")
public class AdminFilter implements Filter {

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request,
						 ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
       HttpServletRequest req = (HttpServletRequest) request;
		
		// Lấy Role của Người đăng nhập
		HttpSession session = req.getSession();
		Account ac = new Account();
		if (session.getAttribute("role").equals(0)) { // Đúng code cho đi tiếp
			chain.doFilter(request, response); // đi tiếp
		} else { // Không đúng cho về
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().append("<h1 style=\"text-align: center; color: red;\">Bạn cần có quyền quản trị để truy cập trang web này !</h1>");
		}
	}
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	

}
