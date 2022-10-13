package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.SinhVien;
import service.SinhVienService;
import utility.HibernateUtil;

@WebServlet("/delete")
public class DeleteSVServlet extends HttpServlet {
	private final SinhVienService svsv = new SinhVienService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
//		String id = req.getParameter("masv");

		String id = req.getParameter("id");
		SinhVien sinhvien = svsv.readById(Integer.parseInt(id));
		svsv.deletebyoj(sinhvien);
		resp.sendRedirect("/PH14249/index");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}


}
