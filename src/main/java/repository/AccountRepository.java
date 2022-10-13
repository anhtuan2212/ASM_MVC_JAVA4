package repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import model.Account;
import utility.HibernateUtil;


public class AccountRepository {

    private static List<Account> getAll() {
		List<Account> acc = null;
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.openSession();
		Query<Account> query = session.createQuery("FROM Account c", Account.class);
		List<Account> list = query.getResultList();
		session.close();
		return list;
	}
	
	public Account getByUsername(String username) {
		List<Account> list = getAll();
		// Duyệt ds
		for(Account account : list) {
			// Nếu tên tài khoản trùng với giá trị tìm kiếm
			if (account.getUsername().equalsIgnoreCase(username)) {
				return account; // thì trả về Tài khoản
			}
		}
		// Không tìm thấy
		return null;
	}
	public static void Add(Account acc) {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(acc);
		trans.commit();//lưu kết quả.
		session.close();
	}
}
