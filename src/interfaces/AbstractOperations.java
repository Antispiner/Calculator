package interfaces;

public class AbstractOperations {


    protected boolean checkOperator(char operator) {
        return operator == '-' || operator == '+' || operator == '*' || operator == '/';
    }


    protected int opPrior(char op) {
        return op == '*' || op == '/' ? 2 : 1;
    }

    protected String getOperationString(char c) {
        String result = "";
        switch (c) {
            case '-':
                result = "MINUS";
                break;
            case '+':
                result = "PLUS";
                break;
            case '*':
                result = "MULTIPLY";
                break;
            case '/':
                result = "DIVIDE";
                break;
        }
        return result;
    }
}
