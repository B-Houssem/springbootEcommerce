package com.BHoussem.springbootEcommerce.service;

import com.BHoussem.springbootEcommerce.dto.Purchase;
import com.BHoussem.springbootEcommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
