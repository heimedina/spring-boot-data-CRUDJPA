package com.ideas.springboot.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ideas.springboot.app.models.entity.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long>{
	

}
