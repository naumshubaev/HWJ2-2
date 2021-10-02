import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        float initialSum = 1000;
        float addedSum = 1000.09F;
        float bonus = 0;

        if (addedSum > 1000) {
            bonus = addedSum / 100;
        } else {
                        //bonus = 0; anyway
        }

        float finalSum = initialSum + addedSum + bonus;

        //вывод суммы в виде х.хх; не особо элегантно и медленно, но применимо же?
        DecimalFormat formatter = (DecimalFormat) NumberFormat.getCurrencyInstance(Locale.US);
        DecimalFormatSymbols symbols = formatter.getDecimalFormatSymbols();
        symbols.setCurrencySymbol("");
        formatter.setDecimalFormatSymbols(symbols);

        System.out.println("Ваш баланс - Your balance is: " + formatter.format(finalSum));
        System.out.println("Ваш бонус - Your bonus is: " + formatter.format(bonus));

    }
}