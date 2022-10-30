package com.ijse.pos.pos.api;

import com.ijse.pos.pos.dto.CustomerDto;
import com.ijse.pos.pos.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @PostMapping
    public String saveCustomer(
          @RequestBody CustomerDto dto
    ) {
       return customerService.saveCustomer(dto)+" Saved!";
    }

    @PutMapping
    public String updateCustomer(
            @RequestBody CustomerDto dto
    ) {
        return "Update Customer";
    }

    @GetMapping("/{id}")
    public String getCustomer(@PathVariable String id) {
        return "get Customer";
    }

    @DeleteMapping
    public String deleteCustomer(@RequestParam String id) {
        return "delete Customer";
    }

    @GetMapping("/all")
    public String getAllCustomers(
            @RequestParam int page,
            @RequestParam int size,
            @RequestParam String searchText
    ) {
        return "get All Customers";
    }
}
