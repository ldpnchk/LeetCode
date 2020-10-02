package com.leetcode.easy.valid_sudoku;

import java.util.HashSet;
import java.util.Set;

/**
 * Valid Sudoku
 *
 * Determine if a 9x9 Sudoku board is valid.
 * Only the filled cells need to be validated according to the following rules:
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 *
 * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 *
 * Note:
 * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * Only the filled cells need to be validated according to the mentioned rules.
 * The given board contain only digits 1-9 and the character '.'.
 * The given board size is always 9x9.
 */

public class Solution {

    public boolean isValidSudoku(char[][] board) {
        return checkRows(board) && checkCols(board) && checkBoxes(board);
    }

    private boolean checkRows(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> rowCharacters = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (rowCharacters.contains(board[i][j])) {
                        return false;
                    }
                    rowCharacters.add(board[i][j]);
                }
            }
        }

        return true;
    }

    private boolean checkCols(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> colCharacters = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    if (colCharacters.contains(board[j][i])) {
                        return false;
                    }
                    colCharacters.add(board[j][i]);
                }
            }
        }

        return true;
    }

    private boolean checkBoxes(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Set<Character> boxCharacters = new HashSet<>();
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (board[i * 3 + k][j * 3 + l] != '.') {
                            if (boxCharacters.contains(board[i * 3 + k][j * 3 + l])) {
                                return false;
                            }
                            boxCharacters.add(board[i * 3 + k][j * 3 + l]);
                        }
                    }
                }
            }
        }

        return true;
    }

}
