package com.ijse.pos.pos.service.impl;

import com.ijse.pos.pos.dto.CustomerDto;
import com.ijse.pos.pos.dto.paginated.PaginatedResponseDto;
import com.ijse.pos.pos.entity.Customer;
import com.ijse.pos.pos.repo.CustomerRepo;
import com.ijse.pos.pos.service.CustomerService;
import com.ijse.pos.pos.util.mapper.CustomerMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerMapper customerMapper;
    private final CustomerRepo customerRepo;

    public CustomerServiceImpl(CustomerMapper customerMapper,
                               CustomerRepo customerRepo) {
        this.customerMapper = customerMapper;
        this.customerRepo = customerRepo;
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto dto) {
        customerRepo.save(
                new Customer(dto.getId(), dto.getName(),
                        dto.getAddress(),dto.getSalary())
        );
        return dto;
    }

    @Override
    public String updateCustomer(CustomerDto dto) {
        return null;
    }

    @Override
    public String deleteCustomer(String id) {
        return null;
    }

    @Override
    public String getCustomer(String id) {
        return null;
    }

    @Override
    public PaginatedResponseDto getAllCustomers() {
        List<Customer> all = customerRepo.findAll();
        List<CustomerDto> dtoList= new ArrayList<>();
        for (Customer c:all
             ) {
            dtoList.add(
                    new CustomerDto(c.getId(),c.getName(),
                            c.getAddress(),c.getSalary())
            );
        }
        return
                new PaginatedResponseDto(
                        all.size(),
                        dtoList
                );
    }
}
