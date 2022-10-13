package servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.SinhVien;
import service.SinhVienService;

@WebServlet("/index")
public class IndexSevlet extends HttpServlet {


	private final SinhVienService svsv = new SinhVienService();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		
		
		//lấy toàn bộ sinh viên trong db
		List<SinhVien> sinhviens = svsv.getAllSinhVien();
		
        HttpSession session = req.getSession();
        String user = (String) session.getAttribute("username");
        String name = (String) session.getAttribute("fullname");
        String rle = (String) session.getAttribute("rlx");
        String rla = (String) session.getAttribute("rly");
        
        
        req.setAttribute("name", name);
        req.setAttribute("user", user);
        req.setAttribute("rlx", rle);
        req.setAttribute("rly", rla);
//        req.setAttribute("role", role);
//        session.getAttribute(getServletName());
//        String id = (String) session.getAttribute("id");
//        Integer idx =(Integer.parseInt(id));
////        Account acc = new Account();
//        if (idx==0) {
//        	req.setAttribute("role", 0);
//		}else if (idx==1) {
//			req.setAttribute("role", 1);
//		}else {
//			req.setAttribute("role", 2);
//		}
//       
//        
//        Account ac = svsv.readaccById(acc.getId());
		

		// Đẩy danh sách sinh viên lên
				req.setAttribute("sinhviens", sinhviens);
				//đẩy tt acc lên 
				// Đẩy danh sách sinh viên lên
//				req.setAttribute("account", ac);
		// Di chuyển đến client
		req.getRequestDispatcher("/WEB-INF/view/index.jsp")
					.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
