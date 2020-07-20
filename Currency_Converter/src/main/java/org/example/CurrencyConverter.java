package org.example;


import java.text.DecimalFormat;
import java.util.Scanner;

/**ENUM CLASS*/
enum CurrencyType
{
    DOLLAR, POUND, EURO, YEN, RINGGIT, RUPEE;;
}

public class CurrencyConverter {

    CurrencyType ct;

    public CurrencyConverter(CurrencyType ct) {
        this.ct = ct;
    }

    public float convert(float amount, String sourceCurrencyType, String targetCurrencyType) {
        DecimalFormat f = new DecimalFormat("##.##");
        double dollar, pound,euro, yen, ringgit, rupee;

        switch (ct) {

            case DOLLAR:
                rupee = amount * 70;
                System.out.println("Your " + amount + " Dollar is : " + f.format(rupee) + " Rupees");

                pound = amount * 0.78;
                System.out.println("Your " + amount + " Dollar is : " + f.format(pound) + " Pound");

                euro = amount * 0.87;
                System.out.println("Your " + amount + " Dollar is : " + f.format(euro) + " Euro");

                yen = amount * 111.087;
                System.out.println("Your " + amount + " Dollar is : " + f.format(yen) + " Yen");

                ringgit = amount * 4.17;
                System.out.println("Your " + amount + " Dollar is : " + f.format(ringgit) + " Ringgit");
                break;
            case POUND:
                rupee = amount * 88;
                System.out.println("Your " + amount + " pound is : " + f.format(rupee) + " Ruppes");

                dollar = amount * 1.26;
                System.out.println("Your " + amount + " pound is : " + f.format(dollar) + " Dollar");

                euro = amount * 1.10;
                System.out.println("Your " + amount + " pound is : " + f.format(euro) + " Euro");

                yen = amount * 140.93;
                System.out.println("Your " + amount + " pound is : " + f.format(yen) + " Yen");

                ringgit = amount * 5.29;
                System.out.println("Your " + amount + " pound is : " + f.format(ringgit) + " Ringgit");
                break;
            case EURO:
                rupee = amount * 80;
                System.out.println("Your " + amount + " euro is : " + f.format(rupee) + " Ruppes");

                dollar = amount * 1.14;
                System.out.println("Your " + amount + " euro is : " + f.format(dollar) + " Dollar");

                pound = amount * 0.90;
                System.out.println("Your " + amount + " euro is : " + f.format(pound) + " Pound");

                yen = amount * 127.32;
                System.out.println("Your " + amount + " euro is : " + f.format(yen) + " Yen");

                ringgit = amount * 4.78;
                System.out.println("Your " + amount + " euro is : " + f.format(ringgit) + " Ringgit");
            case YEN:
                rupee = amount * 0.63;
                System.out.println("Your " + amount + " yen is : " + f.format(rupee) + " Ruppes");

                dollar = amount * 0.008;
                System.out.println("Your " + amount + " yen is : " + f.format(dollar) + " Dollar");

                pound = amount * 0.007;
                System.out.println("Your " + amount + " yen is : " + f.format(pound) + " Pound");

                euro = amount * 0.007;
                System.out.println("Your " + amount + " yen is : " + f.format(euro) + " Euro");

                ringgit = amount * 0.037;
                System.out.println("Your " + amount + " yen is : " + f.format(ringgit) + " Ringgit");
                break;
            case RINGGIT:
                rupee = amount * 16.8;
                System.out.println("Your " + amount + " ringgit is : " + f.format(rupee) + " Ruppes");

                dollar = amount * 0.239;
                System.out.println("Your " + amount + " ringgit is : " + f.format(dollar) + " dollar");

                pound = amount * 0.188;
                System.out.println("Your " + amount + " ringgit is : " + f.format(pound) + " pound");

                euro = amount * 0.209;
                System.out.println("Your " + amount + " ringgit is : " + f.format(euro) + " euro");

                yen = amount * 26.63;
                System.out.println("Your " + amount + " ringgit is : " + f.format(yen) + " yen");
                break;
            case RUPEE:
                dollar = amount / 70;
                System.out.println("Your " + amount + " Rupee is : " + f.format(dollar) + " Dollar");

                pound = amount / 88;
                System.out.println("Your " + amount + " Rupee is : " + f.format(pound) + " Pound");

                euro = amount / 80;
                System.out.println("Your " + amount + " Rupee is : " + f.format(euro) + " Euro");

                yen = amount / 0.63;
                System.out.println("Your " + amount + " Rupee is : " + f.format(yen) + " Yen");

                ringgit = amount / 16;
                System.out.println("Your " + amount + " Rupee is : " + f.format(ringgit) + " Ringgit");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        return amount;
    }
            public static void main(String[] args)
            {

                String sourceCurrencyType=" ",targetCurrencyType=" ";

                float amount;

                Scanner sc = new Scanner(System.in);

                System.out.println("Hi, Welcome to the Currency Converter!");

                System.out.println("Which currency You want to Convert ? ");
                System.out.println("1:RUPEE\t2:DOLLAR \t3:POUND \n4:EURO \t5:YEN \t6:RINGGET ");
                String str = sc.nextLine();

                System.out.println("How much Money you want to convert ?");
                amount = sc.nextFloat();

                CurrencyConverter ct = new CurrencyConverter(CurrencyType.valueOf(str));
                ct.convert(amount,sourceCurrencyType,targetCurrencyType);
            }

    }







