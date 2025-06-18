package org.example.backendproject.purewebsocket.room.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.example.backendproject.purewebsocket.room.entity.ChatRoom;
import org.example.backendproject.purewebsocket.room.repository.RoomRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoomService {

    private final RoomRepository roomRepository;

    public ChatRoom createRoom(String roomId) {
        return roomRepository.findByRoomId(roomId)
            .orElseGet(() -> {
                ChatRoom chatRoom = new ChatRoom();
                chatRoom.setRoomId(roomId);
                return roomRepository.save(chatRoom);
        });
    }

    public List<ChatRoom> findAllRooms() {
        return roomRepository.findAll();
    }

}
