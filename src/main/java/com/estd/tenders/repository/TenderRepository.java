package com.estd.tenders.repository;


import com.estd.tenders.model.Tender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TenderRepository extends JpaRepository<Tender, Long> {

    // Find tenders by status
    List<Tender> findByStatus(String status);

    // Find tenders by title (case-insensitive)
    List<Tender> findByTitleIgnoreCase(String title);

    // Find all tenders created by a specific user (by user ID)
    List<Tender> findByCreatedById(Long userId);

    // Find tenders created after a specific date
    List<Tender> findByCreatedAtAfter(LocalDateTime date);

    // Find tenders created before a specific date
    List<Tender> findByCreatedAtBefore(LocalDateTime date);

    // Find tenders by status and order by creation date descending
    List<Tender> findByStatusOrderByCreatedAtDesc(String status);

    // Find all tenders and order by creation date descending
    List<Tender> findAllByOrderByCreatedAtDesc();
}
