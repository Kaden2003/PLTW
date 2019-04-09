public class checkerBoard {
    public static void main(String[] args) {
        String[][] checkerBoard = new String[8][8];

        for (int i = 0; i < checkerBoard.length; i++) {
            int countWhite = 0;
            int count = 0;
//            if (i % 2 == 0) {
//                System.out.print(" B ");
//            }

            for (int j = 0; j < checkerBoard.length; j++) {
                count++;
                if ((j % 2) == (i % 2)) {
                    if (countWhite >= 6){
                        System.out.print(" WC ");
                    }
                    else
                    System.out.print(" W ");

                } else if ((j % 2) != (i % 2)){
                        if (countWhite <= 1){
                            System.out.print(" BC ");
                        } else
                            System.out.print(" B ");
                        }


                }
            countWhite++;
                    if (count == 8) {
                        System.out.println(" ");
                    }

                }
            }
        }
// int oddRow = i % 2;
//            for (int j = 0; j < checkerBoard[0].length; j++) {
//                int oddColumn = j % 2;
//
//                // Assign "BLACK" or "WHITE" to the appropriate squares
//
//            }


        // Print out the board as 8 rows with either null,
        // "BLACK", or "WHITE" in each element
        // Hint: use both the println and print methods
        // of System.out






