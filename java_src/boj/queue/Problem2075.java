package boj.queue;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;

public class Problem2075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 1. 최소 힙(Min-Heap) 생성
        // (o1 - o2)가 음수면 o1이 작다는 뜻 -> 작은 게 우선순위가 높음
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 1 (양수),기존원소 > num -> num 의 우선 순위가 더 높으니 위로 올려보내기
                // 0,기존원소 == num -> 동일하기 때문에 위치 변경 필요 없음
                // -1 (음수),기존원소 < num -> 이미 queue에 들어있는 값이 더 작음=기존 원소가 우선순위가 더 높으니 num은 그냥 둔다
                return o1 - o2;
            }
        });

        // 2. N * N 개의 숫자를 하나씩 처리
        for (int i = 0; i < N * N; i++) {
            int num = sc.nextInt();
            pq.offer(num); // 큐에 삽입

            // 3. 큐의 크기가 N을 초과하면 가장 작은 요소 제거
            if (pq.size() > N) {
                pq.poll();
            }
        }

        // 4. 모든 숫자를 다 봤을 때 큐의 맨 위(가장 작은 값)가 N번째로 큰 수임
        System.out.println(pq.peek());
    }
}