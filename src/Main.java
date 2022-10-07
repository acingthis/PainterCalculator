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

        System.out.println("The amount of cans used is: " + CansUsed);
        
    }
}