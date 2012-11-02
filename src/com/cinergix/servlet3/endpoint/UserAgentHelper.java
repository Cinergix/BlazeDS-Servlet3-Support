package com.cinergix.servlet3.endpoint;

public class UserAgentHelper {

	
	public static String getMatchOnString ( String userAgentValue ) {
		
		if ( userAgentValue != null ) {
			
			if ( userAgentValue.indexOf( "MSIE" ) != -1 ) {
				return "MSIE";
			} else if ( userAgentValue.indexOf( "Firefox" ) != -1 ) {
				return "Firefox";
			} else if ( userAgentValue.indexOf( "Chrome" ) != -1 ) {
				return "Chrome";
			} else if ( userAgentValue.indexOf( "Apollo" ) != -1 ) {
				return "Apollo";
			} else if ( userAgentValue.indexOf( "Safari" ) != -1 ) {
				return "Safari";
			} else if ( userAgentValue.indexOf( "Opera" ) != -1 ) {
				return "Opera";
			}
			
		}
		
		return "";
		
	}
	
}
