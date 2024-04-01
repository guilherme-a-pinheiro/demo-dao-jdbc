package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("Teste findAll");
        List<Department> list = new ArrayList<>();
        list = departmentDao.findAll();
        list.forEach(System.out::println);

        System.out.println("========================");
        System.out.println("Teste findById");
        System.out.println(departmentDao.findById(4));

        System.out.println("========================");
        System.out.println("Teste insert");
        Department newDep = new Department(7, "Marketing");
        departmentDao.insert(newDep);
        System.out.println("Inserted! New id: " + newDep.getId());
    }
}
