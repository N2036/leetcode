int tribonacci(int n) {
    if(n==0) return 0;
    if(n==1) return 1;
    if(n==2) return 1;
    long long a=0,b=1,c=1,d;
    for(int i=3;i<=n;i++){
         d=a+b+c;
        a=b;
        b=c;
        c=d;
    }
    return (int)d;
}