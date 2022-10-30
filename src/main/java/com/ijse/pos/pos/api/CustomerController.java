package com.ijse.pos.pos.api;

import com.ijse.pos.pos.dto.CustomerDto;
import com.ijse.pos.pos.service.CustomerService;
import com.ijse.pos.pos.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @PostMapping
    public ResponseEntity<StandardResponse> saveCustomer(
          @RequestBody CustomerDto dto
    ) {
        return new ResponseEntity<>(
                new StandardResponse(201,
                        customerService.saveCustomer(dto).getId()+" Saved!",
                        customerService.saveCustomer(dto)),HttpStatus.CREATED
        );
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
    public ResponseEntity<StandardResponse> getAllCustomers() {
        return new ResponseEntity<>(
                new StandardResponse(200," Customer List!",
                customerService.getAllCustomers()),HttpStatus.OK
        );
    }
}
