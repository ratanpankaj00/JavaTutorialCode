public class Strings {
    public static void main(String[] args) {
        String a1 = new String("Harry"); //second method to form String.
        /*System.out.println(a1);
        int value = a1.length();
        System.out.println(value);
        System.out.println(a1.toUpperCase());
        System.out.println(a1.substring(1,3));// gives a part of string from index 1 to 2(3 is excluded).
        System.out.println(a1.replace('r', 'j'));
        System.out.println(a1.charAt(4));
        System.out.println(a1.indexOf(7));
        System.out.println(a1.indexOf('r',4));
        System.out.println(a1.equalsIgnoreCase("HarrY"));
        System.out.println(a1.replace("rr", "Ratan"));//small fragment can also be replaced.
        System.out.println(a1.startsWith("Har"));
        System.out.println(a1.endsWith("r"));
        System.out.println(a1.charAt(2));*/
        System.out.println(a1.indexOf("ry", 2));

        //ESCAPE SEQUENCES: SEQUENCE OF CHARACTER AFTER BACKSLASH
        System.out.println("i am escape \\\\\\\t sequence");


    }
}
