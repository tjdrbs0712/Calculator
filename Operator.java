package Cal;

public interface Operator<T extends Number> {
    public T operate(T f, T s) throws Exception;
}
