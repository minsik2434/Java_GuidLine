package enum_annotation.instance_field_instead_of_ordinal;

public enum EnsembleInstance {
    SOLO(1), DUET(2), TRIO(3), QUARTET(4), QUINTET(5),
    SEXTET(6), SEPTET(7), OCTET(8), NONET(9), DECTET(10);

    private final int numberOfMusicians;
    EnsembleInstance(int size) {
        this.numberOfMusicians = size;
    }
    public int numberOfMusicians(){
        return numberOfMusicians;
    }
}
