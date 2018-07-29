package group5;

import java.util.*;


public class XMLToken {

	String token = "";
	
	public XMLToken(String token) {
		this.token = token;
		
	}

	public boolean isTag() {
		return token.contains("<");
		
	}
	
	public boolean isData() {
		if (!token.contains("<")) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public boolean isClosingTag() {
		return token.startsWith("/", 1);
		
	}
	
	public boolean isOpeningTag() {
		if (token.contains("<") && !token.contains("/")) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public boolean isSelfClosingTag() {
		return token.endsWith("/>");
		
	}
	
	public String tagNames() {
		if (!token.contains("<") && !token.contains(">")) {
			return null;
		}
		else {	
		token.replaceAll("<", "");
		token.replaceAll("/", "");
		token.replaceAll(">", "");
		return token;
		}
		
	}


	
	
}
