package parser;

import interfaces.AbstractOperations;

public class Parser extends AbstractOperations implements IParser {
    private String result;

    @Override
    public void parseData(String value) throws Exception {
        StringBuilder sbStack = new StringBuilder(""), sbOut = new StringBuilder("");
        char in_data, cTmp;

        for (int i = 0; i < value.length(); i++) {
            in_data = value.charAt(i);
            if (checkOperator(in_data)) {
                while (sbStack.length() > 0) {
                    cTmp = sbStack.substring(sbStack.length() - 1).charAt(0);
                    if (checkOperator(cTmp) && (opPrior(in_data) <= opPrior(cTmp))) {
                        sbOut.append("").append(cTmp).append("");
                        sbStack.setLength(sbStack.length() - 1);
                    } else {
                        sbOut.append("");
                        break;
                    }
                }
                sbOut.append("");
                sbStack.append(in_data);
            } else if ('(' == in_data) {
                sbStack.append(in_data);
            } else if (')' == in_data) {
                cTmp = sbStack.substring(sbStack.length() - 1).charAt(0);
                while ('(' != cTmp) {
                    if (sbStack.length() < 1) {
                        throw new Exception("Bracket parsing error. Verify that the expression is valid.");
                    }
                    sbOut.append(" ").append(cTmp);
                    sbStack.setLength(sbStack.length() - 1);
                    cTmp = sbStack.substring(sbStack.length() - 1).charAt(0);
                }
                sbStack.setLength(sbStack.length() - 1);
            } else {
                sbOut.append(in_data);
            }
        }

        while (sbStack.length() > 0) {
            sbOut.append(" ").append(sbStack.substring(sbStack.length() - 1)).append(" ");
            sbStack.setLength(sbStack.length() - 1);
        }
        setResult(sbOut.toString());

    }


    public String getResult() {
        return result;

    }

    public void setResult(String result) {
        this.result = result;
    }
}
