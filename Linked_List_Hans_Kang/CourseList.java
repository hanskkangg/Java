package assignment3;
/**
 * File Name: CourseList.java
 * Student Name: Hans Kang, 040694631 
 * Professor: Fedor, Ilitchev
 * Due Date: Dec 7, 2023 
 * Modified: Dec 2, 2023 
 * Description: This program shows various operations using linked lists using APPROPRIATE and SUITABLE method including adding, printing, converting to uppercase, deleting elements, reversing,
 * sorting, and removing duplicates.
 * 
 * @author Hans Kang
 * @version 17.0.7
 * @since javaSE-17
 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

public class CourseList {

    /**
     * Main method to demonstrate the functionality of the CourseList class
     * and used as an entry point for the class.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
    	
        System.out.println("Welcome Everyone to My Assignment 3. My name is Hans Kang\n");
       
        //created first and second Linkedlist of string named list1 and list2
        //Creating instances of generic classes
        LinkedList<String> list1 = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();

        
        //Add content to list1 and courses2 to list2 and iterate elements in array. 
        //using add() method of List interface
        String[] courses = { "math,", "english,", "chemistry,", "physics,", "history,", "geography," };        
        for (String firstCourses : courses) 
        {
            list1.add(firstCourses);
        }
        String[] courses2 = { "religion,", "arts,", "accounting,", "math,", "programming,", "biology,","biology,","biology,"};
        for (String secondCourses : courses2) 
        {
            list2.add(secondCourses); 
        }


        // Task: Adding the elements in list2 to list1 using the APPROPRIATE METHOD and display updated content 
        // I used APPROPRIATE METHOD, addAll() method. it's a part of the Collection.
        list1.addAll(list2);
        printList(list1);
        

        // Converting and displaying names of courses in uppercase letters
        System.out.printf("%nDisplaying names of courses in uppercase letters...\n");
        System.out.printf("\nThe List is:");
        System.out.println();
        // I used ListIterator Interface to make suitable Method to convert to upper case
        //using toUpperCase() method
        printListUpperCase(list1);

        
        // Deleting courses from index 4 to 6
        System.out.printf("%nDeleting courses 4 to 6...");
        System.out.println();
        
        //I'm deleting from list 4 to 7 to delete courses 4 to 6 becuase
        // Using clear() method on a sublist, where the start index is included, but the end index is excluded.
        deleteList(list1, 4, 7); // to delete elements at 4 5 6 
        printList(list1);

        
        // Displaying the current list of courses
        System.out.printf("%nHere is the current list of courses...\n");
        System.out.println();
        printList(list1);


        System.out.printf("%nReversed List:");
        // Reversing the list and printing the reversed elements
        System.out.println();
        //I'm using previous() method of IteratorList Interface,
        //it's an appropriate method to make the list reversed. 
        reverseList(list1);

        
        // Sorting courses in alphabetical order
        System.out.printf("%nSorted courses in alphabetical order...\n");
        System.out.printf("%nThe List is:\n");
        //sort is a part of collection class which is also a suitable method to sort in alphabetic order.
        //it sort in their natural order which is alphabetic order
        sortList(list1);
        System.out.println();

        
        // Removing duplicate courses and printing the result
        System.out.printf("%nRemoving duplicate courses...\n");
        System.out.println();
        //I'm using Hashset to remove duplicate value which is a suitable method
        noDuplication(list1);   
    }
    

    /**
     * Prints the elements of linked list.
     *
     * @param list The linked list to be printed.
     */
    public static void printList(LinkedList<String> list) {

        System.out.println("The List is:");
        for (String currentList : list) {
            System.out.printf("%s ", currentList);
        }
        System.out.println();
    }

    /**
     * Converts the elements of the linked list to uppercase and prints them.
     *
     * @param list The linked list to be processed.
     */
    
    public static void printListUpperCase(LinkedList<String> list) {
    	
    	//create listIterator named upperIterator for given linked list
    	ListIterator<String> upperIterator = list.listIterator();
        
        //set elements to upper case while there's available next string
    	while (upperIterator.hasNext()) {
    	    String nextString = upperIterator.next();
    	    //settings elements upper case
    	    upperIterator.set(nextString.toUpperCase());
    	}
        
    	//display current list elements
    	for (String nextString : list) {
    	    System.out.printf("%s ", nextString);
    	}
    	System.out.println();
    }

    /**
     * Deletes elements within the specified range in the linked list.
     *
     * @param list  The linked list from which elements will be deleted.
     * @param start The starting index of the range (inclusive).
     * @param end   The ending index of the range (exclusive).
     */
    public static void deleteList(LinkedList<String> list, int start, int end) {
    	
    	//clear() method remove elements from sublist that's between start and end.
        list.subList(start, end).clear();
        System.out.println();
    }

    /**
     * Prints the reversed elements of the linked list.
     *
     * @param list The linked list to be reversed and printed.
     */
    public static void reverseList(LinkedList<String> list) {
        ListIterator<String> iterator = list.listIterator(list.size());
        //I'm using iterator interface and previous method to make list reverse.
        //previous method retrieve previous elements
        while (iterator.hasPrevious()) {
            System.out.printf("%s ", iterator.previous());
        }
        System.out.println();
    }

    /**
     * Sorts the elements of the linked list in alphabetical order and prints them.
     *
     * @param list The linked list to be sorted.
     */
    public static void sortList(LinkedList<String> list) {
    	//using collection class to sort things in natural order which is alphabetical order
        Collections.sort(list);
        for (String s : list) {
            System.out.printf("%s ", s);
        }
    }

    /**
     * Removes duplicate elements from the linked list and prints the result.
     *
     * @param list The linked list from which duplicates will be removed.
     */

    /**
     * Removes duplicate elements from the linked list and prints the result.
     *
     * @param list The linked list from which duplicates will be removed.
     */
    public static void noDuplication(LinkedList<String> list) {
        // Create a new HashSet from the elements of the linked list
        Set<String> noDup = new HashSet<>(list);

        System.out.print("Non-duplicates are: \n");
        for (String uniqueElement : noDup) {
            System.out.printf("%s ", uniqueElement);
        }

        list.clear(); // Clear the list
        // adding all list again
        list.addAll(noDup);

        
         
        //to see the actual values

        System.out.println("\n");
        printList(list);
    }
}


