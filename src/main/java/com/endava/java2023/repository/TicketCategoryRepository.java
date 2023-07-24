package com.endava.java2023.repository;

import com.endava.java2023.model.TicketCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketCategoryRepository extends JpaRepository<TicketCategory,Integer> {
    List<TicketCategory> findTicketCategoriesByEventId(Integer eventId);
    TicketCategory findTicketCategoryById(Integer eventId);
}
