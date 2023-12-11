## HashMap to Store Occurrences:

- The code creates a HashMap<Integer, Integer> named occurrencesMap to store the occurrences of each number.
- The key in the HashMap represents a unique number from the array, and the corresponding value represents the count of occurrences of that number.

## Iterating Through the Array:

- The code uses a for-each loop to iterate through each element in the array.
- For each number in the array, it checks whether the number is already present in the HashMap.

## Updating Occurrences in HashMap:

- If the number is already in the HashMap (occurrencesMap.containsKey(num)), the code increments the count by 1 (occurrencesMap.put(num, occurrencesMap.get(num) + 1)).
- If the number is not in the HashMap, it adds the number to the HashMap with an initial count of 1.

## Printing Results:

- After processing the entire array, the code uses another for-each loop to iterate over the keys of the HashMap.
- For each key (number) in the HashMap, it prints the number and its corresponding count of occurrences.
## Output:

- The final output is a list of numbers along with the count of their occurrences in the given array.
