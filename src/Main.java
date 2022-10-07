import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        double CanSize = 20;

        double RoomHeight;
        double RoomWidth;
        double RoomLength;

        //Scanner
        Scanner Scan = new Scanner(System.in);

        do {
            System.out.println("what is the height of the room?");
            System.out.print("> ");
            RoomHeight = Double.parseDouble(Scan.nextLine());
        }
        while (RoomHeight == 0);
        do {
            System.out.println("what is the width of the room?");
            System.out.print("> ");
            RoomWidth = Double.parseDouble(Scan.nextLine());
        }
        while (RoomWidth == 0);
        do {
            System.out.println("what is the length of the room?");
            System.out.print("> ");
            RoomLength = Double.parseDouble(Scan.nextLine());
        }
        while (RoomLength == 0);

        //Calculations

        double PaintUsed = (RoomHeight * RoomWidth) * 2;
        PaintUsed = PaintUsed + (RoomHeight * RoomLength) * 2;
        System.out.println("The amount of paint used is: " + PaintUsed + "m");

        int CansUsed = (int) (PaintUsed / CanSize) + 1;
        System.out.println("The amount of cans used is: " + CansUsed + " cans");


        //type of paint and cost

        String TypeOfPaint = "";
        System.out.println("What kind of paint do you want to use?");
        System.out.print("> ");
        TypeOfPaint = Scan.nextLine();

        double CostOfPaint = switch (TypeOfPaint) {
            case "Best" -> 1000;
            case "primer","Primer" -> 20.99;
            case "emulsion","Emulsion" -> 10.45;
            case "oil","Oil" -> 40.25;
            default -> 25;
        };
        double CostOfPainting = CostOfPaint * CansUsed;

        if (CostOfPaint == 25)
        {
            System.out.println("The paint type was unknown so the average was used £25f");
        }

        for (int x = 0; x < 5;x++)
        {
            System.out.println("MONEY");
        }

        System.out.println("The Cost of Paint is: £" + CostOfPainting);
    }
}