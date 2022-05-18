class Solution {
    int tri(int n,int []tri){
        if(tri[n]!=0 || n==0) return tri[n];
        return tri[n]=tri(n-1,tri)+tri(n-2,tri)+tri(n-3,tri);
    }
    public int tribonacci(int n) {
        if(n==0) return 0;
        else if(n==1 || n==2) return 1;
        int []tri = new int[n+1];
        tri[1]=1;
        tri[2]=1;
        return tri(n,tri);
    }
}
