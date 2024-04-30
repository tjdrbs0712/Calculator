package Cal;

public class SubstractOperator implements Operator<Double> {

    @Override
    public Double operate(Double f, Double s){
        return f - s;
    }
}
