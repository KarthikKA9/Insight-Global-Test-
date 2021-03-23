package com.insight.global.longestpalindromicsubstring.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insight.global.longestpalindromicsubstring.entity.Palindrome;

@Repository
public interface LongestPalindromicSubstringRepository extends JpaRepository<Palindrome, String>{

}
