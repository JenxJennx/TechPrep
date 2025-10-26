class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        for(int i = 0; i < accounts.length; i++){
            int total = 0;
            for(int j = 0; j < accounts[i].length; j++)
            {
                total = accounts[i][j] + total;
            }
            if(sum<=total){
                sum = total;
            }

        }
        return sum;
    }
}
//Cleaner version with for each loops:
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int[] customer : accounts){
            int currMaxWealth = 0;
            for(int bankBalance : customer){
                currMaxWealth += bankBalance;
            }
            maxWealth = Math.max(maxWealth, currMaxWealth);
        }
        return maxWealth;
    }
}
//For each loop is in version 1.5 and above of Java, it allows you to iterate through
//arrays and collections without having to use an index variable.
 //It makes the code cleaner and easier to read.
 //In this case, we are iterating through each customer in the accounts array and
 //then through each bank balance for that customer to calculate their total wealth.
 // We then compare it with the maximum wealth found so far and update it if necessary.
