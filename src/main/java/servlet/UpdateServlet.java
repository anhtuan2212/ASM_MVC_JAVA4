package servlet;

import java.io.IOException;
import model.SinhVien;
import service.SinhVienService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	private static final SinhVienService svsv = new SinhVienService();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		SinhVien sinhvien = svsv.readById(Integer.parseInt(id));
		HttpSession session = req.getSession();
		session.setAttribute("idupdate",sinhvien.getId());
		session.setAttribute("creat", sinhvien.getCreatedUser());
		req.setAttribute("sinhvien", sinhvien);
		req.getRequestDispatcher("/WEB-INF/view/Update.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		long millis=System.currentTimeMillis(); 
//		Date date=new java.sql.Date(millis);
//		SimpleDateFormat spdate = new SimpleDateFormat("dd/MM/yyyy");
//		
//		String masv = req.getParameter("masv");
//		String name = req.getParameter("name");
//		String gender = req.getParameter("gender");
//		String dateofbirth = req.getParameter("dateofbirth");
//		HttpSession session = req.getSession();
//		Integer id = (Integer) session.getAttribute("idupdate");
//		String creatUser = (String) session.getAttribute("creat");
//		String gia = req.getParameter("price");
//		Double price = (Double.valueOf(gia));
//		String description = req.getParameter("description");
//		String status = req.getParameter("status");
//		String majoring = req.getParameter("majoring");
//		String LastModifiedUser = (String) session.getAttribute("username");
//		SinhVien sinhvienT = svsv.readById(id);
//		Date createdDate = sinhvienT.getCreatedDate();
//		
//		
//		
//		
//		String[] word = dateofbirth.split("/");
//		Integer ngay = Integer.parseInt(word[0]);
//		Integer thang = Integer.parseInt(word[1]);
//		Integer nam = Integer.parseInt(word[2]);
//		String hientai = spdate.format(date);
//		String[] namcuoi = hientai.split("/");
//		Integer cuoi =Integer.parseInt(word[2]);
//		String tb = ("Ngày tháng năm không đúng định dạng !");
//		
//		
//		
//		
//		SinhVien sv = new SinhVien();
//		sv.setId(id);
//		sv.setMasv(masv);
//		sv.setName(name);
//		sv.setGender(Boolean.valueOf(gender));
//		try {
//			sv.setDateofbirth(spdate.parse(dateofbirth));
////			sv.setCreatedDate(spdate.parse("1/8/2001"));
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		sv.setCreatedDate(createdDate);
//		sv.setCreatedUser(creatUser);
//		sv.setLastModifiedUser(LastModifiedUser);
//		sv.setLastModifiedDate(date);
//		sv.setPrice(BigDecimal.valueOf(price));
//		sv.setDescription(description);
//		sv.setStatus(Boolean.valueOf(status));
//		sv.setMajoring(majoring);
//		if (ngay < 0 && ngay > 31 ) {
//			req.setAttribute("messenge", tb);
//			req.getRequestDispatcher("/WEB-INF/view/Update.jsp").forward(req, resp);
//		}else if (thang < 0 && thang > 12 ) {
//			req.setAttribute("messenge", tb);
//			req.getRequestDispatcher("/WEB-INF/view/Update.jsp").forward(req, resp);
//		}else if (nam < 1800 && nam > cuoi ) {
//			req.setAttribute("messenge", tb);
//			req.getRequestDispatcher("/WEB-INF/view/Update.jsp").forward(req, resp);
//		}else {
//			svsv.updatebyoj(sv);
//			session.removeAttribute("idupdate");
//			session.removeAttribute("creat");
//			resp.sendRedirect("/PH14249/index");
//		}  
		
	}
}




























