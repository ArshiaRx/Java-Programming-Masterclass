import java.util.Scanner;

public class sortedArray {
        private static Scanner scanner= new Scanner(System.in);

        public static void main(String[] args){
            //Create a program using arrays that sortes a list of integers in descending order.
            //Descending order is highest value to lowest.
            //In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
            //Ultimately have an array with 106, 81, 26, 15, 5 in it.
            //Set up the program so that the numbers to sort are read from the keyboard.
            //Implement the following methods - getIntegers, printArray, and sortIntegers
            //getIntegers returns an array of entered integers from keyboard

            //printArray print ut the contents of the array
            //and sortIntegers should sort the array and return a new array containing the sorted numbers
            //you will have to figure out how to copy the array elements from the passed array into a new
            //array adn sort them and return the new sorted array.
            int[] myIntegers = getIntegers(5);
            int[] sorted = sortIntegers(myIntegers);
            printArray(sorted);

        }

        //getIntegers returns an array of entered integers from keyboard
        public static int[] getIntegers(int capacity){

            int[] array = new int[capacity];
            System.out.println("Enter " + capacity + " integer values:\r");
            for (int i = 0; i < array.length; i++){
                array[i] = scanner.nextInt();
            }
            return array;
        }
        //printArray print ut the contents of the array
        public static void printArray(int[] array){
            for (int i = 0; i < array.length; i++){
                System.out.println("Element " + i + " contents " + array[i]);
            }
        }

        //sortIntegers should sort the array and return a new array containing the sorted numbers
        public static int[] sortIntegers(int[] array){
            int[] SortedArray = new int[array.length];
            for (int i = 0; i < array.length; i++){
                SortedArray[i] = array[i];              //We just Copied the integers of an array to another array
            }
            boolean flag = true;
            int temp;
            while(flag){
                flag = false;
                for (int i = 0; i < SortedArray.length-1; i++){
                    if(SortedArray[i] < SortedArray[i+1]) {
                        temp = SortedArray [i];
                        SortedArray[i] = SortedArray[i+1];
                        SortedArray[i+1] = temp;
                        flag = true;
                    }
                }
            }
            return SortedArray;
        }
    }
