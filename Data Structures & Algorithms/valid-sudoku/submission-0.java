class Solution {
    public boolean isValidSudoku(char[][] board) {
        // 1. Every box should contain the digits 1-9
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
               if(board[i][j] != '.' && board[i][j] != '1' &&  board[i][j] != '2' && board[i][j] != '3'  &&  board[i][j] != '4'  && board[i][j] != '5' &&  board[i][j] != '6' && board[i][j] != '7' && board[i][j] != '8' &&  board[i][j] != '9'){
                return false;
               }
            }
        }

        // 2. Check for Duplicates in row
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] == '.') continue;
                if(set.contains(board[i][j])){
                        return false;
                }
                set.add(board[i][j]);  
            }
            set.clear();
        }
        set.clear();
        
        // 3. Check for Duplicates in column
        
        for(int j=0;j<9;j++){
            for(int i=0;i<9;i++){
                if(board[i][j] == '.') continue;
                if(set.contains(board[i][j])){
                        return false;
                }
                set.add(board[i][j]);  
            }
            set.clear();
        }
        set.clear();

        // 4. For each of the 3*3 subboxes check for Duplicates
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
               set.clear();
               for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        if(board[i][j] == '.') continue;
                        if (set.contains(board[i][j])) {
                            return false;
                        }
                        set.add(board[i][j]);
                    }
                }
            }
        }

        return true;

    }


}
