package Cal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArithmeticCalculator extends Calculator<Double>{

    private final Map<Character, Operator<Double>> operators = new HashMap<>();

    public ArithmeticCalculator(){
        Operators();
    }

    //App.java 에서 입력한 숫자와 연산자를 받아와 계산하는 메서드
    @Override
    public void calculate(Double f, Double s, char o) throws Exception{
        result = operators.get(OperatorType.enumOperator(o)).operate(f, s);
        setResult(result);
        setResultList(result);
    }

    //연산 클래스들을 초기화 시켜주는 메서드
    private void Operators(){
        operators.put('+', new AddOperator());
        operators.put('-', new SubstractOperator());
        operators.put('*', new MultiplyOperator());
        operators.put('/', new DivideOperator());
        operators.put('%', new ModOperator());
    }

    @Override
    public List<Double> compareValue(Double v){
        return resultList.stream().filter(value -> value > v).toList();
    }

//    private void Operators(){
//        operators.put('+', new AddOperator());
//        operators.put('-', (f, s) -> f - s);
//        operators.put('*', (f, s) -> f * s);
//        operators.put('/', (f, s) -> {
//            if (f==0) throw new Exception("분모가 0입니다.");
//            return f/s;
//        });
//        operators.put('%', (f, s) -> f % s);
//    }
}


