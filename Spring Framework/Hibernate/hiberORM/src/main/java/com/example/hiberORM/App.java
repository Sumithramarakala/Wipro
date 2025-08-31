//package com.example.hiberORM;
//
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//
//import com.company.HibernateORM.Util.HibernateUtil;
//import com.example.hiberORM.model.Employee;
//
///**
// * Hello world!
// *
// */
//public class App 
//{
//    public static void main( String[] args )
//    {
//        Session session=HibernateUtil.getSessionFactory().openSession();
//        Transaction tx=session.beginTransaction();
//        Employee emp=new Employee("Sumatima","sumatima@gmail.com");
//        session.persist(emp);
//        tx.commit();
//        
//        // updating data
//        Employee eData=new Employee(Employee.class,emp.getId());
//        System.out.println("Rtrieved the data: "+eData);
//        
//        tx=session.beginTransaction();
//        eData.setEmail("SunilKundar@gmail.com");
//        System.out.println("updated data is: "+eData);
//        tx.commit();
//        
//        // Native Query 
//        
//        
//       
//         tx = session.beginTransaction();
//         session.evict(eData); // eData will be  detached from the session
//     
//      System.out.println(session.contains(eData));
//      Employee ed =  session.get(Employee.class, emp.getId());
//      session.remove(emp);
//      
//      Employee emp1 = new Employee("Rohini" , "Rohini@gmail.com"); // transient
//	   
//	   session.persist(emp1);//Make a transient instance persistent 
//	   session.remove(emp1); // emp1 object is removed from session
//	   tx.commit();
//	   session.close(); 
//	   HibernateUtil.close(); // closing the session factory
//       session.get(Employee.class, emp1.getId());
//    
////      
//        
//    }
//}

//package com.wipro.CRUDOp;
//
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//import org.hibernate.query.Query;
//
//import com.wipro.CRUDUtil.EmployeeUtil;
//import com.wipro.EmpModel.Employees;
//
//import java.util.List;
//
//public class HqlCrud {
//
//    public void insertEmployee(String name, double salary) {
//        Session session = EmployeeUtil.getSessionFactory().openSession();
//        Transaction tx = session.beginTransaction();
//        Employees emp = new Employees(name, salary);
//        session.save(emp);
//        tx.commit();
//        session.close();
//        System.out.println("Inserted using HQL: " + emp);
//    }
//    public void getEmployees() {
//        Session session = EmployeeUtil.getSessionFactory().openSession();
//        Query<Employees> query = session.createQuery("from Employees", Employees.class);
//        List<Employees> employees = query.list();
//        employees.forEach(System.out::println);
//        session.close();
//    }
//    public void updateEmployee(int id, double newSalary) {
//        Session session = EmployeeUtil.getSessionFactory().openSession();
//        Transaction tx = session.beginTransaction();
//        Query query = session.createQuery("update Employees set salary = :sal where id = :id");
//        query.setParameter("sal", newSalary);
//        query.setParameter("id", id);
//        int result = query.executeUpdate();
//        tx.commit();
//        session.close();
//        System.out.println("Updated records: " + result);
//    }
//    public void deleteEmployee(int id) {
//        Session session = EmployeeUtil.getSessionFactory().openSession();
//        Transaction tx = session.beginTransaction();
//        Query query = session.createQuery("delete from Employees where id = :id");
//        query.setParameter("id", id);
//        int result = query.executeUpdate();
//        tx.commit();
//        session.close();
//        System.out.println("Deleted records: " + result);
//    }
//}
//
//

//package com.wipro.CRUDOp;
//
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//import org.hibernate.query.NativeQuery;
//
//import com.wipro.CRUDUtil.EmployeeUtil;
//import com.wipro.EmpModel.Employees;
//
//import java.util.List;
//
//public class NativeCrud {
//    public void insertEmployee(String name, double salary) {
//        Session session = EmployeeUtil.getSessionFactory().openSession();
//        Transaction tx = session.beginTransaction();
//        String sql = "INSERT INTO employees(name, salary) VALUES(:name, :salary)";
//        NativeQuery<?> query = session.createNativeQuery(sql);
//        query.setParameter("name", name);
//        query.setParameter("salary", salary);
//        query.executeUpdate();
//        tx.commit();
//        session.close();
//        System.out.println("Inserted using Native SQL.");
//    }
//    public void getEmployees() {
//        Session session = EmployeeUtil.getSessionFactory().openSession();
//        String sql = "SELECT * FROM employees";
//        NativeQuery<Employees> query = session.createNativeQuery(sql, Employees.class);
//        List<Employees> employees = query.list();
//        employees.forEach(System.out::println);
//        session.close();
//    }
//    public void updateEmployee(int id, double newSalary) {
//        Session session = EmployeeUtil.getSessionFactory().openSession();
//        Transaction tx = session.beginTransaction();
//        String sql = "UPDATE employees SET salary = :sal WHERE id = :id";
//        NativeQuery<?> query = session.createNativeQuery(sql);
//        query.setParameter("sal", newSalary);
//        query.setParameter("id", id);
//        int result = query.executeUpdate();
//        tx.commit();
//        session.close();
//        System.out.println("Updated records: " + result);
//    }
//    public void deleteEmployee(int id) {
//        Session session = EmployeeUtil.getSessionFactory().openSession();
//        Transaction tx = session.beginTransaction();
//        String sql = "DELETE FROM employees WHERE id = :id";
//        NativeQuery<?> query = session.createNativeQuery(sql);
//        query.setParameter("id", id);
//        int result = query.executeUpdate();
//        tx.commit();
//        session.close();
//        System.out.println("Deleted records: " + result);
//    }
//}
