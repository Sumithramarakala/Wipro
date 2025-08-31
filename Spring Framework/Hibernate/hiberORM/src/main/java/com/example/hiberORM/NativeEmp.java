package com.example.hiberORM;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.mapping.List;
import org.hibernate.query.NativeQuery;

import com.company.HibernateORM.Util.HibernateUtil;
import com.example.hiberORM.model.Employee;

public class NativeEmp {
	public static void main( String[] args )
    {
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
     
//        
        //create
        String insertq="INSERT into emp(name,email) VALUES(?,?)";
        NativeQuery<?> insert=session.createNativeQuery(insertq);
        insert.setParameter(1, "Summihrabls");
        insert.setParameter(2, "summitmaarakalaa@gmail.com");
        insert.executeUpdate();
        System.out.println("Data Added");
        
        
        
        //Update
//        String updateQuery="Update emp set email=? where id=?";
//        NativeQuery<?> update=session.createNativeQuery(updateQuery);
//        update.setParameter(1,"sumithrabls@gmail.com");
//        update.setParameter(2, "7");
//        update.executeUpdate();
//        System.out.println("Data Updated");
        
        //delete
        String deleteq="delete from emp where id=?";
        NativeQuery<?> delete=session.createNativeQuery(deleteq);
        delete.setParameter(1, 9);
        delete.executeUpdate();
        System.out.println("data is deleted");
//        
        
        //Read
//        String selectq="select * from emp";
//        NativeQuery<?> select=session.createNativeQuery(selectq);
        //List data = Employee.list();
//        for(Object[] row:select.list()) {
//        	System.out.println("ID"+row[0]+", Name: "+row[2]+", Email"+row[1]);
//        }
        tx.commit();
        session.close();
        
    }

}
