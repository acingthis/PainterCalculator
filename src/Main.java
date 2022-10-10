import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        double CanSize = 20;

        double RoomHeight = 0;
        double RoomWidth = 0;
        double RoomLength = 0;

        //Scanner
        Scanner Scan = new Scanner(System.in);

        do
        {
            System.out.println("what is the height of the room? (meters)");
            System.out.print("> ");
            RoomHeight = Double.parseDouble(Scan.nextLine());
        }
        while (RoomHeight == 0);

        do
        {
            System.out.println("what is the width of the room? (meters)");
            System.out.print("> ");
            RoomWidth = Double.parseDouble(Scan.nextLine());
        }
        while (RoomWidth == 0);

        do
        {
            System.out.println("what is the length of the room? (meters)");
            System.out.print("> ");
            RoomLength = Double.parseDouble(Scan.nextLine());
        }
        while (RoomLength == 0);


        //Calculations (full surface area)

        double PaintUsed = (RoomHeight * RoomWidth) * 2;
        PaintUsed = PaintUsed + (RoomHeight * RoomLength) * 2;


        //Wall objects

        System.out.println("Are there any wall Obstructions?");
        System.out.print("> ");
        String Obstruction = Scan.nextLine();
        Obstruction = Obstruction.toLowerCase();

        while (Obstruction.equals("yes"))
        {
            double[] ObstructionSize = new double[2];

            System.out.println("What is the height of the wall Obstruction?");
            System.out.print("> ");
            ObstructionSize[0] = Double.parseDouble(Scan.nextLine());

            System.out.println("What is the Width of the wall Obstruction?");
            System.out.print("> ");
            ObstructionSize[1] = Double.parseDouble(Scan.nextLine());

            PaintUsed = PaintUsed - (ObstructionSize[0] * ObstructionSize[1]);

            System.out.println("Are there any more wall Obstructions?");
            System.out.print("> ");
            Obstruction = Scan.nextLine();
            Obstruction = Obstruction.toLowerCase();
        }


        //Prints

        System.out.println("The amount of paint used is: " + PaintUsed + "m");
        int CansUsed = (int) (PaintUsed / CanSize) + 1;
        System.out.println("The amount of cans used is: " + CansUsed + " cans");


        //type of paint and cost

        String TypeOfPaint = "";
        System.out.println("What kind of paint do you want to use?");
        System.out.print("> ");
        TypeOfPaint = Scan.nextLine();
        TypeOfPaint = TypeOfPaint.toLowerCase();

        double CostOfPaint = switch (TypeOfPaint) {
            case "Best" -> 1000;
            case "primer" -> 20.99;
            case "emulsion" -> 10.45;
            case "oil" -> 40.25;
            default -> 25;
        };
        double CostOfPainting = CostOfPaint * CansUsed;

        if (CostOfPaint == 25)
        {
            System.out.println("The paint type was unknown so the average was used £25f");
        }

        if (TypeOfPaint.equals("best"))
        {
            for (int x = 0; x < 5; x++)
            {
                System.out.println("MONEY");
            }
        }

        System.out.println("The Cost of Paint is: £" + CostOfPainting);
    }
}