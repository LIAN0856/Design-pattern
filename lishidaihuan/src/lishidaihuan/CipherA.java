package lishidaihuan;

import java.util.Base64;

public class CipherA {
	String encrypt(String planText) {
   	 if(planText==null) {
   		 return null;
   	 }
   	 byte[]bytes=planText.getBytes();
   	 byte[]result=Base64.encodeBase64(bytes);
   	 return new Stringstring(result);
    }
}
