package com.company;

public class SSNumber {
    private String sevenSegmentsRepresentation;
    private int number;

    public SSNumber(String sevenSegmentsRepresentation) {
        this.sevenSegmentsRepresentation = sevenSegmentsRepresentation;
        number = -1;
    }

    public String getSevenSegmentsRepresentation() {
        return sevenSegmentsRepresentation;
    }

    public void setSevenSegmentsRepresentation(String sevenSegmentsRepresentation) {
        this.sevenSegmentsRepresentation = sevenSegmentsRepresentation;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
