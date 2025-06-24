package org.example.backendproject.user.repository;

import org.example.backendproject.user.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfilerRepository extends JpaRepository<UserProfile, Long> {

}
