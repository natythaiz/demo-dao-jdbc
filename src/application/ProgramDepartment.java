package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entites.Department;

public class ProgramDepartment {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("Teste n° 1: department fyndById");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		
		scan.close();
	}

}
