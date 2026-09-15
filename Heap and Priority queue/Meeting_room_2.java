import java.util.Arrays;
import java.util.PriorityQueue;

public class Meeting_room_2 {
    public static void main(String[] args) {
        int[][] intervals = {{9,30}, {5,10}, {15,20}, {6,9}, {2,6}, {3,5}};
        System.out.println(Meeting_Room(intervals));
    }

    public static int Meeting_Room(int[][] intervals){
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1]-b[1]);
        pq.add(intervals[0]);
        for(int i =1; i < intervals.length; i++){
            if(intervals[i][0] >= pq.peek()[1]){
                pq.poll();
            }
            pq.add(intervals[i]);
        }
        return pq.size();
    }
}
