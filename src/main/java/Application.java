
import org.hibernate.query.Query;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import utility.HibernateUtil;
import model.SinhVien;
import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;



public class Application {

	
	public static void main(String[] args) {
		HibernateUtil.getFactory();
		
		
		
		
		
//		HibernateUtil.getFactory();
//		SinhVien sv = new SinhVien();
//		String masv = "PH14249";
//		String name="ADMIN";
//		sv.setName("Tẩn Láo Lù");
//		sv.setPrice(BigDecimal.valueOf(0));
//		sv.setDescription("Thông Thiên Giáo Chủ Pháp Lực Vô Biên");
//		sv.setCreatedUser(name);
//		SimpleDateFormat spdate = new SimpleDateFormat("yyyy/mm/dd");
//		long millis=System.currentTimeMillis(); 
//		java.sql.Date date=new java.sql.Date(millis);
//		System.out.print(date);
//		sv.setCreatedDate(date);
//		sv.setDateofbirth(date);
//		sv.setLastModifiedUser(name);
//		sv.setLastModifiedDate(date);
//		sv.setStatus(true);
//		sv.setMajoring("CNTT");
//		sv.setMasv(masv);
//		sv.setGender(true);
//		Add(sv);
//		DeleteById(3);
//		readAll();
//		SinhVien svid = readById(1);
//		System.out.println(svid);
//		readAll();
	}
//HibernateUtil.getFactory();

		
//		Delete(pr);
//		Update(pr);
	
		
		
	
	
	private static SinhVien readById(Integer id) {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.openSession();
		SinhVien sv = session.find(SinhVien.class, id);
		session.close();
		return sv ;
	}
//	private static void DeleteById(Integer id) {
//		SinhVien xoa = readById(id);
//		Delete(xoa);
//	}
	private static void UpdateById(Integer id) {
		SinhVien xoa = readById(id);
		Update(xoa);
	}
	private static void readAll() {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.openSession();
		Query<SinhVien> query = session.createQuery("FROM SinhVien p",SinhVien.class);
		
		List<SinhVien> sinhviens = query.getResultList();
		for (SinhVien sinhvien : sinhviens) {
			System.out.println(sinhvien);
		}
		session.close();
	}
//	private static void Add(SinhVien sv) {
//		SessionFactory factory = HibernateUtil.getFactory();
//		Session session = factory.openSession();
//		Transaction trans = session.beginTransaction();
//		session.save(sv);
//		trans.commit();//lưu kết quả.
//		session.close();
//	}
	private static void Delete(SinhVien sinhvien) {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		session.delete(sinhvien);
		trans.commit();//lưu kết quả.
		session.close();
	}
	private static void Update(SinhVien product) {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		session.update(product);
		trans.commit();//lưu kết quả.
		session.close();
	}

}
