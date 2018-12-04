package Augis;

public class Cards {
    private int value;
    private String type;
    private String symbol;


    public Cards(int value, String type, String symbol) {
        this.value = value;
        this.type = type;
        this.symbol = symbol;

    }

    public static Cards createCard(int value, String type, String symbol){
        return new Cards(value, type, symbol);
    }

    public int getValue() {
        return value;
    }

    public String getType() {
        return type;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return "Cards{" +
                "value=" + value +
                ", type='" + type + '\'' +
                ", symbol='" + symbol + '\'' +
                '}';
    }
}
