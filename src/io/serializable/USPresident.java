package io.serializable;

import java.io.Serializable;

public class USPresident implements Serializable {
    private static final long serailVersionUID = 1L;

    private String name;
    private String period;
    private transient String term;

    public USPresident(String name, String period, String term) {
        this.name = name;
        this.period = period;
        this.term = term;
    }

    @Override
    public String toString() {
        return "US President [name=" + this.name + ", period=" + this.period + ", term=" + this.term + "]";
    }
}
