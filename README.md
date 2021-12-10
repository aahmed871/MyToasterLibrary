# MyToasterLibrary
This is my Toaster Library
To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

gradle
maven
sbt
leiningen
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.aahmed871:MyToasterLibrary:1.0.3'
	}
Step 3. Add Method like in Your Working class

       ToasterMessage.Division(firstNum,secondNum);
       ToasterMessage.Multiplication(firstNum,secondNum);
       ToasterMessage.Subtraction(firstNum,secondNum);
       ToasterMessage.Addition(firstNum,secondNum);
       These method return the addition,subtracyion,multiplication and division of two numbers,firstNum and secondNum are the two parameters of the function. 
       You can take values  from editText and pass the parameters.
       
Step 5. Important Point:
        
	These method return the addition,subtracyion,multiplication and division of two numbers,
	firstNum and secondNum are the two parameters of the function. 
       You can take values from editText and pass the parameters.


       
Step 4.Issues:
      
      If you have any issues reagrding this library just create a issue. 
