package avaj_launcher;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

public class Crypted {
	public String cryptedStr(String str) throws NoSuchAlgorithmException {
		String hash;
		
		/* 
		 * We have a hashing functionality in java.security.MessageDigest Class.
		 * The idea is to first instantiate MessageDigest with the kind of algorithm you want to use as argument to the Singleton:
		 */
		MessageDigest md = MessageDigest.getInstance("MD5");
		
		/* 
		 * And then keep on updating the message digest using update() function:
		 */
		md.update(str.getBytes());
		
		/* 
		 * The above function can be called multiple times when say you are reading a long file.
		 * Then finally we need to use digest function to generate a hash code:
		 */
		byte[] digest = md.digest();
		
		hash = DatatypeConverter.printHexBinary(digest).toUpperCase();
		
		return hash;
	}
	
	public boolean verifHashs(String hash1, String hash2) {
		if (hash1.equals(hash2) == true)
			return true;
		return false;
	}
	
	public String hashNumberToString(int limit, String hash) {
		int i = 0;
		while (i <= limit)
		{
			if (Integer.toString(i).equals(hash) == true)
				return Integer.toString(i);
			i++;
		}
		return null;
	}
	
	public String hashBlocToString(String hash) {
		int i = 0;
		int j = 0;
		while (i < Tools.arrAircrafts.length)
		{
			j = 0;
			while (j < 1000) {
				if (hash.equals(Tools.arrAircrafts[i] + " " + Tools.arrAircrafts[i].charAt(0) + Integer.toString(j)) == true)
					return Tools.arrAircrafts[i] + " " + Tools.arrAircrafts[i].charAt(0) + Integer.toString(j);
				j++;
			}
			i++;
		}
		return null;
	}
	
	public boolean isThisMD5(String str) throws NoSuchAlgorithmException {
		String[] MD5Sentences = Tools.getMD5Sentences();
		int i = 0;
		
		while (i < MD5Sentences.length)
		{
			if (str.equals(cryptedStr(MD5Sentences[i])) == true)
				return true;
			i++;
		}
		return false;
	}
}
