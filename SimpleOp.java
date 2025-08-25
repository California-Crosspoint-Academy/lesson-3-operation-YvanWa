//Yvan Wang
public class SimpleOp{
    public static void main(String[]args){
        String nation="people's republic of China";
        System.out.println(nation.toUpperCase());
        double age = 75.9;
        String k = " is " + age + " years old.";
        String name = nation.substring(21);
        System.out.println(name + k );
        System.out.println("It has a name called "+ name.toLowerCase()+" and it is really famous among the world.");


    }
}