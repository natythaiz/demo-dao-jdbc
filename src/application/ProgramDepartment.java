package application;

import java.util.List;
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
		
		System.out.println("\nTeste n° 2: department fyndAll");
		List<Department> list = departmentDao.findAll();
		for(Department obj: list) {
			System.out.println(obj);
		}
		
		scan.close();
	}

}
