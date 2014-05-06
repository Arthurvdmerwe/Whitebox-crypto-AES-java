package cz.muni.fi.xbacinsk;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import cz.muni.fi.xklinec.whiteboxAES.generator.AEShelper;


public class Test {
	
    public static final byte testVect_128_plain[][] = new byte[][]{
        {(byte)0x32, (byte)0x43, (byte)0xf6, (byte)0xa8, (byte)0x88, (byte)0x5a, (byte)0x30, (byte)0x8d, 
         (byte)0x31, (byte)0x31, (byte)0x98, (byte)0xa2, (byte)0xe0, (byte)0x37, (byte)0x07, (byte)0x34},
        {(byte)0x6b, (byte)0xc1, (byte)0xbe, (byte)0xe2, (byte)0x2e, (byte)0x40, (byte)0x9f, (byte)0x96, 
         (byte)0xe9, (byte)0x3d, (byte)0x7e, (byte)0x11, (byte)0x73, (byte)0x93, (byte)0x17, (byte)0x2a},
        {(byte)0xae, (byte)0x2d, (byte)0x8a, (byte)0x57, (byte)0x1e, (byte)0x03, (byte)0xac, (byte)0x9c, 
         (byte)0x9e, (byte)0xb7, (byte)0x6f, (byte)0xac, (byte)0x45, (byte)0xaf, (byte)0x8e, (byte)0x51},
        {(byte)0x30, (byte)0xc8, (byte)0x1c, (byte)0x46, (byte)0xa3, (byte)0x5c, (byte)0xe4, (byte)0x11, 
         (byte)0xe5, (byte)0xfb, (byte)0xc1, (byte)0x19, (byte)0x1a, (byte)0x0a, (byte)0x52, (byte)0xef},
        {(byte)0xf6, (byte)0x9f, (byte)0x24, (byte)0x45, (byte)0xdf, (byte)0x4f, (byte)0x9b, (byte)0x17, 
         (byte)0xad, (byte)0x2b, (byte)0x41, (byte)0x7b, (byte)0xe6, (byte)0x6c, (byte)0x37, (byte)0x10}
	};
    
    public static final byte testVect_136_plain[] = new byte[] {
    	(byte)0x32, (byte)0x43, (byte)0xf6, (byte)0xa8, (byte)0x88, (byte)0x5a, (byte)0x30, (byte)0x8d, 
        (byte)0x31, (byte)0x31, (byte)0x98, (byte)0xa2, (byte)0xe0, (byte)0x37, (byte)0x07, (byte)0x34,
        (byte)0x6b
    };
    
    public static final byte testVect_120_plain[] = new byte[] {
    				(byte)0xc1, (byte)0xbe, (byte)0xe2, (byte)0x2e, (byte)0x40, (byte)0x9f, (byte)0x96, 
        (byte)0xe9, (byte)0x3d, (byte)0x7e, (byte)0x11, (byte)0x73, (byte)0x93, (byte)0x17, (byte)0x2a
    };
    
    public static final byte testVect_112_plain[] = new byte[] {
		(byte)0xc1, (byte)0xbe, (byte)0xe2, (byte)0x2e, (byte)0x40, (byte)0x9f, (byte)0x96, (byte)0xe9,
		(byte)0x3d, (byte)0x7e, (byte)0x11, (byte)0x73, (byte)0x93, (byte)0x17
};
    
    
	public static void main(String[] args) {
/*		try {
			
			byte[] keyData = new byte[] {
					(byte)0x2b, (byte)0x7e, (byte)0x15, (byte)0x16, (byte)0x28,
					(byte)0xae, (byte)0xd2, (byte)0xa6, (byte)0xab, (byte)0xf7,
					(byte)0x15, (byte)0x88, (byte)0x09, (byte)0xcf, (byte)0x4f, (byte)0x3c};
			
			Key keyEnc = new SecretKeySpec(keyData, "AES");
			
			Cipher encryptor = Cipher.getInstance("AES/ECB/NoPadding", "WBAES");
			encryptor.init(Cipher.ENCRYPT_MODE, keyEnc);
			byte[] outputEnc = encryptor.doFinal(testVect_128_plain[0], 0, 16);
			
			
			for(int iter = 0; iter < 16; iter++)
				System.out.println("outputEnc = " + String.format("%02X", outputEnc[iter]));
			
			Key keyDec = new SecretKeySpec(keyData, "AES");
			
			Cipher decryptor = Cipher.getInstance("AES/ECB/NoPadding","WBAES");
			decryptor.init(Cipher.DECRYPT_MODE, keyDec);
			byte[] outputDec = decryptor.doFinal(outputEnc, 0, 16);
			
			
			for(int iter = 0; iter < 16; iter++)
				System.out.println("outputDec = " + String.format("%02X", outputDec[iter]));
			
			System.out.println("Haj hou! - 1");
			
		} catch (Exception e) {
			System.out.println("Hodilo vynimku!!! - " + e.getMessage());
		}
*/
/*
		try {
			
			byte[] keyData = new byte[] {
					(byte)0x2b, (byte)0x7e, (byte)0x15, (byte)0x16, (byte)0x28,
					(byte)0xae, (byte)0xd2, (byte)0xa6, (byte)0xab, (byte)0xf7,
					(byte)0x15, (byte)0x88, (byte)0x09, (byte)0xcf, (byte)0x4f, (byte)0x3c};
			
			Key keyEnc = new SecretKeySpec(keyData, "AES");
			
			Cipher encryptor = Cipher.getInstance("AES/ECB/NoPadding", "WBAES");
			encryptor.init(Cipher.ENCRYPT_MODE, keyEnc);
			byte[] outputEnc1 = encryptor.update(testVect_136_plain, 0, 17);
			byte[] outputEnc2 = encryptor.doFinal(testVect_120_plain, 0, 15);
			
			
			for(int iter = 0; iter < 16; iter++)
				System.out.println("outputEnc1 = " + String.format("%02X", outputEnc1[iter]));
			
			for(int iter = 0; iter < 16; iter++)
				System.out.println("outputEnc2 = " + String.format("%02X", outputEnc2[iter]));
			
			
			Key keyDec = new SecretKeySpec(keyData, "AES");
			
			Cipher decryptor = Cipher.getInstance("AES/ECB/NoPadding", "WBAES");
			decryptor.init(Cipher.DECRYPT_MODE, keyDec);
			byte[] outputDec1 = decryptor.update(outputEnc1, 0, 16);
			byte[] outputDec2 = decryptor.doFinal(outputEnc2, 0, 16);
			
			
			for(int iter = 0; iter < 16; iter++)
				System.out.println("outputDec1 = " + String.format("%02X", outputDec1[iter]));
			
			for(int iter = 0; iter < 16; iter++)
				System.out.println("outputDec2 = " + String.format("%02X", outputDec2[iter]));
			
			
			System.out.println("Haj hou! - 2");
			
		} catch (Exception e) { System.out.println("Hodilo vynimku!!! - " + e.toString()); }
*/
/*
		try {
			
			byte[] keyData = new byte[] {
					(byte)0x2b, (byte)0x7e, (byte)0x15, (byte)0x16, (byte)0x28,
					(byte)0xae, (byte)0xd2, (byte)0xa6, (byte)0xab, (byte)0xf7,
					(byte)0x15, (byte)0x88, (byte)0x09, (byte)0xcf, (byte)0x4f, (byte)0x3c};
			
			Key keyEnc = new SecretKeySpec(keyData, "AES");
			
			Cipher encryptor = Cipher.getInstance("AES/ECB/PKCS5PADDING", "WBAES");
			encryptor.init(Cipher.ENCRYPT_MODE, keyEnc);
			byte[] outputEnc = encryptor.doFinal(testVect_128_plain[0], 0, 16);
			
			for(int iter = 0; iter < outputEnc.length; iter++)
				System.out.println("outputEnc = " + String.format("%02X", outputEnc[iter]));
			
			Key keyDec = new SecretKeySpec(keyData, "AES");
			
			Cipher decryptor = Cipher.getInstance("AES/ECB/PKCS5PADDING", "WBAES");
			decryptor.init(Cipher.DECRYPT_MODE, keyDec);
			byte[] outputDec = decryptor.doFinal(outputEnc, 0, outputEnc.length);
			
			for(int iter = 0; iter < outputDec.length; iter++)
				System.out.println("outputDec = " + String.format("%02X", outputDec[iter]));
			
			System.out.println("Haj hou! - 3");
			
		} catch (Exception e) { System.out.println("Hodilo vynimku!!! - " + e.toString()); }
*/
/*
		try {
			
			byte[] keyData = new byte[] {
					(byte)0x2b, (byte)0x7e, (byte)0x15, (byte)0x16, (byte)0x28,
					(byte)0xae, (byte)0xd2, (byte)0xa6, (byte)0xab, (byte)0xf7,
					(byte)0x15, (byte)0x88, (byte)0x09, (byte)0xcf, (byte)0x4f, (byte)0x3c};
			
			Key keyEnc = new SecretKeySpec(keyData, "AES");
			
			Cipher encryptor = Cipher.getInstance("AES/ECB/PKCS5PADDING", "WBAES");
			encryptor.init(Cipher.ENCRYPT_MODE, keyEnc);
			byte[] outputEnc = encryptor.doFinal(testVect_112_plain, 0, 14);
			
			for(int iter = 0; iter < outputEnc.length; iter++)
				System.out.println("outputEnc = " + String.format("%02X", outputEnc[iter]));
			
			Key keyDec = new SecretKeySpec(keyData, "AES");
			
			Cipher decryptor = Cipher.getInstance("AES/ECB/PKCS5PADDING", "WBAES");
			decryptor.init(Cipher.DECRYPT_MODE, keyDec);
			byte[] outputDec = decryptor.doFinal(outputEnc, 0, outputEnc.length);
			
			for(int iter = 0; iter < outputDec.length; iter++)
				System.out.println("outputDec = " + String.format("%02X", outputDec[iter]));
			
			System.out.println("Haj hou! - 3");
			
		} catch (Exception e) { System.out.println("Hodilo vynimku!!! - " + e.toString()); }
*/
/*
		try {
			
			byte[] keyData = new byte[] {
					(byte)0x2b, (byte)0x7e, (byte)0x15, (byte)0x16, (byte)0x28,
					(byte)0xae, (byte)0xd2, (byte)0xa6, (byte)0xab, (byte)0xf7,
					(byte)0x15, (byte)0x88, (byte)0x09, (byte)0xcf, (byte)0x4f, (byte)0x3c};
			
			Key keyEnc = new SecretKeySpec(keyData, "AES");
			
			Cipher encryptor = Cipher.getInstance("AES/ECB/PKCS5PADDING", "WBAES");
			encryptor.init(Cipher.ENCRYPT_MODE, keyEnc);
			byte[] outputEnc = encryptor.doFinal(testVect_136_plain, 0, 17);
			
			for(int iter = 0; iter < outputEnc.length; iter++)
				System.out.println("outputEnc = " + String.format("%02X", outputEnc[iter]));
			
			Key keyDec = new SecretKeySpec(keyData, "AES");
			
			Cipher decryptor = Cipher.getInstance("AES/ECB/PKCS5PADDING", "WBAES");
			decryptor.init(Cipher.DECRYPT_MODE, keyDec);
			byte[] outputDec = decryptor.doFinal(outputEnc, 0, outputEnc.length);
			
			for(int iter = 0; iter < outputDec.length; iter++)
				System.out.println("outputDec = " + String.format("%02X", outputDec[iter]));
			
			System.out.println("Haj hou! - 3");
			
		} catch (Exception e) { System.out.println("Hodilo vynimku!!! - " + e.toString()); }
*/

		try {
			
			byte[] keyData = new byte[] {
					(byte)0x2b, (byte)0x7e, (byte)0x15, (byte)0x16, (byte)0x28,
					(byte)0xae, (byte)0xd2, (byte)0xa6, (byte)0xab, (byte)0xf7,
					(byte)0x15, (byte)0x88, (byte)0x09, (byte)0xcf, (byte)0x4f, (byte)0x3c};
			
			Key keyEnc = new SecretKeySpec(keyData, "AES");
			
			Cipher encryptor = Cipher.getInstance("AES/ECB/PKCS5PADDING", "WBAES");
			encryptor.init(Cipher.ENCRYPT_MODE, keyEnc);
			
			Key keyDec = new SecretKeySpec(keyData, "AES");
			
			Cipher decryptor = Cipher.getInstance("AES/ECB/PKCS5PADDING", "WBAES");
			decryptor.init(Cipher.DECRYPT_MODE, keyEnc);
						
		} catch (Exception e) {
			System.out.println("Hodilo vynimku!!! - ");
			e.printStackTrace();
			return;
		}
		
		try {
			
			Cipher encryptor = Cipher.getInstance("AES/ECB/PKCS5PADDING", "WBAES");
			encryptor.init(Cipher.ENCRYPT_MODE, (Key)null);
			byte[] outputEnc = encryptor.doFinal(testVect_136_plain, 0, 17);
			
			for(int iter = 0; iter < outputEnc.length; iter++)
				System.out.println("outputEnc = " + String.format("%02X", outputEnc[iter]));
						
			Cipher decryptor = Cipher.getInstance("AES/ECB/PKCS5PADDING", "WBAES");
			decryptor.init(Cipher.DECRYPT_MODE, (Key)null);
			byte[] outputDec = decryptor.doFinal(outputEnc, 0, outputEnc.length);
			
			for(int iter = 0; iter < outputDec.length; iter++)
				System.out.println("outputDec = " + String.format("%02X", outputDec[iter]));
			
			System.out.println("Haj hou! - Serialization with padding");
			
		} catch (Exception e) {
			System.out.println("Hodilo vynimku!!! - ");
			e.printStackTrace();
			return;
		}

		
/*
		try {
			
			byte[] keyData = new byte[] {
					(byte)0x2b, (byte)0x7e, (byte)0x15, (byte)0x16, (byte)0x28,
					(byte)0xae, (byte)0xd2, (byte)0xa6, (byte)0xab, (byte)0xf7,
					(byte)0x15, (byte)0x88, (byte)0x09, (byte)0xcf, (byte)0x4f, (byte)0x3c};
			
			Key keyEnc = new SecretKeySpec(keyData, "AES");
			
			Cipher encryptor = Cipher.getInstance("AES/ECB/NoPadding", "WBAES");
			encryptor.init(Cipher.ENCRYPT_MODE, keyEnc);
						
		} catch (Exception e) {
			System.out.println("Hodilo vynimku!!! - ");
			e.printStackTrace();
			return;
		}
		
		try {
			
			Cipher encryptor = Cipher.getInstance("AES/ECB/NoPadding", "WBAES");
			encryptor.init(Cipher.ENCRYPT_MODE, (Key)null);
			byte[] outputEnc = encryptor.doFinal(testVect_128_plain[0], 0, 16);
			
			for(int iter = 0; iter < 16; iter++)
				System.out.println("outputEnc = " + String.format("%02X", outputEnc[iter]));
			
			System.out.println("Haj hou! - Serialization");
			
		} catch (Exception e) {
			System.out.println("Hodilo vynimku!!! - ");
			e.printStackTrace();
			return;
		}
*/
		
	}
}
