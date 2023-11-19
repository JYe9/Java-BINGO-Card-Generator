

public class A15_Bingo {
    private double value;

    public void instructions()
    {
        System.out.println("BINGO Card Generator");
        System.out.println("Refresh the console to get a new BINGO card.\n");
    }

    public void numberGenerator(double min, double max)
    {
        value = (double)((Math.random()*(max-min) + min));
        System.out.printf("%7.0f", value);
    }

    public void header()
    {
        System.out.print("      B       I      N      G      O");
    }

    public void sideLine()
    {
        System.out.println("\n");
        numberGenerator(1, 15);
        numberGenerator(16, 30);
        numberGenerator(31, 45);
        numberGenerator(46, 60);
        numberGenerator(61, 75);
    }

    public void middleLine()
    {
        System.out.println("\n");
        numberGenerator(1, 15);
        numberGenerator(16, 30);
        System.out.print("    FREE");
        numberGenerator(46, 50);
        numberGenerator(61, 75);
    }
}
