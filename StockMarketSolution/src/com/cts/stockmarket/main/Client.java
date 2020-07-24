package com.cts.stockmarket.main;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.cts.stockmarket.dao.StockMarketSystemDaoImpl;
import com.cts.stockmarket.model.Sector;
import com.cts.stockmarket.model.Stock;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StockMarketSystemDaoImpl impl=new StockMarketSystemDaoImpl();
		Map<Sector, List<Stock>> map=impl.readData();
		Set<Map.Entry<Sector, List<Stock>>> set=map.entrySet();
		for (Entry<Sector, List<Stock>> entry : set) {
//			System.out.println(entry);
			System.out.println("...................."+entry.getKey());
			for(Stock stock:entry.getValue()){
				System.out.println(stock.getSectorType());
			}
		}
		
		
		System.out.println("\n\n\n\n\n");
		List<Stock>  list=impl.getsStockSectorwise(map,Sector.Infotech);
		for (Stock stock : list) {
			System.out.println(stock.getSectorType()+"\t"+stock.getPurchaseDate());
		}
		
		System.out.println("\n\n\n\n\n");
		impl.calculateProfit(map);
		for (Entry<Sector, List<Stock>> entry : set) {
			System.out.println("...................."+entry.getKey());
			for(Stock stock:entry.getValue()){
				System.out.println(stock.getCostPrice()+"\t"+stock.getPresentPrice()+"\t"+stock.getNumberOfShares()+"\t"+stock.getTotalProfit());
			}
		}
		
		
		
		System.out.println("\n\n\n\n\n");
		List<Stock>  list1=impl.stockToSell(map);
		for (Stock stock : list1) {
			System.out.println(stock.getTotalProfit()+"\t"+stock.getStockName());
		}

		try {
		      File myObj = new File("filename.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		        FileWriter myWriter = new FileWriter("filename.txt");
		        myWriter.write("Stock Market: ");
		       // myWriter.write(stock.getCostPrice()+"\t"+stock.getPresentPrice()+"\t"+stock.getNumberOfShares()+"\t"+stock.getTotalProfit());
		        myWriter.close();
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}

}
