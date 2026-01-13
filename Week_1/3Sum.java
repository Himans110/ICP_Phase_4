import java.util.*;
public class Main{
  public static void Main{ Strings []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++){
      arr[i] = sc.nextInt();
    }
    List<List<Integer> ans = threeSum(arr);
    System.out.println(ans.toString());
  }
  public List<List<Integer>> threeSum(int[] nums) {
      Arrays.sort(nums);
      int n = nums.length;
      List<List<Integer>> res = new ArrayList<>();
      for (int i = 0; i < n - 2; i++) {
          if(i  > 0 && nums[i]==nums[i-1]) continue;
          int lo = i+1 , hi = n-1;
          while(lo < hi){
              int sum = nums[i]+nums[lo]+nums[hi];
              if(sum == 0){
                  res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                  while (lo < hi && nums[lo] == nums[lo + 1]) lo++;
                  while (lo < hi && nums[hi] == nums[hi - 1]) hi--;
                  lo++;
                  hi--;
              }
              else if(sum < 0){
                  lo++;
              }
              else{
                  hi--;
              }
          }
      }
      return res;
    }
  }
  // O(n^2)
