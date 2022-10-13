package service;

import java.util.List;

import model.Account;
import model.SinhVien;
import repository.SinhVienRepository;

public class SinhVienService {
	private final SinhVienRepository SinhVienRepo = new SinhVienRepository();

	// lấy all sinh viên
	public List<SinhVien> getAllSinhVien() {
		return SinhVienRepo.getAll();
	}

	// lấy sinh viên theo id
	public SinhVien readById(Integer id) {
		return SinhVienRepo.readById(id);
	}



	public void deletebyoj(SinhVien sinhvien) {
		SinhVienRepo.delete(sinhvien);
	}

	public void updatebyoj(SinhVien sinhvien) {
		SinhVienRepo.Update(sinhvien);
	}
	public void Addsv(SinhVien sinhVien) {
		SinhVienRepo.Add(sinhVien);

	}

}
