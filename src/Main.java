public class Main {
    public static void main(String[] args) {
        String name="Nokwanda";
        String greeting="Hello";
        String hey=greeting.substring(0,3)+"p!";
        String repeated="Kwando ".repeat(3);
        String all=String.join("/",name,hey);
//        System.out.println(all);
//        System.out.print(greeting+" "+repeated);

        StringBuilder builder=new StringBuilder();
        builder.append("hey");
        System.out.println(builder);

    }
}