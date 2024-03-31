package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("Teste findByID");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=========\n");
        System.out.println("Teste findByDepartment");
        Department dep = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(dep);
        list.forEach(System.out::println);

        System.out.println("\n=========\n");
        System.out.println("Teste findAll");
        list = sellerDao.findAll();
        list.forEach(System.out::println);
    }
}
