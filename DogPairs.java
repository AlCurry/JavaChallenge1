/*
 
Java coding challenge
September 22, 2017
Al Curry 
 
A pet adoption agency wants to pair adult dogs with puppies.  
There are B adult dogs and D puppies. For a pairing, the adult 
dog should be larger than the puppy. Given the sizes of all of 
the dogs, determine whether it is possible for all adult dogs 
to be paired with a puppy.  Each adult dog can be paired with 
only one puppy, and each puppy can only be paired with one 
adult dog.
 
Input: 
Line 1: the number of test cases

For each test case:
Line 1: the number of adult dogs and puppies.
Line 2: D integers each representing the size of the puppies.
Line 3: B integers each representing the size of the adult dogs.

Output:
Print YES if all adult dogs can be paired with a puppy.  Otherwise print NO. 
 
Limits: 
1<= Test Cases <=10
1<= Dog Size <=10000 
1<= Size <=200

Any error checking excluded due to time.

*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DogPairs {

    public static void main(String[] args) {
    	
    List<Integer> dogs = new ArrayList<Integer>();
    List<Integer> pups = new ArrayList<Integer>();
    
    
    System.out.println("Enter the number of test cases: ");
	Scanner sc = new Scanner(System.in);
	int cases = sc.nextInt();
	
	for (int i = 0; i < cases; i++) {
		System.out.println("Enter the number of dogs: ");
		int dogCount = sc.nextInt();
		
		System.out.println("Enter the sizes of the puppies, on one line: ");
		for (int j = 0; j < dogCount; j++) {
			int sizePup = sc.nextInt();
			//System.out.println(sizePup);
			pups.add(sizePup);		
		}

		System.out.println("Enter the sizes of the dogs, on one line: ");
		for (int j = 0; j < dogCount; j++) {
			int sizeDog = sc.nextInt();
			//System.out.println(sizeDog);
			dogs.add(sizeDog);	
		}
		
		pups.sort(null);
		dogs.sort(null);
		
		// compare sorted lists for dogs and pups, until a dog is less than a pup
		boolean yes = true;
		for (int j = 0; j < dogCount; j++) {
			if (dogs.get(j) < pups.get(j)) {
				yes = false;
				break;
			}
		}
								
		if (yes)
			System.out.println("YES");
		else
			System.out.println("NO");
	
		dogs.clear();
		pups.clear();
	}
		
    sc.close();

}
    
}