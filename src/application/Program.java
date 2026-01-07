package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("Teste n° 1: seller fyndById");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
	}

}
