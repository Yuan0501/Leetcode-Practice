import java.util.ArrayList;
import java.util.List;

public class Peoblem241 {
    public boolean isTwoDigits(String expression){
        return expression.matches("\\d{2}");
    }

    public int operationResult(int left, int right, char operator){
        if(operator == '+'){
            return left + right;
        } else if (operator == '-') {
            return left - right;
        }else {
            return left * right;
        }
    }
    public List<Integer> diffWaysToCompute(String expression){
        List<Integer> res = new ArrayList<>();
        if(expression.length() == 0){
            return res;
        }
        if(expression.length() == 1 && Character.isDigit(expression.charAt(0))){
            char digit = expression.charAt(0);
            int num = digit - '0';
            res.add(num);
            return res;
        }
        if(expression.length() == 2 && isTwoDigits(expression)){
            int twodigits = Integer.parseInt(expression);
            res.add(twodigits);
            return res;
        }
        for (int i = 0; i < expression.length(); i++){
            char currentChar = expression.charAt(i);
            if(Character.isDigit(currentChar)){
                continue;
            }
            List<Integer> leftResults = diffWaysToCompute(expression.substring(0,i));
            List<Integer> rightResults = diffWaysToCompute(expression.substring(i + 1, expression.length()));

            for (int left : leftResults){
                for (int right: rightResults){
                    int computeResult = operationResult(left, right, currentChar);
                    res.add(computeResult);
                }
            }
        }
        return res;

    }
}
