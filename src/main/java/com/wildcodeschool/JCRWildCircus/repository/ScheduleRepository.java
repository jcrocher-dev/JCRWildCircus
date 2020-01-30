package com.wildcodeschool.JCRWildCircus.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wildcodeschool.JCRWildCircus.entities.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, Long>{

	public List<Schedule> findScheduleBySpectacleEntitieId(Long spectacleId);

}
