package com.vn.dao;

import java.util.List;

import com.vn.model.Room;

public interface RoomDAO {

	void persistRoom(Room slot);
	void updateRoom(Room slot); 
	void deleteRoom(Room slot);
	List<Room> listRooms();
}
