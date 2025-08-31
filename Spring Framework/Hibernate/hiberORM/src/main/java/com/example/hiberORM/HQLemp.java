package com.example.hiberORM;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.company.HibernateORM.Util.HibernateUtil;
import com.example.hiberORM.model.Employee;

public class HQLemp {
	public static void main( String[] args )
    {
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        
        //create
        Employee emp=new Employee("sunil tholar","suniltholar@gmail.com");
        session.save(emp);
        System.out.println("save");
        
        //update
//        String updatehql="Update emp set email=? where id=?";
//        Query<?> update=session.createQuery(updatehql);
//        update.setParameter("email","sumithra@gmail.com");
//        update.setParameter("id", 1);
//        update.executeUpdate();
//        System.out.println("Updated");
        
      //delete
//        String deletehql="delete from emp where id=?";
//        Query<?> delete=session.createQuery(deletehql);
//        delete.setParameter("id", 1);
//        delete.executeUpdate();
//        System.out.println("data is deleted");
        
        
        tx.commit();
        session.close();
        
        


} }




