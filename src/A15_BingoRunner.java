public class A15_BingoRunner {

    public static void main(String[] args)
    {
        A15_Bingo card = new A15_Bingo();

        card.instructions();

        card.header();
        card.sideLine();
        card.sideLine();
        card.middleLine();
        card.sideLine();
        card.sideLine();
    }
}
