import java.util.ArrayList;
import java.util.Random;

public class StackClass {
	public ArrayList<Integer> numList;
	int poppednum;
	
	public StackClass() {
		this.numList = new ArrayList<>();
	}
	
// The Method add() add the Element to the ArrayList	
public void add(int element) {
	numList.add(element);
	
}

// The Method pop() gets the value of the Popped Element and Prints it
public void pop(){
	poppednum = numList.remove(numList.size() - 1);
	System.out.println("Popped Number: "+ poppednum);
}

// The Method RandomNum() is the one that gets the random number ranging from 1 - 100
// The for loop randomly generates the number and the add() method is called which then adds the random values to the ArrayList
public void RandomNum() {
	Random r = new Random();
	for(int i = 0; i < 10; i++) {
		int rndNum = r.nextInt(100) + 1;
		add(rndNum);
	}
	
// The method result() then prints out the Elements of the ArrayList
// The for loop is used to print and remove the popped elements using the method pop()
}public void result(){
	RandomNum();
	System.out.print("Array Elements of Random Number: "+numList+"\n");
	for(int i = 0; i < 10; i++) {
	pop();
	}
}
public static void main(String [] args) {
	StackClass stack = new StackClass();
	stack.result();
	}
	
}


