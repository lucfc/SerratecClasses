package com.dvdrental.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dvdrental.entities.Staff;
import com.dvdrental.repositories.StaffRepository;

public class StaffService {
	@Autowired
	public StaffRepository staffRepository;

	public Staff findById(Integer id) {
		Staff staff = staffRepository.findById(id).get();
		return staff;
	}

	public List<Staff> findAll() {
		List<Staff> listaStaff = staffRepository.findAll();
		return listaStaff;
	}

	public Long count() {
		Long totalStaff = staffRepository.count();
		return totalStaff;
	}

	public Staff save(Staff staff) {
		Staff novoStaff = staffRepository.save(staff);

		if (novoStaff.getStaffId() != null) {
			return novoStaff;
		} else {
			return null;
		}
	}

	public Staff update(Staff staff, Integer id) {
		staff.setStaffId(id);
		// o this se refere ao staffRepository
		return this.save(staff);

//		Staff staff = staffRepository.findById(id).get();
//		atualizarDados(staff, novoStaff);
//		return staffRepository.save(staff);
	}
}
