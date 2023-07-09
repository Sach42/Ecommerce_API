package com.sachin.Ecommerce.API.controller;

import com.sachin.Ecommerce.API.model.Address;
import com.sachin.Ecommerce.API.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresses")
public class AddressController {
    private final AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping
    public List<Address> getAllAddresses() {
        return addressService.getAllAddresses();
    }

    @GetMapping("/{addressId}")
    public Address getAddressById(@PathVariable Integer addressId) {
        return addressService.getAddressById(addressId);
    }

    @PostMapping
    public Address createAddress(@RequestBody Address address) {
        return addressService.createAddress(address);
    }

    @DeleteMapping("/{addressId}")
    public void deleteAddress(@PathVariable Integer addressId) {
        addressService.deleteAddress(addressId);
    }
}
