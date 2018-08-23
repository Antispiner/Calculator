import calculators.Calculator;
import calculators.ICalculator;
import parser.IParser;
import parser.Parser;
import reading.IReader;
import reading.Reader;

public class Runner {

    public static void main(String[] args) {
        Reader reader = new Reader();
        reader.input_data(reader);

        IParser iParser        = new Parser();
        ICalculator calculator = new Calculator();

        try {
            iParser.parseData(reader.getData());
            calculator.calculate(iParser.getResult());

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(String.valueOf(calculator.getResult()));
    }




}
