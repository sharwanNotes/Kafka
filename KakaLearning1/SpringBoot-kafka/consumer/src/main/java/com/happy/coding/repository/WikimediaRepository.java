package com.happy.coding.repository;

import com.happy.coding.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaRepository extends JpaRepository<WikimediaData,Long> {
}
