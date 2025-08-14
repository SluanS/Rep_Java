package exercicios.devsdoagi.avulsos;
import java.util.Locale;
public class TestOutPut{
    public static void main(String[] args){
        String product1 = "Computer";
        String product2 = "Office desk";

        byte idade = 30;
        int code = 5290;
        char gender = 'F';

        float price1 = 2100.0f;
        float price2 = 650.50f;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, wich price is $%.2f\n",product1, price1);
        System.out.printf("%s, wich price is $%.2f\n", product2, price2);
        System.out.printf("Record: %d years old, code %d and gender %c\n",idade,code,gender);
        System.out.printf("Measue with eight decimal places: %.8f\n", measure);
        System.out.printf("Rounded (three decimal places) %.3f\n",measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point %f", measure);
    }
}