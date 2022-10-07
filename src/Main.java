import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        double CanSize = 20;

        double RoomHeight = 8.2;
        double RoomWidth = 17.9;
        double RoomLength = 7.7;

        double PaintUsed = (RoomHeight * RoomWidth) * 2;
        PaintUsed = PaintUsed + (RoomHeight * RoomLength) * 2;

        System.out.println("The amount of paint used is: " + PaintUsed + "m");

        int CansUsed = (int) (PaintUsed / CanSize) + 1;

        System.out.println("The amount of cans used is: " + CansUsed + " cans");


        //type of paint and cost

        String TypeOfPaint = "";
        //Scanner
        Scanner Scan = new Scanner(System.in);
        System.out.println("What kind of paint do you want to use?");
        System.out.print("> ");
        TypeOfPaint = Scan.nextLine();

        double CostOfPaint = switch (TypeOfPaint) {
            case "primer","Primer" -> 20.99;
            case "emulsion","Emulsion" -> 10.45;
            case "oil","Oil" -> 30.25;
            default -> 25;
        };
        double CostOfPainting = CostOfPaint * CansUsed;

        System.out.println("The Cost of Paint is: £" + CostOfPainting);
    }
}