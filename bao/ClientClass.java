package bao;

import java.util.Random;

import Ada.Adapter;
import Ada.InewJuicer;
import Fly.APiece;
import Fly.PieceFactory;
import pro.Apple;
import pro.Banana;
import pro.MyFruit;
import pro.MyFruitStore;
import proxy.CRemoPic;
//import proxy.ClocalPicShow;
import proxy.IShowPic;
import DProxy.CTest;
import DProxy.ClocalPicShow;
import DProxy.ITestInterface;

public class ClientClass {

	public static void main(String[] args) {
		MyFruit fru1=new Apple();
		MyFruit fru2=new Banana();
		MyFruitStore mfs=MyFruitStore.Getfruitstore();
		mfs.Add(1, fru1);
		mfs.Add(2, fru2);
		mfs.Add(3, new Apple());
		mfs.Add(4, new Banana());
		MyFruit fru=(MyFruit)mfs.Get(3);
		fru.Display();
		System.out.println("mfs:"+mfs.toString());
		
		//InewJuicer newJuicer=new Adapter();
		//System.out.println(newJuicer.newPort(mfs.Get(1),mfs.Get(4)));
		
		Adapter newJuicer=new Adapter();
		System.out.println(newJuicer.newPort(mfs.Get(1),mfs.Get(4)));
		
		/*//MyFruit fru2=fru1;
		MyFruit fru2=(Apple)fru1.clone();
		fru1.Display();
		fru2.Display();
		System.out.println("fru1:"+fru1.hashCode());
		System.out.println("fru2:"+fru2.hashCode());
		System.out.println(fru1.equals(fru2));
		System.out.println(fru1==fru2);*/
		
		/*Random rm=new Random();
		PieceFactory pFactory=new PieceFactory();
		for(int i=0;i<19;i++)
			for(int j=0;j<19;j++)
			{ 
				APiece p;
				if(rm.nextInt()%2==0)
					p=pFactory.GetPiece("白棋");
				else
					p=pFactory.GetPiece("黑棋");
				p.Play(rm.nextInt(19),rm.nextInt(19));
			}
		System.out.println("总共棋子对象个数是："+pFactory.GetPieceCount());*/
		
		//ClocalPicShow cls=new ClocalPicShow();
		//cls.ShowPic("photo");
		
		//IShowPic proxy=(IShowPic)new ClocalPicShow();
		//proxy.ShowPic("AAA");
		
		/*IShowPic isp=new CRemoPic();
		ClocalPicShow cpic=new ClocalPicShow(isp);
		IShowPic localpic=(IShowPic)cpic.getProxyInstance();
		localpic.ShowPic("AAA");*/
		
		ITestInterface ipic=new CTest();
		ITestInterface proxy=(ITestInterface)new ClocalPicShow(ipic).getProxyInstance();
		proxy.SendMessage("AAA");
	}
}
