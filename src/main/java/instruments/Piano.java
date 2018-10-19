package instruments;

import enums.PianoType;

public class Piano extends Instrument {

    private PianoType pianoType;
    private int noOfChords;

    public Piano(String name, String type, String material, String color, double buyPrice, double sellPrice, PianoType pianoType, int noOfChords){

        super(name, type, material, color, buyPrice, sellPrice);
        this.pianoType = pianoType;
        this.noOfChords = noOfChords;
    }

    public PianoType getPianoType() {
        return pianoType;
    }

    public int getNoOfChords() {
        return noOfChords;
    }
}
