package ObvStock;

public class StockFutures extends AStockPrice{
	
	public StockFutures (String code){
		super(code);
	}
	protected void notifyHolder() {
		System.out.println("�ڻ�������-"+code+":");
		for(IStockHolder ish:stockHolderlist)
		{
			ish.update(this);
		}
		price2=price;
	}

}
