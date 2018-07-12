/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenclass;

import java.util.TreeSet;

	public class Dog implements Comparable<Dog>{
	  private int age;
	  private String name;
	  public Dog(int age, String name){
	  	this.age = age;
      	this.name = name;
	  }
	  public int compareTo(Dog d){
                 //this.age - d.age;
	   	 return Integer.valueOf(age).compareTo(Integer.valueOf(d.age));
	  }
	  public static void main(String[] args){
	  	TreeSet<Dog> td = new TreeSet<Dog>();
	  	td.add(new Dog(12,"firulais"));
	  	td.add(new Dog(10,"bobby"));
	  	td.add(new Dog(8,"totto"));
	  	TreeSet<Integer> ti = new TreeSet<Integer>();
	  	ti.add(1);
	  	ti.add(3);
	  	ti.add(1);
	  	for(Dog d : td){
	      	System.out.println(d.name+" "+d.age);
	  	}
	  	for(Integer i : ti){
	      	System.out.println(i);
	  	}
	  }

    
}
