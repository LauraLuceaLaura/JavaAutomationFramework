<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Practice Suite">
  <test name="Test Basics 1">
      <parameter name="emailid" value="tester456@gmail.com"/>
      <parameter name="password" value="test@123"/>
      <classes>
      <class name="practiceTests.testParameters"/>
      </classes>
  </test> <!-- Test --> 
   
  <test name="Test Basics 2">    
    <parameter name="emailid" value="tester789@gmail.com"/>
    <classes>
       <class name="practiceTests.testOptional"/>
    </classes>
     
  </test> <!-- Test -->
</suite> <!-- Suite -->