package com.akpgrp.repository;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akpgrp.model.Project;


public interface ProjectRepository extends JpaRepository<Project, Integer> {
	public List<Project> findByOwnerId(Integer id);
	Project findByProjectId(Integer projectId);
}