package enum_annotation.enum_insteadof_constants;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public enum OperationData {
    PLUS("+") {
        public double apply(double x, double y){
            return x+y;
        }
    },

    MINUS("-"){
        public double apply(double x, double y){
            return x-y;
        }
    },

    TIMES("*"){
        public double apply(double x, double y){
            return x*y;
        }
    },

    DIVIDE("/"){
        public double apply(double x, double y){
            return x/y;
        }
    };

    private final String symbol;
    OperationData(String symbol){
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    public abstract double apply(double x, double y);

    private static final Map<String, OperationData> stringToEnum =
            Stream.of(values()).collect(
                    toMap(Object::toString, e->e)
            );

    public static Optional<OperationData> fromString(String symbol){
        return Optional.ofNullable(stringToEnum.get(symbol));
    }
}
