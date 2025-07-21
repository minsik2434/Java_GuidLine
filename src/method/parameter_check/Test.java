package method.parameter_check;

import java.math.BigInteger;

public class Test {
    private final BigInteger value;

    public Test(BigInteger value) {
        this.value = value;
    }

    /**
     * 현재 값 mod m 값을 반환한다 이 메서드는
     * 항상 음이아닌 BigInteger를 반환한다는 점에서 remainder 메서드와 다르다
     *
     * @param m 계수(양수여야한다)
     * @return 현재값 mod m
     * @throws ArithmeticException m이 0보다 작거나 같으면 발생
     */
    public BigInteger mod(BigInteger m){
        if(m.signum() <= 0){
            throw new ArithmeticException("계수 m 은 양수여야한다");
        }
        BigInteger result = value.remainder(m);
        if (result.signum() < 0) {
            result = result.add(m); // 음수일 경우 양수로 변환
        }

        return result;
    }

    private static void sort(long a[], int offset, int length){
        assert a != null;
        assert offset >= 0 && offset <= a.length;
        assert length >= 0 && length <= a.length - offset;
    }
}
