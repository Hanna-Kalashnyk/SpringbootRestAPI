package com.hackerrank.stocktrades.service;

import com.hackerrank.stocktrades.model.StockTrade;
import com.hackerrank.stocktrades.repository.StockTradeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TradeServiceImpl implements TradeService
{
	private final StockTradeRepository stockTradeRepository;
	
	public TradeServiceImpl(StockTradeRepository stockTradeRepository) {
		this.stockTradeRepository = stockTradeRepository;
	}
	@Override
	public List<StockTrade> findAllTrades()
	{
		return stockTradeRepository.findAll();
	}
	@Override
	public StockTrade findTradeById(Integer id)
	{
		return stockTradeRepository.findById(id).orElseThrow();
	}
	@Override
	public void createNewTrade(StockTrade newTrade)
	{
		stockTradeRepository.save(newTrade);
	}
}
