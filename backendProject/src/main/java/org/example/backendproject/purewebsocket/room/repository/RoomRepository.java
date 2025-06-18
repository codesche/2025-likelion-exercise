package org.example.backendproject.purewebsocket.room.repository;


import java.util.Optional;
import org.example.backendproject.purewebsocket.room.entity.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<ChatRoom, Long> {

    Optional<ChatRoom> findByRoomId(String roomId);

}
