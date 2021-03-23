package com.insight.global.longestpalindromicsubstring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "palindrome")
@Table(name = "palindrome", schema= "public")
public class Palindrome {

	@Id
	private String input;

	private int lengthOfLongestPalindrom;
	
	
	public Palindrome() {
		
	}
	public Palindrome(String input, int lengthOfLongestPalindrom) {
		super();
		this.input = input;
		this.lengthOfLongestPalindrom = lengthOfLongestPalindrom;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public int getLengthOfLongestPalindrom() {
		return lengthOfLongestPalindrom;
	}

	public void setLengthOfLongestPalindrom(int lengthOfLongestPalindrom) {
		this.lengthOfLongestPalindrom = lengthOfLongestPalindrom;
	}
	
}
