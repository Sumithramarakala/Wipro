package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public Integer register(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

   
//    @Override
//    public Integer register(User user) { 
//        return userDAO.save(user); 
//    }
//
//    @Override
//    public void update(User user) { 
//        userDAO.update(user); 
//    }
//
//    @Override
//    public void delete(Integer id) { 
//        userDAO.delete(id); 
//    }
//
//    @Override
//    public User get(Integer id) { 
//        return userDAO.findById(id); 
//    }
//
//    @Override
//    public User getByEmail(String email) { 
//        return userDAO.findByEmail(email); 
//    }
//
//    @Override
//    public User getByName(String name) { 
//        return userDAO.findByName(name); 
//    }
//
//    @Override
//    public List<User> listAll() { 
//        return userDAO.findAll(); 
//    }
//
//	@Override
//	public Integer register(com.example.model.User user) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void update(com.example.model.User user) {
//		// TODO Auto-generated method stub
//		
//	}
}