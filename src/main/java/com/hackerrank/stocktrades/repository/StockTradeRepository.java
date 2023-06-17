package com.hackerrank.stocktrades.repository;

import com.hackerrank.stocktrades.model.StockTrade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockTradeRepository extends JpaRepository<StockTrade, Integer> {
}
