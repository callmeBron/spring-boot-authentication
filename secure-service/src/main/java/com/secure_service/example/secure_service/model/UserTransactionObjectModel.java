package com.secure_service.example.secure_service.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserTransactionObjectModel {
    private String purchaseName;
    private String purchaseTime;
    private String purchaseAmount;
    private String purchaseRetailer;

    public UserTransactionObjectModel(String purchaseName,
                                      String purchaseTime,
                                      String purchaseAmount,
                                      String purchaseRetailer) {
        this.purchaseName = purchaseName;
        this.purchaseTime = purchaseTime;
        this.purchaseAmount = purchaseAmount;
        this.purchaseRetailer = purchaseRetailer;
    }
}
