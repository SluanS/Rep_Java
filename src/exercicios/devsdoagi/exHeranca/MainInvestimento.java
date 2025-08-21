package exercicios.devsdoagi.exHeranca;

import java.awt.geom.NoninvertibleTransformException;

public class MainInvestimento {
    public static void main(String[] args) {
        InvestimentoRendaFixa irf = new InvestimentoRendaFixa("225",2330.00, (float)2.0,(byte)12);
        System.out.println(irf.calcularValorFinal());
    }
}
