package model;

public class NoteSubject {
    private String nameNote;
    private double valueNote;
    private String nameSubject;
    private int creditSubject;

    public String getNameNote() {
        return this.nameNote;
    }

    public void setNameNote(String nameNote) {
        this.nameNote = nameNote;
    }

    public double getValueNote() {
        return this.valueNote;
    }

    public void setValueNote(double valueNote) {
        this.valueNote = valueNote;
    }

    public String getNameSubject() {
        return this.nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public int getCreditSubject() {
        return this.creditSubject;
    }

    public void setCreditSubject(int creditSubject) {
        this.creditSubject = creditSubject;
    }

    public NoteSubject(String nameNote, double valueNote, String nameSubject, int creditSubject) {
        this.nameNote = nameNote;
        this.valueNote = valueNote;
        this.nameSubject = nameSubject;
        this.creditSubject = creditSubject;
    }
}

