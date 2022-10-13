package servlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import model.SinhVien;
import service.SinhVienService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Sinh-Vien")
public class SinhVienServlet extends HttpServlet {
	private final SinhVienService svsv = new SinhVienService();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.getRequestDispatcher("/WEB-INF/view/SinhVien.jsp")
					.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String masv = req.getParameter("masv");
		String name = req.getParameter("name");
		String description = req.getParameter("description");
		String gia = req.getParameter("price");
		Double price =(Double.valueOf(gia));
		HttpSession session = req.getSession();
		String createUser =  (String) session.getAttribute("username") ;
		String lastModifiedUser = req.getParameter("masv");
		//lấy thời gian hiện tại và định dạng dd/mm/yyyy
		long millis=System.currentTimeMillis(); 
		Date date=new Date(millis);
//		LocalDate date = LocalDate.now(); 
		
		String gender = req.getParameter("gender");
		String majoring = req.getParameter("majoring");
		SimpleDateFormat spdate = new SimpleDateFormat("dd/MM/yyyy");
		String dateofbirth = req.getParameter("dateofbirth");
		String status = req.getParameter("status");
		
		
		
		SinhVien sv = new SinhVien();
		sv.setMasv(masv);
		sv.setName(name);
		sv.setGender(Boolean.valueOf(gender));
	    try {
			sv.setDateofbirth(spdate.parse(dateofbirth));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sv.setCreatedDate(date);
		sv.setCreatedUser(createUser);
		sv.setLastModifiedUser(createUser);
		sv.setLastModifiedDate(date);
		sv.setMajoring(majoring);
		sv.setPrice(BigDecimal.valueOf(price));
		sv.setDescription(description);
		sv.setStatus(Boolean.valueOf(status));
		svsv.Addsv(sv);
		List<SinhVien> sinhviens = svsv.getAllSinhVien();
		req.setAttribute("sinhviens", sinhviens);
		req.getRequestDispatcher("/WEB-INF/view/index.jsp").forward(req, resp);
	}
	
}
