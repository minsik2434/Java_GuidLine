package class_interface.immutable_class;

public final class Complex {
    private final double re;
    private final double im;

    public static final Complex ZERO = new Complex(0, 0);
    public static final Complex ONE = new Complex(1, 0);
    public static final Complex I = new Complex(0, 1);
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double realPart(){
        return re;
    }

    public double imaginaryPart(){
        return im;
    }
    // 인스턴스를 새로 만들어 반환
    public Complex plus(Complex c){
        return new Complex(re + c.re, im + c.im);
    }
    // 인스턴스를 새로 만들어 반환
    public Complex minus(Complex c){
        return new Complex(re - c.re, im - c.im);
    }
    // 인스턴스를 새로 만들어 반환
    public Complex times(Complex c){
        return new Complex(re * c.re - im * c.im,
                re * c.im + im * c.re);
    }
    // 인스턴스를 새로 만들어 반환
    public Complex dividedBy(Complex c){
        double tmp = c.re * c.re + c.im * c.im;
        return new Complex((re * c.re + im * c.im)/tmp , (im * c.re - re * c.im)/tmp);
    }

    @Override
    public boolean equals(Object o) {
        if(o == this){
            return true;
        }
        if(!(o instanceof Complex)){
            return false;
        }
        Complex c = (Complex) o;

        return Double.compare(c.re, re) == 0
                && Double.compare(c.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return 31 * Double.hashCode(re) + Double.hashCode(im);
    }

    @Override
    public String toString() {
        return "(" + re + " + " + im + "i)";
    }
}