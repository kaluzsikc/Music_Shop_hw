package instruments;

import enums.PianoType;

public class Piano extends Instrument {

    private PianoType pianoType;
    private int noOfChords;

    public Piano(String name, String type, String material, String color, String playSound, double buyPrice, double sellPrice, PianoType pianoType, int noOfChords){

        super(name, type, material, color, playSound, buyPrice, sellPrice);
        this.pianoType = pianoType;
        this.noOfChords = noOfChords;
    }

    public PianoType getPianoType() {
        return pianoType;
    }

    public int getNoOfChords() {
        return noOfChords;
    }

    @Override
    public String play() {
        return "Piano plays: " + getPlaySound();
    }
}
