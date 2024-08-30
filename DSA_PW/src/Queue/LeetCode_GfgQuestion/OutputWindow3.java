package Queue.LeetCode_GfgQuestion;

import java.util.LinkedList;
import java.util.Queue;

public class OutputWindow3 {
    public static long[] printFirstNegativeInteger(long[] A, int N, int K){
        long [] res=new long[N-K+1];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<N;i++){
            if(A[i]<0){
                q.add(i);
            }

        }
        for(int i=0;i<N-K+1;i++){
            if(q.size()>0 && q.peek()<i) q.remove();
            if(q.size()>0 && q.peek()<=i+K-1){
                res[i]=A[q.peek()];
            }
            else if(q.size()==0) res[i]=0;
            else res[i]=0;
        }
        System.out.println(res.length);

        return res;
    }

    public static void main(String[] args) {


        OutputWindow3 ow3= new OutputWindow3();
        long [] array={-1,-1,-7,-15,-15};
        int size= array.length;
        int windowSize=3;
     long[] result = ow3.printFirstNegativeInteger(array,size,windowSize);
        System.out.println(result);

        for(int i=0;i<result.length;i++){
            System.out.print(array[i]+" ");
        }


    }
}
