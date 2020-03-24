package com.endava.university.repo;

import com.endava.university.domain.Staff;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StaffRepository extends PagingAndSortingRepository<Staff, Integer> {
}
