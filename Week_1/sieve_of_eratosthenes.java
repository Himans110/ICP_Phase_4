class Solution {
    public int[] sieve(int n) {
        List<Integer> l = new ArrayList<>();
        if(n == 1) return new int[]{};
        for(int i = 2 ; i <= n ; i++){
            if(is_prime(i)) l.add(i);
        }
        int ans[] = new int[l.size()];
        int i = 0;
        for(int a : l){
            ans[i++] = a;
        }
        return ans;
    }
    public boolean is_prime(int n){
        for(int i = 2 ; i*i <= n ; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
// TC -> O(n √n)
