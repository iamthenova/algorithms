package com.icenova.algorithms;

import java.util.HashSet;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        var isValidRow = true;
        var isValidColumn = true;
        var isValidBox = true;

        // check rows
        for (int i = 0; i < 9; i++) {
            var characters = new HashSet<Character>();
            for (int j = 0; j < 9; j++) {
                var c = board[i][j];
                if (c == '.') {
                    continue;
                }

                if (characters.contains(c)) {
                    isValidRow = false;
                    break;
                } else {
                    characters.add(c);
                }
            }

            if (!isValidRow) {
                break;
            }
        }

        // check columns
        for (int i = 0; i < 9; i++) {
            var characters = new HashSet<Character>();
            for (int j = 0; j < 9; j++) {
                var c = board[j][i];
                if (c == '.') {
                    continue;
                }

                if (characters.contains(c)) {
                    isValidColumn = false;
                    break;
                } else {
                    characters.add(c);
                }
            }

            if (!isValidColumn) {
                break;
            }
        }

        // check boxes
        var rowStart = 0;
        var rowEnd = 3;
        var colStart = 0;
        var colEnd = 3;
        while (isValidBox && rowEnd <= 9) {
            var characters = new HashSet<Character>();
            for (int i = rowStart; i < rowEnd; i++) {
                for (int j = colStart; j < colEnd; j++) {
                    var c = board[i][j];
                    if (c == '.') {
                        continue;
                    }

                    if (characters.contains(c)) {
                        isValidBox = false;
                        break;
                    } else {
                        characters.add(c);
                    }
                }

                if (!isValidBox) {
                    break;
                }
            }

            if (colEnd < 9) {
                colStart += 3;
                colEnd += 3;
            } else {
                rowStart += 3;
                rowEnd += 3;
                colStart = 0;
                colEnd = 3;
            }
        }

        return isValidRow && isValidColumn && isValidBox;
    }
}
