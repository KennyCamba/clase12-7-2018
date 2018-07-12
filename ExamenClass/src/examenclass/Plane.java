/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenclass;


public class Plane {
    
	   static String s = "-";
	   public static void main(String[] args) {
	       new Plane().s1();
	       System.out.println(s);
	   }
	   void s1() {
	       try {
	           s2();
	       } catch (Exception e) {
	           s += "c";
	       }
	   }
	   void s2() throws Exception {
	       s3();
	       s += "2";
	       s3();
	       s += "2b";
	   }
	   void s3() throws Exception {
	       throw new Exception();
	   }
	}

