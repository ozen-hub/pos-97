package com.ijse.pos.pos.service;

import com.ijse.pos.pos.dto.CustomerDto;
import com.ijse.pos.pos.dto.paginated.PaginatedResponseDto;

public interface CustomerService {
    public CustomerDto saveCustomer(CustomerDto dto);
    public CustomerDto updateCustomer(CustomerDto dto);
    public String deleteCustomer(String id);
    public CustomerDto getCustomer(String id);
    public PaginatedResponseDto getAllCustomers();
}
