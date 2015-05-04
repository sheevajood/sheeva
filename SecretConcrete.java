package com.secret;

import java.io.Serializable;

/**
 * 
 * @author xxx
 *
 */
public class SecretConcrete implements Serializable, SecretInterface
{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Any implementation can be in this method
	 */
	public Integer secret(int num) {
		
		return num;
	}
	
}
