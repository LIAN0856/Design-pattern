package ObvStock;

public class StockCommon extends AStockPrice{
	
	public StockCommon (String code){
		super(code);
	}
	protected void notifyHolder() {
		System.out.println("��ͨ��Ʊ������-"+code+":");
		for(IStockHolder ish:stockHolderlist)
		{
			ish.update(this);
		}
		price2=price;
	}

}
