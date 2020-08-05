package com.qseat.domain.repositories;

import com.qseat.domain.entities.Booking;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BookingRepository extends PagingAndSortingRepository<Booking, String> {
}
