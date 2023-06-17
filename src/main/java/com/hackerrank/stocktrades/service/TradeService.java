package com.hackerrank.stocktrades.service;

import com.hackerrank.stocktrades.model.StockTrade;

import java.util.List;
import java.util.Optional;

public interface TradeService
{
	
	List<StockTrade> findAllTrades();
	
	StockTrade findTradeById(Integer id);
		
	void createNewTrade(StockTrade newTrade);
		
}
