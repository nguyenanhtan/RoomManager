package com.vn.dao;


import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.vn.model.Room;

public class RoomDAOImpl implements RoomDAO{

	public SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void persistRoom(Room slot) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(slot);
	}

	@Override
	public void updateRoom(Room slot) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(slot);
	}

	@Override
	public void deleteRoom(Room slot) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(slot);
	}

	@Override
	public List<Room> listRooms() {
		// TODO Auto-generated method stub
		SQLQuery q = sessionFactory.getCurrentSession().createSQLQuery("SELECT * FROM room");
		q.addEntity(Room.class);
//				sessionFactory.getCurrentSession().getTransaction().commit();
		return q.list();
	}
	

	
}
