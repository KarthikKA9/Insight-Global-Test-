package com.insight.global.longestpalindromicsubstring.repository;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insight.global.longestpalindromicsubstring.entity.Palindrome;
import com.insight.global.longestpalindromicsubstring.repository.exception.NoDataFoundException;
import com.insight.global.longestpalindromicsubstring.service.LongestPalindromicSubstringRepository;

@Service
public class LongestPalindromicSubstringServiceImpl implements LongestPalindromicSubstringService{

	@Autowired
	private LongestPalindromicSubstringRepository longestPalindromicSubstringRepository;
	
	private final Logger logger = LoggerFactory.getLogger(LongestPalindromicSubstringServiceImpl.class);

	
	@Override
	public void findLongestPalindrom(String input) {
		logger.info("finding longest Palindrom for {}", input);
		int lengthOfLongestPalindrom=longestPalindromeSubseq(input);
		longestPalindromicSubstringRepository.save(new Palindrome(input, lengthOfLongestPalindrom));
		logger.info("Successfully found Palindrom for {}, which is {}", input, longestPalindromicSubstringRepository);
	}
	
	@Override
	public int getOutput(String input) {
		logger.info("Getting longest Palindrom for {}", input);
		Optional<Palindrome> optionalPalindrome= longestPalindromicSubstringRepository.findById(input);
		if(optionalPalindrome.isPresent()) {
			return optionalPalindrome.get().getLengthOfLongestPalindrom();
		}else {
			logger.error("No Data Found for input String : {}", input);
			throw new NoDataFoundException("No Data Found for input String   : " + input);
		}
	}
	
	public static int longestPalindromeSubseq(String s) {
        int size=s.length();
        int[][] palindromeArray = new int[size][size];
        for(int i=size-1;i>=0;i--){
        	palindromeArray[i][i]=1;
            for(int j=i+1;j<size;j++){
                if(s.charAt(i)==s.charAt(j)){
                	palindromeArray[i][j]=palindromeArray[i+1][j-1]+2;
                }else{
                	palindromeArray[i][j]=Math.max(palindromeArray[i+1][j],palindromeArray[i][j-1]);
                }
            }
        }
        return palindromeArray[0][size-1];
    }
}
