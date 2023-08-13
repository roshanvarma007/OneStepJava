package project;

import java.util.Scanner;

public class ToDoList {



	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
//Create array and add toDoItem in array	
String [] toDoList = new String [5];
//Get inputr from user and add in array

for (int i=0; i<toDoList.length; i++) {
	System.out.println("Enter Your To Item : ");
	
	toDoList[i] = scan.nextLine();
	
}
//print your to do item	
System.out.println("/Here is your To DO List Item");
for (String item : toDoList) {
	System.out.println(item);
}
	
	}

}
