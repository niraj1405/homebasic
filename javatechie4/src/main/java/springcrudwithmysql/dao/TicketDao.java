package springcrudwithmysql.dao;

import org.springframework.data.repository.CrudRepository;

import springcrudwithmysql.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer>{

}
