package com.insight.global.longestpalindromicsubstring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.insight.global.longestpalindromicsubstring.repository.LongestPalindromicSubstringService;

@RestController
@RequestMapping(value="longestpalindrom")
public class LongestPalindromicSubstringController {


	@Autowired
	private LongestPalindromicSubstringService longestPalindromicSubstringService;
	
	@GetMapping("store")
	public void findLongestPalindrom(@RequestParam String input) {
		longestPalindromicSubstringService.findLongestPalindrom(input);
	}
	
	@GetMapping("fetch")
	public int getOutput(@RequestParam String input) {
		return longestPalindromicSubstringService.getOutput(input);
	}
}
