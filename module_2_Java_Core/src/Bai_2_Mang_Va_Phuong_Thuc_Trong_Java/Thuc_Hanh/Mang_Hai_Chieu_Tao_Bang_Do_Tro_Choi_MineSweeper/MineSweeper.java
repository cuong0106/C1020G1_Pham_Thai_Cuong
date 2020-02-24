package Bai_2_Mang_Va_Phuong_Thuc_Trong_Java.Thuc_Hanh.Mang_Hai_Chieu_Tao_Bang_Do_Tro_Choi_MineSweeper;
//chưa hiểu

public class MineSweeper {
    public static void main(String[] args) {
        String[][] map = {
                {"*", ".", "*", ".", "."},
                {".", "*", ".", ".", "."}
        };
        final int cao = map.length;
        final int rong = map[0].length;

        String[][] mapReport = new String[cao][rong];

        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[0].length; x++) {
                //String curentCell = map[yOrdinate][xOrdinate];
                if (map[y][x].equals("*")) {
                    mapReport[y][x] = "*";
                } else {
                    final int[][] NEIGHBOURS_ORDINATE = {
                            {y - 1, x - 1}, {y - 1, x}, {y - 1, x + 1},
                            {y, x - 1}, {y, x + 1},
                            {y + 1, x - 1}, {y + 1, x}, {y + 1, x + 1},
                    };

                    int minesAround = 0;
                    for (int i = 0; i < NEIGHBOURS_ORDINATE.length; i++) {
                        int[] neighbourOrdinate = NEIGHBOURS_ORDINATE[i];
                        int xOrdinateOfNeighbour = neighbourOrdinate[1];
                        int yOrdinateOfNeighbour = neighbourOrdinate[0];

                        boolean isOutOfMapNeighbour = xOrdinateOfNeighbour < 0
                                || xOrdinateOfNeighbour == rong
                                || yOrdinateOfNeighbour < 0
                                || yOrdinateOfNeighbour == cao;
                        if (isOutOfMapNeighbour) continue;

                        boolean isMineOwnerNeighbour = map[yOrdinateOfNeighbour][xOrdinateOfNeighbour].equals("*");
                        if (isMineOwnerNeighbour) minesAround++;
                    }

                    mapReport[y][x] = String.valueOf(minesAround);
                }
            }
        }

        for (int yOrdinate = 0; yOrdinate < cao; yOrdinate++) {
            for (int xOrdinate = 0; xOrdinate < rong; xOrdinate++) {
                String currentCellReport = mapReport[yOrdinate][xOrdinate];
                System.out.print(currentCellReport);
            }
            System.out.println("");
        }


    }
}
