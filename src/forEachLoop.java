/**
 * a Program to test the for each loop
 */


// The foreach loop, also known as the enhanced for loop in Java,
// is a control structure that simplifies the process of iterating over elements in 
// an array or any iterable collection. It provides a concise and readable way to traverse
// through the elements without worrying about the underlying indexing or handling iteration logic.


// syntax:
// for (datatype element : collection) {
//     // code to be executed for each element
// }

// Explanation:

// datatype: The data type of the elements in the collection.
// element: A variable that represents the current element being processed in the iteration.
// collection: The array or iterable collection over which the loop iterates.

// Benefits:

// Easy to read and understand.
// No need to manage the index explicitly.
// Avoids common mistakes related to indexing, such as off-by-one errors.
// Enhanced safety, as the loop is less prone to causing exceptions related to accessing elements outside the collection bounds.

// Limitations of for-each loop 
// 1. For-each loops are not appropriate when you want to modify the array
// 2. For-each loops do not keep track of index. So we can not obtain array index using For-Each loop 
// 3.  For-each only iterates forward over the array in single steps 
// 4. For-each cannot process two decision making statements at once 
// 5. For-each also has some performance overhead over simple iteration

class ForEachExample{
    private int numbers[]={1,2,3,4,5,6,7};
   public void iterationHandler(){
for (int  number: numbers) {
        System.out.println(number);
}
   }
}

public class forEachLoop {
    public static void main(String[] args) {
        ForEachExample loop=new ForEachExample();
        loop.iterationHandler();
    }
}
