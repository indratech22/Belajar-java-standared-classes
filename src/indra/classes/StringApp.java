package indra.classes;

public class StringApp {
    public static void main(String[] args) {

        String name = "Indra Wijaya";
        String nameLowercase = name.toLowerCase();
        String nameUppercase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowercase);
        System.out.println(nameUppercase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Indra"));
        System.out.println(name.endsWith("Wijaya"));

        String[] names = name.split(" ");
       for(var value : names){
           System.out.println(value);
       }

        System.out.println(name.charAt(0));

    }
}
