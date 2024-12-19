package com.estd.tenders.repository;


import com.estd.tenders.model.Bid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface BidRepository extends JpaRepository<Bid, Long> {

    // Find bids by user ID
    List<Bid> findByUserId(Long userId);

    // Find bids by tender ID
    List<Bid> findByTenderId(Long tenderId);

    // Find bids submitted after a specific date
    List<Bid> findBySubmittedAtAfter(LocalDateTime date);

    // Find bids submitted before a specific date
    List<Bid> findBySubmittedAtBefore(LocalDateTime date);

    // Find bids by amount greater than a specified value
    List<Bid> findByAmountGreaterThan(Double amount);

    // Find bids by amount less than a specified value
    List<Bid> findByAmountLessThan(Double amount);

    // Find bids for a specific tender and order by submission date descending
    List<Bid> findByTenderIdOrderBySubmittedAtDesc(Long tenderId);

    // Find all bids and order by submission date descending
    List<Bid> findAllByOrderBySubmittedAtDesc();
}
