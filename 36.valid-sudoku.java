/*
 * @lc app=leetcode id=36 lang=java
 *
 * [36] Valid Sudoku
 */

// @lc code=start

import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] colms = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        // initialize all the hashsets before looping through board
        for (int i = 0; i < board.length; i++) {
            rows[i] = new HashSet<>();
            colms[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '.') {
                    continue;
                }

                // add to rows if not present
                if (rows[i].contains(board[i][j])) {
                    return false;
                }
                rows[i].add(board[i][j]);

                // add to columns if not present
                if (colms[j].contains(board[i][j])) {
                    return false;
                }
                colms[j].add(board[i][j]);

                // boxes logic
                int boxIndex = (i / 3) * 3 + (j / 3);
                if (boxes[boxIndex].contains(board[i][j])) {
                    return false;
                }
                boxes[boxIndex].add(board[i][j]);
            }
        }


        return true;
    }
}
// @lc code=end

