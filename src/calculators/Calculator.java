package calculators;

import factory.ActionFactory;
import interfaces.AbstractOperations;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Calculator extends AbstractOperations implements ICalculator {
    private double result;
    private Deque<Double> stack = new ArrayDeque<>();
    @Override
    public void calculate(String value) throws Exception {
        String sTe;
        StringTokenizer st = new StringTokenizer(value);

        while (st.hasMoreTokens()){
            sTe = st.nextToken().trim();

            stack = choiceOfAction(sTe);
        }
        setResult(stack.pop());

    }

    private Deque<Double> choiceOfAction(String value) throws Exception {
        double dA;
        double dB;
        if (1 == value.length() && checkOperator(value.charAt(0))) {

            dB = stack.pop();
            dA = stack.pop();

            dA = ActionFactory.valueOf(getOperationString(value.charAt(0))).getAction().makeAction(dA,dB);
            stack.push(dA);
        } else {
            dA = Double.parseDouble(value);
            stack.push(dA);
        }
        return stack;
    }

    @Override
    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }


}
