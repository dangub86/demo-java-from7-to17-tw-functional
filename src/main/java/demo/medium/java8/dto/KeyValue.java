package demo.medium.java8.dto;

public class KeyValue {
    private final String code;
    private final String value;

    public KeyValue(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }

}
