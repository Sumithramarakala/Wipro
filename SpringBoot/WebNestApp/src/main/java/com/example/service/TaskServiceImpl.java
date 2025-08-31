package com.example.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Task;

@Service
public class TaskServiceImpl implements TaskService {

	@Override
	public Integer add(Task task) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Task task) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Task get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> listByUser(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> listByStatus(String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> listByAssignedBy(Integer adminId) {
		// TODO Auto-generated method stub
		return null;
	}

//    @Autowired
//    private TaskDAO taskDAO;
//
//    @Override
//    public Integer add(Task task) { 
//        return taskDAO.save(task); 
//    }
//
//    @Override
//    public void update(Task task) 
//    { 
//    	taskDAO.update(task); 
//    }
//
//    @Override
//    public void delete(Integer id) 
//    { 
//    	taskDAO.delete(id); 
//    }
//
//    @Override
//    public Task get(Integer id) 
//    { 
//    	return taskDAO.findById(id); 
//    }
//
//    @Override
//    public List<Task> listAll() 
//    { 
//    	return taskDAO.findAll(); 
//    }
//
//    @Override
//    public List<Task> listByUser(Integer userId) 
//    { 
//    	return taskDAO.findByUser(userId); 
//    }
//    
// // Add these methods to your existing TaskServiceImpl class
//
//    @Override
//    public List<Task> listByStatus(String status) {
//        return taskDAO.findByStatus(status);
//    }
//
//    @Override
//    public List<Task> listByAssignedBy(Integer adminId) {
//        return taskDAO.findByAssignedBy(adminId);
//    }
}
