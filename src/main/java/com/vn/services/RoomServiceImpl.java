package com.vn.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vn.dao.RoomDAO;
import com.vn.model.Room;
@Repository("roomDAO")
public class RoomServiceImpl implements RoomService{

	private RoomDAO roomDAO;

	@Autowired
	public void setRoomDAO(RoomDAO roomDAO) {
		this.roomDAO = roomDAO;
	}

	@Override
	@Transactional
	public void persistRoom(Room slot) {
		// TODO Auto-generated method stub
		roomDAO.persistRoom(slot);
	}

	@Override
	@Transactional
	public void updateRoom(Room slot) {
		// TODO Auto-generated method stub
		roomDAO.updateRoom(slot);
	}

	@Override
	@Transactional
	public void deleteRoom(Room slot) {
		// TODO Auto-generated method stub
		roomDAO.deleteRoom(slot);
	}

	@Override
	@Transactional
	public List<Room> listRooms() {
		// TODO Auto-generated method stub
		return roomDAO.listRooms();
	}
	
	
}
