package com.example.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Comment;

@Service
public class CommentServiceImpl implements CommentService {

	@Override
	public Integer add(Comment comment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Comment comment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Comment get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> listByTask(Integer taskId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> listByUser(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

//    @Autowired
//    private CommentDAO commentDAO;
//
//    @Override
//    public Integer add(Comment comment) {
//        return commentDAO.save(comment);
//    }
//
//    @Override
//    public void update(Comment comment) {
//        commentDAO.update(comment);
//    }
//
//    @Override
//    public void delete(Integer id) {
//        commentDAO.delete(id);
//    }
//
//    @Override
//    public Comment get(Integer id) {
//        return commentDAO.findById(id);
//    }
//
//    @Override
//    public List<Comment> listAll() {
//        return commentDAO.findAll();
//    }
//
//    @Override
//    public List<Comment> listByTask(Integer taskId) {
//        return commentDAO.findByTask(taskId);
//    }
//
//    @Override
//    public List<Comment> listByUser(Integer userId) {
//        return commentDAO.findByUser(userId);
//    }
}