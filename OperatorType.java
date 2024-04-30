package Cal;

public enum OperatorType {
    PLUS('+'),
    SUB('-'),
    MULTIPLY('*'),
    DIVIDE('/'),
    MOD('%');

    private final Character operator;

    OperatorType(Character operator){
        this.operator = operator;
    }

    public Character getOperator(){
        return this.operator;
    }

    public static Character enumOperator(char o) throws Exception{
        for(OperatorType op:OperatorType.values()){
            if(op.operator == o){
                return o;
            }
        }
        throw new Exception("연산자를 잘못 입력하셨습니다.");
    }
}
