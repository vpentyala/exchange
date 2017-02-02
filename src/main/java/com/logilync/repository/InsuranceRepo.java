package com.logilync.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logilync.domain.Insurance;

public interface InsuranceRepo extends JpaRepository<Insurance, Long> {

}
