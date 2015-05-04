package com.secret;

import java.io.Serializable;

/**
 * 
 * @author xxx
 *
 */
public class SecretFactory implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Get the right concrete class 
	 * Concrete class can be added here in future for different secret conditions
	 * @param num
	 * @return
	 */
	public SecretInterface getTestInterface(int num) {
		if(num == 0){
			return null;
		}else{
			return new SecretConcrete();
		}
	}
	
}
