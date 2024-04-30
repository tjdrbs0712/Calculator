package Cal;

public class MultiplyOperator implements Operator<Double> {

    @Override
    public Double operate(Double f, Double s){
        return f * s;
    }
}
