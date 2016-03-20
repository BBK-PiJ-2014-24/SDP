package myReflection;

import java.util.ArrayList;
import java.util.List;

public class Dog {

	private int age;
	private String colour;
	private List<String> dogList = new ArrayList<String>();
	
	public Dog(){
		this.age = 12;
		this.colour = "black";
	}
	
	public Dog(int a){
		this.age = a;
		this.colour = "red";
	}
	
	public Dog(int a, String c){
		this.age = a;
		this.colour = c;
	}
	
	
	public int getAge(){
		return age;
	}
	
	public String makeBark(){
		return "Woof, Woof!!";
	}
	
	
	public void makingBarks(int x){
		String s="";
		for(int i=0;i<x;i++){
			s+="Woof, Grrrr! ";
		}
		System.out.println(s);
	}
	
	
}
