package Lab03;

public class Task07 {
    public static void main(String[] args) {
        String str1 = "Apple";
        String str2 = "Ball";

       //compareTo()
        System.out.println("compareTo()");
        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str1));
        System.out.println(str1.compareTo(str1));

        //compareToIgnoreCase()
        System.out.println("compareToIgnoreCase()");
        String str3 = new String("apple");
        System.out.println(str1.compareToIgnoreCase(str3));
        System.out.println(str3.compareToIgnoreCase(str1));
        System.out.println(str3.compareToIgnoreCase(str3));

        //startsWith()
        System.out.println();
        String subStr1 = "Ap";
        if(str1.startsWith(subStr1)){
            System.out.println(str1 + "startsWith()" + subStr1);
        }

        //endsWith()
        System.out.println();
        String subStr2 = "lle";
        if(str1.endsWith(subStr2)){
            System.out.println(str1 + "endsWith()" + subStr2);
        }

        //equals()
        System.out.println(str1.equals(str2));

        //equalsIgnoreCase()
        System.out.println(str1.equalsIgnoreCase(str3));

        //indexOf()
        System.out.println(str1.indexOf('l'));
        System.out.println(str1.indexOf("le"));

        //lastIndexOf()
        System.out.println(str1.lastIndexOf('l'));

        //length()
        System.out.println(str1.length());

        //replace()
        str1.replace('A', 'B');
        System.out.println(str1);

        //substring()
        System.out.println(str1.substring(2,4));

        //toCharArray
        char[] chars = str1.toCharArray();
        for(char c : chars){
            System.out.println(c);
        }

        //toLowerCase()
        System.out.println(str2.toLowerCase());

        //toUpperCase()
        System.out.println(str2.toUpperCase());

        //trim()
        String sentence = "Elon Musk";
        System.out.println(sentence.trim());

        //valueOf()
        String num = String.valueOf("12345");
        System.out.println(num + 1);
    }
}
