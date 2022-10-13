package fillter;

import java.io.IOException;



import model.Account;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@WebFilter("/Sinh-Vien")
public class SinhVienFilter implements Filter {
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
		if (session.getAttribute("role")==null) { // Đúng code cho đi tiếp
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().append("<h1 style=\"text-align: center; color: red;\">Bạn cần <a href=\"/PH14249/login\">đăng nhập</a> để truy cập trang web này !</h1>");
		} else { // Không đúng cho về
			
			chain.doFilter(request, response); // đi tiếp
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

}
