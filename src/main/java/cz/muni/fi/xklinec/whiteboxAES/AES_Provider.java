package cz.muni.fi.xklinec.whiteboxAES;

import java.security.*;

public class AES_Provider extends Provider {
	public AES_Provider() {
		super("WBAES", 1.0, "WBAES Provider (implements white-box AES)");
		
		put("Cipher.AES/ECB/NoPadding", "cz.muni.fi.xklinec.whiteboxAES.AES_Cipher");
		
	}
}
