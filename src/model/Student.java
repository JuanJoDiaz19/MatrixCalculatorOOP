package model;

public class Student{

    private String name;
    private int age;
    private String studentId;
    private NoteSubject[][] notes;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public NoteSubject[][] getNotes() {
        return this.notes;
    }

    public void setNotes(NoteSubject[][] notes) {
        this.notes = notes;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getage() {
        return this.age;
    }

    public void setage(int age) {
        this.age = age;
    }

    public String getStudentId() {
        return this.studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }


    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        notes = new NoteSubject[3][3];
    }

    public boolean addNoteInCoordinate(int coordinateRows, int coordinateColumns, NoteSubject note) {
        notes[coordinateRows][coordinateColumns] = note;
        return true;
    }
    
    public double calculateAverage(){
        double averageSubject1=0;
        double averageSubject2=0;
        double averageSubject3=0;
        for(int i=0; i<notes.length;i++){
             averageSubject1+=notes[i][0].getValueNote();   
             averageSubject2+=notes[i][1].getValueNote();
             averageSubject3+=notes[i][2].getValueNote();   
        }
        averageSubject1=averageSubject1/3;
        averageSubject2=averageSubject2/3;
        averageSubject3=averageSubject3/3;

        int sumAllCredits=notes[0][0].getCreditSubject()+notes[0][1].getCreditSubject()+notes[0][2].getCreditSubject();

        double totalAverage=((averageSubject1*notes[0][0].getCreditSubject())+(averageSubject2*notes[0][1].getCreditSubject())+(averageSubject3*notes[0][2].getCreditSubject()))/sumAllCredits;
        return Math.round(totalAverage*100.0)/100.0;
    }

    public String showNotes() {
        String out = "          |";
        out+= notes[0][0].getNameSubject() +"  |" + notes[0][1].getNameSubject()+"  |" +notes[0][2].getNameSubject()+"  |\n";
        
        for (int i = 0; i < notes.length; i++) {
            out+= notes[i][0].getNameNote() + " |";
            for (int j = 0; j < notes.length; j++) {
                out+= notes[i][j].getValueNote() +" |";
            }
            out += "\n";
        }
        return out;
    }

}