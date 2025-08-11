package com.secure_service.example.secure_service.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserObjectModel {
    private String userName;
    private String userEmail;
    private String userBank;
    private List<UserTransactionObjectModel> recentTransactions;

    public UserObjectModel(String userName,
                    String userEmail,
                    String userBank) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userBank = userBank;
        this.recentTransactions = mockRecentTransactions();
    }

    private List<UserTransactionObjectModel> mockRecentTransactions() {
        return List.of(
                new UserTransactionObjectModel(
                        "Playstation 5 pro",
                        "2025-08-11T12:51:00",
                        "ZAR20799",
                        "KOODOO.CO.ZA"
                ),
                new UserTransactionObjectModel(
                        "Grand Theft Auto VI: Collectors Edition",
                        "2025-08-11T14:09:00",
                        "ZAR5999",
                        "KOODOO.CO.ZA"
                ),
                new UserTransactionObjectModel(
                        "Meal @KFC",
                        "2025-08-11T13:33:00",
                        "ZAR450",
                        "MR DELIVERY"
                )
        );
    }
}

