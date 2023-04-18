package com.BHoussem.springbootEcommerce.controller;

import com.BHoussem.springbootEcommerce.dto.Purchase;
import com.BHoussem.springbootEcommerce.dto.PurchaseResponse;
import com.BHoussem.springbootEcommerce.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService){
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase){
        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);
        return purchaseResponse;
    }
}
