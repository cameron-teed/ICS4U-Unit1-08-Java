/*
* The max min program generates random numbers from user inputted parameters
* and stores them in an an array before outputting them.
*
* @author  Cameron Teed
* @version 1.0
* @since   2021-04-30
* Class MaxMin.
*/

final class MaxMin {

  private MaxMin() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
  }

  /**
  * The max number for counter.
  */
  public static final int TEN = 10;
  /**
  * The parameter for the random number.
  */
  public static final int MAXNUM = 99;

  /**
  * Function finds the min number in an array.
  *
  * @param numArray
  * @return currentMin
  */
  static int minFinder(final int[] numArray) {

    // Sets the min to the first in the array
    int currentMin = numArray[0];

    // calculates the min by comparing them with eachother
    for (int counter = 0; counter < TEN; counter++) {
      if (numArray[counter] < currentMin) {
        currentMin = numArray[counter];
      }
    }
    return currentMin;
  }

  /**
  * Function finds the max number in an array.
  *
  * @param numArray
  * @return currentMax
  */
  static int maxFinder(final int[] numArray) {

    // Sets the min to the first in the array
    int currentMax = numArray[0];

    // calculates the max by comparing them with eachother
    for (int counter = 0; counter < TEN; counter++) {
      if (numArray[counter] > currentMax) {
        currentMax = numArray[counter];
      }
    }
    return currentMax;
  }

  /**
  * Creates the array of random numbers and prints them as well as the
  * generated random numbers.
  *
  * @param args
  */
  public static void main(final String[] args) {

    // defines list of random numbers
    int[] numArray = new int[TEN];

    // generates random numbers and places them in the array
    for (int counter = 0; counter < TEN; counter++) {
      numArray[counter] = (int) (Math.random() * MAXNUM + 1);
    }

    // Calls maxNum function and minNum function to find max and min values
    int min = minFinder(numArray);
    int max = maxFinder(numArray);

    // Outputing the rolled number.
    for (int counter = 0; counter < TEN; counter++) {
      System.out.println(numArray[counter]);
    }

    // Outputing the max and min numbers.
    System.out.println();
    System.out.println("Max number: " + max);
    System.out.println("Min number: " + min);
    System.out.println();
    System.out.println("Done");
  }
}
