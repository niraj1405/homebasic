package com.app.webapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.app.webapp.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer>{

}
