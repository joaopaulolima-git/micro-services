package com.jpdev.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpdev.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
