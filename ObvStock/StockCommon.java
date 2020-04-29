package ObvStock;

public class StockCommon extends AStockPrice{
	
	public StockCommon (String code){
		super(code);
	}
	protected void notifyHolder() {
		System.out.println("普通股票更新了-"+code+":");
		for(IStockHolder ish:stockHolderlist)
		{
			ish.update(this);
		}
		price2=price;
	}

}
