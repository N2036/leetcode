int averageValue(int* nums, int numsSize) {
    int sum=0,c=0;
    for (int i=0;i<numsSize;i++){
        if (nums[i]%2==0 && nums[i]%3==0){
            c++;
            sum=sum+nums[i];
        }
    }if (c==0){
        return 0;
    }else{
        return sum/c;
    }return 0;
}