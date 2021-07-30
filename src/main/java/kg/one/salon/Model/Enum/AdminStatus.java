package kg.one.salon.Model.Enum;

public enum AdminStatus {
    ACTIVE    (0),
    VACATION  (1),
    NOT_ACTIVE (2);

    private final int statusCode;

    AdminStatus( int statusCode) {
        this.statusCode = statusCode;
    }


}
