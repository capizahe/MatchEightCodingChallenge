# MatchEightCodingChallenge

## Task
The task is to write a function that finds pairs of integers from a list that
sum to a given value. The function will take as input the list of numbers as
well as the target sum.


## Test Application: 

  javac MatchEightCodingChallengeApplication.class
  java MatchEightCodingChallengeApplication 1,3,9 12
  

This algorithm it is O(n) due the first iteration of the array. The rest of validations are 0(1) due to the hashmap implementation. 

This algorithm will add all of the values from the list into a hashmap and will calculate the difference required to match the ValueToSearch. i.e please review the below example:

List: [1, 3, 9]  ValueToSearch: 10

HashMap: [1 , 3, 9]

Iteration:
  1*:
    differenceNeeded = 9 //ValueToSearch - 1
    if HashMap has 9
      then print 1,9
  3*
    differenceNeeded = 7
    if HashMap has 7
  4*      
    differenceNeeded = 1
      if HashMap has 1
        then print 1,9 (In this case the value will not be printed as this pair has already been printed)
    
  
