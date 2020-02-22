package lishidaihuan;

import java.util.Base64;

public class CipherB extends CipherA {
	String encrypt(String planText) {
		if(planText==null) {
	   		 return null;
	   	 }
	   	 byte[]bytes=planText.getBytes();
	   	 byte[]result=Base.encodeBase(bytes);
	   	 return new Stringstring(result);
	    }
}
