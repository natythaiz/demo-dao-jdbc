package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Department;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("Teste n° 1: seller fyndById");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\nTeste n° 2: seller fyndByDepartment");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\nTeste n° 3: seller fyndAll");
		list = sellerDao.findAll();
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\nTeste n° 4: seller insert");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\nTeste n° 5: seller update");
		seller = sellerDao.findById(1);
		seller.setName("Marta Waine");
		sellerDao.update(seller);
		System.out.println("Update Completed!");
		
		System.out.println("\nTeste n° 6: seller delete");
		System.out.println("Enter id for delete test: ");
		int id = scan.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed!");
		
		
		scan.close();
	}

}
