1>
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

    }
}


____________________________#_________________________________________________________________
2>Data types -PRIMITIVE:


public class Main {
    public static void main(String[] args) {

        byte number = 10 ;              //8 bits
        short number2 = 150 ;           //16bits
        int number3 = 123456789 ;       //32bits
        long number4 = 2345678956789L ; //64bits
        float number5 = 11.5F ;         //32bits
        double number6 = 1111.99999999 ;//64bits
        char alphabet = 'a' ;           //16bits
        boolean bool = true ;           //1bit


        System.out.println(number) ;
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(number5);
        System.out.println(number6);
        System.out.println(alphabet);
        System.out.println(bool);

    }
}


______________________________________*__________________________________________________________

3>Reference Data types

ARRAY:____

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[5] ;
        numbers[0] = 10;
        numbers[1] = 11;
        numbers[2] = 20;
        numbers[3] = 3;
        numbers[4] = 10;

        System.out.println(Arrays.toString(numbers)); 

    }
}

________________________________________________________

2 dimention:

import java.util.Arrays ;

public class Main {
    public static void main(String[] args) {
        int numbers[] = new int [2];
        int numbers1[] = new int [1];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers1[0] = 3;
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers1));

    }
}



STRING:_______



import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String channelName = " dinesh " + " sambunathi ";
        System.out.println(channelName);
        System.out.println(channelName.length());
        System.out.println(channelName.toUpperCase());
        System.out.println(channelName.trim());

    }
}



PRIME:_________




import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        byte a;
        Scanner Scanner = new Scanner (System.in);
        byte aByte = Scanner.nextByte();

        if (aByte %2==0)
            System.out.println("prime");
        else {
            System.out.println("not prime");
        }
    }
}


