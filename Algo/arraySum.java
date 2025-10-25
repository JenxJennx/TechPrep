class solution {
    public:
        vector<int> arraySum(vector<int>& arr){
            for(int i=1; i < nums.size(); i++){ //make sure to start at one because you will get a run time error trying to add from a non-existent index 0
                nums[i]=nums[i]+nums[i-1];
            }
            return nums;

    }
}
