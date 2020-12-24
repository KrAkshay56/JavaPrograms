package skillrary;
/*
 * Given two strings, a and b, return the result of putting them together in the order abba, 
 * e.g. "Hi" and "Bye" returns "HiByeByeHi".


makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"
 */
public class MakeAbbA {
	public static void main(String[] args) {
		System.out.println(makeAbba("Hi", "Bye"));
	}
	public static String makeAbba(String word1,String word2) {
		return word1+word2+word2+word1;
	}

}
