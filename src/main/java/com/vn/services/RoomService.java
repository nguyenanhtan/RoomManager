package com.vn.services;

import java.util.List;

import com.vn.model.Room;

public interface RoomService {

	void persistRoom(Room slot);
	void updateRoom(Room slot); 
	void deleteRoom(Room slot);
	List<Room> listRooms();
}
