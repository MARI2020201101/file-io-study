package io.object;

import java.io.Serializable;

public class SerialDTO implements Serializable {
    private String bookName;
    private int bookOrder;
    private boolean bookSeller;
    private long soldPerDay;
    private String bootType="IT";

    public SerialDTO(String bookName, int bookOrder, boolean bookSeller, long soldPerDay) {
        this.bookName = bookName;
        this.bookOrder = bookOrder;
        this.bookSeller = bookSeller;
        this.soldPerDay = soldPerDay;
    }

    @Override
    public String toString() {
        return "SerialDTO{" +
                "bookName='" + bookName + '\'' +
                ", bookOrder=" + bookOrder +
                ", bookSeller=" + bookSeller +
                ", soldPerDay=" + soldPerDay +
                '}';
    }
}
