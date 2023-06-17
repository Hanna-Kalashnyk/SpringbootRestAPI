package com.hackerrank.stocktrades.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class StockTrade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String type;
    private Integer userId;
    private String symbol;
    private Integer shares;
    private Integer price;
    private Long timestamp;
    
    public StockTrade(String type, Integer userId, String symbol, Integer shares, Integer price, Long timestamp)
    {
        this.type = type;
        this.userId = userId;
        this.symbol = symbol;
        this.shares = shares;
        this.price = price;
        this.timestamp = timestamp;
    }
    
    public StockTrade()
    {
    
    }
}
