//Yvan Wang
public class Receipt{
    public static void main(String[]args){
        String item1 = "牛奶";
        double price1 = 9.89;
        
        String item2 = "薯片";
        double price2 = 7.3;

        String item3 = "冰淇淋";
        double price3 = 4.5;
        
        double total = price1 + price2 + price3;

        System.out.println("+----------------------+");
        System.out.println("|        我的账单      |");
        System.out.println("+----------------------+");
        System.out.println("| " + item1 + "           ¥" + price1 + " |");
        System.out.println("| " + item2 + "            ¥" + price2 + " |");
        System.out.println("| " + item3 + "          ¥" + price3 + " |");
        System.out.println("+----------------------+");
        System.out.println("| Total:        ¥" + total + " |");
        System.out.println("+----------------------+");
    }
}