// Stack = Last IN First OUT
// Push = add the value
// Peek = Select last one
// Pop = Remove last one

package MyCode.Stack;
import java.util.*;

public class stack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Cat");
        animals.push("Horse");
        animals.push("Deer");

        System.out.println(animals);
        animals.pop();
        System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals.peek());
    }
}
