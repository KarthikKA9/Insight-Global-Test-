#Overview

longest-palindromic-substring is a microservice with 2 APIs, which is as below:
1. Store longest palindrome size of a String
2. Fetch longest palindrome size of a String from DB

The results are being stored in h2 database.


#Build
To build use below command:
mvn clean install

To Run the service use below command:
- Go to target folder : cd target
- java -jar longest-palindromic-substring.jar

#Test

1. Store longest palindrome size of a String

http://localhost:8080/longestpalindrom/store?input=test

2. Fetch longest palindrome size of a String from DB

http://localhost:8080/longestpalindrom/fetch?input=test

output: 3
