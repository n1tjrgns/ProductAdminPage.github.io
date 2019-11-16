package com.n1tjrgns.admin.repository;

import com.n1tjrgns.admin.model.entity.Partner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartnerRepository extends JpaRepository<Partner,Long> {
}
