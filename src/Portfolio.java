import java.util.List;

public class Portfolio {
    private StockService stockService;
    private List<FileStock> stocks;

    public StockService getStockService() {
        return stockService;
    }

    public void setStockService(StockService stockService) {
        this.stockService = stockService;
    }

    public List<FileStock> getStocks() {
        return stocks;
    }

    public void setStocks(List<FileStock> stocks) {
        this.stocks = stocks;
    }

    public double getMarketValue(){
        double marketValue = 0.0;

        for(FileStock stock:stocks){
            marketValue += stockService.getPrice(stock) * stock.getQuantity();
        }
        return marketValue;
    }
}
