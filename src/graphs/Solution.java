package graphs;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

class Solution {
    Map<String, Integer> map = new HashMap<>();
    int[][] arr = new int[4][5];
    List<Queue> list = new ArrayList();
    public int numIslands(char[][] grid) {
        Arrays.fill(arr,0);

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                if (grid[i][j] == 1 && map.get(new Vertix(i, j).toString()) == null) {
                    map.put(new Vertix(i, j).toString(), i);
                    getAllEdges(grid, i, j);
                }
            }
        }
        return list.size();
    }

    public void getAllEdges(char[][] grid, int i, int j) {
        Queue<Vertix> queue = new LinkedBlockingQueue();
        list.add(queue);
        queue.add(new Vertix(i, j));
        while (!queue.isEmpty()) {
            Vertix vertix = queue.poll();
            //System.out.println(vertix);
            getAdjecent(grid, vertix.getX() - 1, vertix.getY(), queue);
            getAdjecent(grid, vertix.getX() + 1, vertix.getY(), queue);
            getAdjecent(grid, vertix.getX(), vertix.getY() - 1, queue);
            getAdjecent(grid, vertix.getX(), vertix.getY() + 1, queue);
        }
    }

    public void getAdjecent(char[][] grid, int i, int j, Queue queue) {

        if ((i >= 0 && j >= 0) && (i < grid.length && j < grid[i].length)) {
            if (grid[i][j] == 1) {
                if (map.get(new Vertix(i, j).toString()) == null) {
                    queue.add(new Vertix(i, j));
                }
                map.put(new Vertix(i, j).toString(), i);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        char[][] grid = {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 1}
        };
        int count = s.numIslands(grid);
        System.out.println(count);
    }

    class Vertix {
        int x;
        int y;

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        Vertix(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int hashCode() {

           return (int) Math.random();

        }

        @Override
        public boolean equals(Object object) {
            Vertix vertix = (Vertix) object;
            if (this.x == vertix.x && this.y == vertix.y) {
                return true;
            }
            return false;
        }

        @Override
        public String toString() {
            return "" + x + "-" + y;
        }
    }
}