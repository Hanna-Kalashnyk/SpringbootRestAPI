package com.hackerrank.stocktrades.controller;

import com.hackerrank.stocktrades.model.StockTrade;
import com.hackerrank.stocktrades.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/trades")
public class StockTradeRestController
{
	@Autowired
	private final TradeService tradeService;
	
	public StockTradeRestController(TradeService tradeService)
	{
		
		this.tradeService = tradeService;
	}
	
	
	@GetMapping()
	public List<StockTrade> getAllTrades()
	{
		
		return tradeService.findAllTrades();
	}
	
	@GetMapping("/{id}")
	public StockTrade getPeopleById(@PathVariable Integer id)
	{
		return tradeService.findTradeById(id);
	}
	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public void getPeopleByFirstName(@RequestBody StockTrade newTrade)
	{
		tradeService.createNewTrade(newTrade);
	}
}
