# Overview

I created a program that allows the user to add stocks to a portfolio with accurate current stock prices. The program contains a simple menu that prompts the user to make a choice from a given option list. The options are 'Add a stock', 'View stocks in portfolio', 'Remove a stock', 'Load a Portfolio', 'Save Portfolio', and 'Exit Program'. Each option is self explanitory, but I have yet to properly incorperate the load and save funtions. 

I wrote this software to stretch my knowledge of Java coding and to learn how to use and incorperate API's into a program. I chose stocks because I've always loved playing around with fake stock programs and wanted to try my hand at one.

[Software Demo Video](https://youtu.be/n7mbOLdjaiE)

# Development Environment

I used Visual Sudio Code as my main editor program and I used Finnhub for my API.

I wrote this program in Java and used the Java.util, java.io.BufferedReader, java.io.InputStreamReader, java.net.HttpURLConnection, java.net.URL, com.google.gson.Gson,and com.google.gson.JsonObject libraries.

# Useful Websites

- [Finnhub - Stock API](https://finnhub.io/)
- [polygon.io - Stock API](https://polygon.io/)
- [Medium - Java|Json|Gson -> How to access a nested array with Gson](https://medium.com/code-kings/java-json-gson-how-to-access-a-nested-array-with-gson-3067df1991ba)
- [Google AI Overview Connect to an API in Java](https://www.google.com/search?q=java+connect+to+an+api&rlz=1C1CHBF_enUS1021US1021&oq=java+connect+to+an+api&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTIICAEQABgWGB4yCAgCEAAYFhgeMggIAxAAGBYYHjINCAQQABiGAxiABBiKBTINCAUQABiGAxiABBiKBTIHCAYQABjvBTIKCAcQABiABBiiBDIKCAgQABiABBiiBNIBCDkxNDlqMGo3qAIIsAIB8QVNVuYpkGYHiA&sourceid=chrome&ie=UTF-8)
- [geeksforgeeks - Java User Input](https://www.geeksforgeeks.org/how-to-take-input-from-user-in-java/)

# Future Work

- Incorperate WebSockets to provide real-time accurate data.
- Work through all inputs to ensure all exceptions are caught and properly addressed.
- Create a GUI that allows the user to visually see a better version of the program output.
- Provide the ability to write and read from a file to store data.