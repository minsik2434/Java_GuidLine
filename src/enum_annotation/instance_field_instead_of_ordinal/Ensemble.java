package enum_annotation.instance_field_instead_of_ordinal;

public enum Ensemble {
    SOLO, DUET, TRIO, QUARTET, QUINTET,
    SEXTET, SEPTET, OCTET, NONET, DECTET;

    public int numberOfMusicians(){
        return ordinal() + 1;
    }
}
