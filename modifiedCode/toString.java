//Modified

 public String toString() {
    	
	
	
	String currentState = getText();
	
	if (currentState.substring(0,1).equals("X")) {
	   
	    return currentState.substring(0,1);
	    
	} else {
		
	    return ".";
	}

 }