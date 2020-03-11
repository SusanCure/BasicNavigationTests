package com.cbt.utilities;

public class StringUtility {


   public static void main(String[] args) {

verifyEquals("pumpkin","watermelon");
   }

   public static void verifyEquals(String expected, String actual) {

      if (expected.equalsIgnoreCase(actual)) {
         System.out.println("PASS");
      }else{
         System.out.println("FAILED");
      }
      System.out.println("expected is " +expected+"\n"+"actual is " + actual);

   }
}