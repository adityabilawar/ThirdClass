public class ThirdClass {

    public static void main(String args[]) {
        //Part A
        int numofapples = 3;
        int numoforanges = 5;
//        System.out.println("Today's shopping list:");
//        System.out.println(numofapples + " apples");
//        System.out.println(numoforanges + " oranges");

        //Part B
        double priceofapples = 0.22;
        double priceoforanges = 0.35;
        System.out.println("Today's shopping list:");
        System.out.println(numofapples + " apples cost a total of\t" + "$" + priceofapples * numofapples);
        System.out.println(numoforanges + " oranges cost a total of\t" + "$" + priceoforanges * numoforanges);

        //Extension
        double totalbill = (priceofapples * numofapples) + (priceoforanges * numoforanges);
        System.out.println("\t\t\t\t\t\t\t-----\nTotal Price:\t\t\t\t" + "$" + totalbill);
    }
}