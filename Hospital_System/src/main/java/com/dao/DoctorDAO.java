package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Doctor;

public class DoctorDAO {
	private Connection conn;

	public DoctorDAO(Connection conn) {
		super();
		this.conn = conn;
	}

	public boolean registerDoctor(Doctor d) {
		boolean flag = false;

		try {
			String query = "insert into doctor(full_name,dob,qualification,specialist,email,mobno,password) values(?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, d.getFullName());
			ps.setString(2, d.getDob());
			ps.setString(3, d.getQualification());
			ps.setString(4, d.getSpecialist());
			ps.setString(5, d.getEmail());
			ps.setString(6, d.getMobNo());
			ps.setString(7, d.getPassword());

			int i = ps.executeUpdate();
			if (i == 1) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag;
	}

	public List<Doctor> getAllDoctor() {
		List<Doctor> list = new ArrayList<Doctor>();
		Doctor d = null;
		try {

			String query = "select * from doctor order by id desc";
			PreparedStatement ps = conn.prepareStatement(query);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				d = new Doctor();
				d.setId(rs.getInt(1));
				d.setFullName(rs.getString(2));
				d.setDob(rs.getString(3));
				d.setQualification(rs.getString(4));
				d.setSpecialist(rs.getString(5));
				d.setEmail(rs.getString(6));
				d.setMobNo(rs.getString(7));
				d.setPassword(rs.getString(8));
				list.add(d);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public Doctor getDoctorById(int id) {

		Doctor d = null;
		try {

			String query = "select * from doctor where id=?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				d = new Doctor();
				d.setId(rs.getInt(1));
				d.setFullName(rs.getString(2));
				d.setDob(rs.getString(3));
				d.setQualification(rs.getString(4));
				d.setSpecialist(rs.getString(5));
				d.setEmail(rs.getString(6));
				d.setMobNo(rs.getString(7));
				d.setPassword(rs.getString(8));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return d;
	}

	public boolean updateDoctor(Doctor d) {
		boolean flag = false;

		try {
			String query = "update doctor set full_name=?,dob=?,qualification=?,specialist=?,email=?,mobno=?,password=? where id=?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, d.getFullName());
			ps.setString(2, d.getDob());
			ps.setString(3, d.getQualification());
			ps.setString(4, d.getSpecialist());
			ps.setString(5, d.getEmail());
			ps.setString(6, d.getMobNo());
			ps.setString(7, d.getPassword());
			ps.setInt(8, d.getId());
			int i = ps.executeUpdate();

			if (i == 1) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag;
	}

	public boolean deleteDoctor(int id) {
		boolean flag = false;
		try {
			String query = "delete from doctor where id=?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);

			int i = ps.executeUpdate();
			if (i == 1) {
				flag = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag;
	}

	public Doctor login(String email, String psw) {
		Doctor d = null;
		try {

			String query = "select * from doctor where email=? and password=?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, email);
			ps.setString(2, psw);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				d = new Doctor();
				d = new Doctor();
				d.setId(rs.getInt(1));
				d.setFullName(rs.getString(2));
				d.setDob(rs.getString(3));
				d.setQualification(rs.getString(4));
				d.setSpecialist(rs.getString(5));
				d.setEmail(rs.getString(6));
				d.setMobNo(rs.getString(7));
				d.setPassword(rs.getString(8));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return d;
	}

	public int countDoctor() {
		int n = 0;
		try {
			String query = "select * from doctor";
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				n++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return n;
	}

	public int countAppointment() {
		int n = 0;
		try {
			String query = "select * from appointment";
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				n++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return n;
	}

	public int countAppointmentByDocotrId(int did) {
		int n = 0;
		try {
			String query = "select * from appointment where doctor_id=?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, did);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				n++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return n;
	}

	public int countUSer() {
		int n = 0;
		try {
			String query = "select * from user_dtls";
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				n++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return n;
	}

	public int countSpecialist() {
		int n = 0;
		try {
			String query = "select * from specialist";
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				n++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return n;
	}

	public boolean checkOldPassword(int userid, String oldPassword) {
		boolean flag = false;

		try {
			String query = "select * from doctor where id=? and password=?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, userid);
			ps.setString(2, oldPassword);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				flag = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag;
	}

	public boolean changePassword(int userid, String newPassword) {
		boolean flag = false;

		try {
			String query = "update doctor set password=? where id=?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, newPassword);
			ps.setInt(2, userid);

			int i = ps.executeUpdate();
			if (i == 1) {
				flag = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag;
	}

	public boolean editDoctorProfile(Doctor d) {
		boolean flag = false;

		try {
			String query = "update doctor set full_name=?,dob=?,qualification=?,specialist=?,email=?,mobno=? where id=?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, d.getFullName());
			ps.setString(2, d.getDob());
			ps.setString(3, d.getQualification());
			ps.setString(4, d.getSpecialist());
			ps.setString(5, d.getEmail());
			ps.setString(6, d.getMobNo());
			ps.setInt(7, d.getId());
			int i = ps.executeUpdate();

			if (i == 1) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag;
	}
}
