package repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.hibernate.Transaction;

import model.Account;
import model.SinhVien;
import utility.HibernateUtil;

public class SinhVienRepository {
	public List<SinhVien> getAll() {
		List<SinhVien> sinhvien = null;
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.openSession();
		Query<SinhVien> query = session.createQuery("FROM SinhVien sv", SinhVien.class);
		sinhvien = query.getResultList();
		session.close();
		return sinhvien;
	}
	 public static void Add(SinhVien sinhvien) {
			SessionFactory factory = HibernateUtil.getFactory();
			Session session = factory.openSession();
			Transaction trans = session.beginTransaction();
			session.save(sinhvien);
			trans.commit();//lưu kết quả.
			session.close();
		}

	public static SinhVien readById(Integer id){
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.openSession();
		SinhVien sv = session.find(SinhVien.class, id);
		session.close();
		return sv;
		
	}
	public static Account readaccById(Integer id){
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.openSession();
		Account acc = session.find(Account.class, id);
		session.close();
		return acc;
		
	}
	

    public void delete(SinhVien sinhvien) {
        SessionFactory factory = HibernateUtil.getFactory();
        Session session = factory.openSession();
        try {
            session.getTransaction().begin();
            session.delete(sinhvien);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        
        session.close();
    }
    public static void Update(SinhVien sinhvien) {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.openSession();
		try {
			session.getTransaction().begin();
			session.update(sinhvien);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.fillInStackTrace();
			session.getTransaction().rollback();
		}
		session.close();
	}
   
}
