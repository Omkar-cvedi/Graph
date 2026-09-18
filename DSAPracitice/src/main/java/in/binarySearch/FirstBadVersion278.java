package in.binarySearch;

public class FirstBadVersion278 {
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        int bad = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                bad = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        return bad;
    }
    public boolean isBadVersion(int bad){
        if(bad==4) return true;
        return false;
    }
}
