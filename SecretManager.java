package com.secret;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Centralize the functions that can be used anywhere in the program and can be tested
 * @author xxx
 *
 */
public class SecretManager implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Gets all the prime numbers
	 * @param num
	 * @return
	 */
	public List<Integer> getPrimeNumber(int num) {
		List<Integer> primNumbers = new ArrayList<Integer>();
		for (int i = 2; i < num; i++) {
			if(isPrime(i)){
				primNumbers.add(i);
			}
		}
		return primNumbers;
	}
	
	/**
	 * Check if number is a prime number
	 * @param num
	 * @return
	 */
	private boolean isPrime(int num) {
		if(num == 2 || num == 3 || num == 5 || num == 7){
			return true;
		}else if(num%2 == 0 || num%3==0 ||num%5==0 ||num%7==0){
			return false;
		}
		return true;
	}
	
}
