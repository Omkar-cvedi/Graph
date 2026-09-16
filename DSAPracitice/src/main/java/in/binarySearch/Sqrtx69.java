package in.binarySearch;

public class Sqrtx69 {
    public int mySqrt(int x) {
        if(x<=1) return x;
        int low = 0;
        int high = x/2;
        while(low<=high){
            int mid = low+(high-low)/2;
            long square = (long) mid * mid;
            long nextSquare = (long) (mid + 1) * (mid + 1);
            if(square <= x && nextSquare > x) return mid;
            else if(square<x) low=mid+1;
            else high = mid-1;
        }
        return -1;
    }
}
