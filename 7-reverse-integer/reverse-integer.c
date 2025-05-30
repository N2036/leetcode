int reverse(int x){
    long rev=0,rem;
    while(x!=0)
    {
        rem=x%10;
        rev=(rev*10)+rem;
        x/=10;
    }
    if(INT_MAX<rev || rev<INT_MIN)
    {
        return 0;
    }
    return rev;
}