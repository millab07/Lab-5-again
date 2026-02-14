public class Lab5 {
// Calling each rug method and printing it using weave()

    public static void main(String[] args) {

        weave(solid("🟥"));
        weave(horizontal("🟦", "⬜"));
        weave(vertical("🟩", "⬜"));
        weave(diagonal("🟨", "⬛"));
        weave(plaid("🟪", "⬜"));

    }

    // This method prints an array in a square format.
    public static void weave(String[][] rug) {
        for (int r = 0; r < rug.length; r++) {
            for (int c = 0; c < rug[r].length; c++) {
                System.out.print(rug[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static String[][] solid(String emoji) {
    // Every square in the rug is the same emoji
    String[][] rug = new String[11][11];

    for (int r = 0; r < 11; r++) {
        for (int c = 0; c < 11; c++) {
            rug[r][c] = emoji;
        }
    }
    return rug;
}
public static String[][] horizontal(String emoji1, String emoji2) {
    // Rows alternate between two emojis
    String[][] rug = new String[11][11];

    for (int r = 0; r < 11; r++) {
        for (int c = 0; c < 11; c++) {
            if (r % 2 == 0)
                rug[r][c] = emoji1;// If the row number is even, use emoji1
            else
                rug[r][c] = emoji2; // If the row number is odd, use emoji2
        }
    }
    return rug;
}
public static String[][] vertical(String emoji1, String emoji2) {
    // Columns alternate between two emojis
    String[][] rug = new String[11][11];

    for (int r = 0; r < 11; r++) {
        for (int c = 0; c < 11; c++) {
            if (c % 2 == 0)
                rug[r][c] = emoji1; // If the column number is even, use emoji1
            else
                rug[r][c] = emoji2;// If the column number is odd, use emoji2
        }
    }
    return rug;
}
public static String[][] diagonal(String emoji1, String emoji2) {
    String[][] rug = new String[11][11];

    for (int r = 0; r < 11; r++) {
        for (int c = 0; c < 11; c++) {
            // If row number equals column number it is on the main diagonal
            
            if (r == c)
                rug[r][c] = emoji1;
            else
                rug[r][c] = emoji2;// Everything else is the background emoji
        }
    }
    return rug;
}
public static String[][] plaid(String emoji1, String emoji2) {
    String[][] rug = new String[11][11];

    for (int r = 0; r < 11; r++) {
        for (int c = 0; c < 11; c++) {
             // If the row OR column is divisible by 3 make a stripe
            if (r % 3 == 0 || c % 3 == 0)
                rug[r][c] = emoji1;
            else
                rug[r][c] = emoji2; // Otherwise fill with background emoji
        }
    }
    return rug;
}
}
