package lambda_stream.lambda_instead_of_anonymous_class;

import java.util.Map;
import java.util.Optional;
import java.util.function.DoubleBinaryOperator;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public enum OperationLambda {
    PLUS("+", (x,y) -> x+y),

    MINUS("-", (x, y) -> x-y),

    TIMES("*", (x,y)-> x*y),

    DIVIDE("/", (x,y)->x/y);

    private final String symbol;
    private final DoubleBinaryOperator op;
    OperationLambda(String symbol, DoubleBinaryOperator op){
        this.symbol = symbol;
        this.op = op;
    }

    @Override
    public String toString() {
        return symbol;
    }

    public double apply(double x, double y){
        return op.applyAsDouble(x, y);
    }

    private static final Map<String, OperationLambda> stringToEnum =
            Stream.of(values()).collect(
                    toMap(Object::toString, e->e)
            );

    public static Optional<OperationLambda> fromString(String symbol){
        return Optional.ofNullable(stringToEnum.get(symbol));
    }
}
