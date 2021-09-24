package br.com.danimlds.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.danimlds.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
