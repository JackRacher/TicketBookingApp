package com.ojas.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ojas.models.Ticket;

public interface TicketBookingDao extends JpaRepository<Ticket, Integer>{

}
