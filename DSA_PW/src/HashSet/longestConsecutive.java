package HashSet;


import java.util.HashSet;

//time complexity  O(n)
public class longestConsecutive {
    public static int longestConsectiveNum(int[] nums){
        HashSet<Integer> hs=new HashSet<>();
        for(int num: nums) hs.add(num);

        int maxStreak=0;
        for(int num:hs){
            if(!hs.contains(num-1)){ //num is starting point of a sequence
                int currNum=num;
                int currStreak=1; // length of current consecutive sequence
                while (hs.contains(currNum+1)){
                    currNum++;
                    currStreak++;
                }
                maxStreak=Math.max(maxStreak,currStreak);
            }
        }
        return maxStreak;

    }

    public static void main(String[] args) {
        int [] nums={100,99,1,4,200,1,2,2,3};
        int Result = longestConsectiveNum(nums);
        System.out.println(Result);
    }
}
