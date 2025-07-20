package enum_annotation.used_interface;

public enum ExtendedOperation implements Operation{
    EXP("^"){
        public double apply(double x, double y){
            return Math.pow(x, y);
        }
    },
    REMAINDER("%"){
        public double apply(double x, double y){
            return x%y;
        }
    };

    private final String symbol;

    ExtendedOperation(String s){
        this.symbol = s;
    }


    @Override
    public String toString() {
        return symbol;
    }
}
