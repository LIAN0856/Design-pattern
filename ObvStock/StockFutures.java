package ObvStock;

public class StockFutures extends AStockPrice{
	
	public StockFutures (String code){
		super(code);
	}
	protected void notifyHolder() {
		System.out.println("期货更新了-"+code+":");
		for(IStockHolder ish:stockHolderlist)
		{
			ish.update(this);
		}
		price2=price;
	}

}
