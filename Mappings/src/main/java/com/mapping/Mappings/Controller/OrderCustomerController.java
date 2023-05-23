package com.mapping.Mappings.Controller;


import com.mapping.Mappings.Dto.CustomerDto;
import com.mapping.Mappings.Dto.OrderDto;
import com.mapping.Mappings.Service.CustomerService;
import com.mapping.Mappings.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders-customers")
public class OrderCustomerController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private CustomerService customerService;

    @PostMapping("/Addorders")
    public OrderDto addOrder(@RequestBody OrderDto orderDto) {
        return orderService.createOrder(orderDto);
    }

    @GetMapping("/getorders")
    public List<OrderDto> getAllOrders() {
        return orderService.getAllOrders();
    }
    @PostMapping("/Addcustomers")
    public CustomerDto addCustomer(@RequestBody CustomerDto customerDto) {
        return customerService.createCustomer(customerDto);
    }

    @GetMapping("/customers")
    public List<CustomerDto> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/order-count-by-customer")
    public List<Object[]> getOrderCountByCustomer() {
        return orderService.getOrderCountByCustomer();
    }
    @GetMapping("/orders-ordered-by-customer-name")
    public List<Object[]> getOrdersOrderedByCustomerName() {
        return orderService.getOrdersOrderedByCustomerName();
    }

    @GetMapping("/orders/count")
    public ResponseEntity<List<Object[]>> getOrderCountsByCustomerLike(
            @RequestParam("keyword") String keyword
    ) {
        List<Object[]> results = orderService.getOrderCountsByCustomerLike(keyword);
        return new ResponseEntity<>(results, HttpStatus.OK);
    }
}
