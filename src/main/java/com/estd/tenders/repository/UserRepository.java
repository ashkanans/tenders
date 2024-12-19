package com.estd.tenders.repository;

import com.estd.tenders.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    // Find users by role
    List<User> findByRole(String role);

    // Check if a user exists by email
    boolean existsByEmail(String email);

    // Find users by name (case-insensitive)
    List<User> findByNameIgnoreCase(String name);

    // Find all users ordered by name
    List<User> findAllByOrderByNameAsc();

    // Delete a user by email
    void deleteByEmail(String email);
}