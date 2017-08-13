package lt;

import java.lang.reflect.Array;
import java.util.Hashtable;

public class L535 {

	Hashtable<Integer,String> HashUrl = new Hashtable();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
    	
    	int value = 0;
    	HashUrl.put(value,longUrl);
    	
    	String NewUrl = "http://lt.com/";
    	NewUrl += value;
    	value++;
		return NewUrl;
        
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
    	
    	String[] ArrayUrl=shortUrl.split("com/");
    	int intshort = Integer.parseInt(ArrayUrl[1]);
    	String OriginalUrl = HashUrl.get(intshort);
    	
		return OriginalUrl;
        
    }

}
