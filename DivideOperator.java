package Cal;

public class DivideOperator implements Operator<Double> {

    @Override
    public Double operate(Double f, Double s) throws Exception{
        if(f==0){
            throw new Exception("분모가 0입니다.");
        }
        return f/s;
    }
}
