package com.example.foodtruck.Service;

import com.example.foodtruck.Repository.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TicketService {
    private final TicketRepository ticketRepository;
}
