class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(n);
        for(int nums = 1; nums < n+1; nums++){
            if(nums % 3 == 0 && nums % 5 == 0){
                answer.add("FizzBuzz");
            }
            else if(nums % 3 == 0){
                answer.add("Fizz");
            }
            else if(nums % 5 == 0){
                answer.add("Buzz");
            }
            else{
                answer.add(Integer.toString(nums));
            }
        }
        return answer;
    }
}

//Cleaner version using Boolean variables to check divisibility:
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(n);

        for(int i = 1; i<n+1; i++){
            Boolean divisibleBy3 = i%3==0;
            Boolean divisibleBy5 = i%5==0;

            if(divisibleBy3 && divisibleBy5){
                answer.add("FizzBuzz");
            }
            else if(divisibleBy3){
                answer.add("Fizz");
            }
            else if(divisibleBy5){
                answer.add("Buzz");
            }
            else{
                answer.add(String.valueOf(i));
            }
        }
        return answer;
    }
}
