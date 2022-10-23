package com.ijse.pos.pos.service.impl;

import com.ijse.pos.pos.dto.CustomerDto;
import com.ijse.pos.pos.entity.Customer;
import com.ijse.pos.pos.repo.CustomerRepo;
import com.ijse.pos.pos.service.CustomerService;
import com.ijse.pos.pos.util.mapper.CustomerMapper;
import org.springframework.stereotype.Service;

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
    public String saveCustomer(CustomerDto dto) {
        return customerRepo.save(
                customerMapper.toCustomer(dto))
                .getName();
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
    public String getAllCustomers(int page, int size, String searchText) {
        return null;
    }
}
