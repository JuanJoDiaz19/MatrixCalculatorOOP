package ui;

import java.util.ArrayList;
import model.*;

public class InitModel {
    public static ArrayList<Student> initModel() {
        ArrayList<Student> students = new ArrayList<Student>();

        //Notes from the first student:
        students.add(new Student("Juan Jose", 18, "A123"));
        
        NoteSubject student0Note00 = new NoteSubject("Parcial 1", 4.5, "Matematicas", 3);
        NoteSubject student0Note10 = new NoteSubject("Parcial 2", 4, "Matematicas", 3);
        NoteSubject student0Note20 = new NoteSubject("Parcial 3", 4.5, "Matematicas", 3);
        NoteSubject student0Note01 = new NoteSubject("Parcial 1", 3.5, "Algoritmos", 4);
        NoteSubject student0Note11 = new NoteSubject("Parcial 2", 2.5, "Algoritmos", 4);
        NoteSubject student0Note21 = new NoteSubject("Parcial 3", 4.5, "Algoritmos", 4);
        NoteSubject student0Note02 = new NoteSubject("Parcial 1", 5, "Ing software", 2);
        NoteSubject student0Note12 = new NoteSubject("Parcial 2", 3, "Ing software", 2);
        NoteSubject student0Note22 = new NoteSubject("Parcial 3", 2.5, "Ing software", 2);

        students.get(0).addNoteInCoordinate(0, 0, student0Note00);
        students.get(0).addNoteInCoordinate(0, 1, student0Note01);
        students.get(0).addNoteInCoordinate(0, 2, student0Note02);
        students.get(0).addNoteInCoordinate(1, 0, student0Note10);
        students.get(0).addNoteInCoordinate(1, 1, student0Note11);
        students.get(0).addNoteInCoordinate(1, 2, student0Note12);
        students.get(0).addNoteInCoordinate(2, 0, student0Note20);
        students.get(0).addNoteInCoordinate(2, 1, student0Note21);
        students.get(0).addNoteInCoordinate(2, 2, student0Note22);

        //Notes from the second student:

        students.add(new Student("Ana sofia", 17, "A124"));
        
        NoteSubject student1Note00 = new NoteSubject("Parcial 1", 5, "Biotecnologia", 3);
        NoteSubject student1Note10 = new NoteSubject("Parcial 2", 5, "Biotecnologia", 3);
        NoteSubject student1Note20 = new NoteSubject("Parcial 3", 4.5, "Biotecnologia", 3);
        NoteSubject student1Note01 = new NoteSubject("Parcial 1", 4.9, "Contabilidad", 4);
        NoteSubject student1Note11 = new NoteSubject("Parcial 2", 4.5, "Contabilidad", 4);
        NoteSubject student1Note21 = new NoteSubject("Parcial 3", 5, "Contabilidad", 4);
        NoteSubject student1Note02 = new NoteSubject("Parcial 1", 5, "Estadistica", 2);
        NoteSubject student1Note12 = new NoteSubject("Parcial 2", 5, "Estadistica", 2);
        NoteSubject student1Note22 = new NoteSubject("Parcial 3", 4.5, "Estadistica", 2);

        students.get(1).addNoteInCoordinate(0, 0, student1Note00);
        students.get(1).addNoteInCoordinate(0, 1, student1Note01);
        students.get(1).addNoteInCoordinate(0, 2, student1Note02);
        students.get(1).addNoteInCoordinate(1, 0, student1Note10);
        students.get(1).addNoteInCoordinate(1, 1, student1Note11);
        students.get(1).addNoteInCoordinate(1, 2, student1Note12);
        students.get(1).addNoteInCoordinate(2, 0, student1Note20);
        students.get(1).addNoteInCoordinate(2, 1, student1Note21);
        students.get(1).addNoteInCoordinate(2, 2, student1Note22);

        //Notes from the third student:
        
        students.add(new Student("Samuel G.", 23, "A125"));
        
        NoteSubject student2Note00 = new NoteSubject("Parcial 1", 3, "Quimica", 3);
        NoteSubject student2Note10 = new NoteSubject("Parcial 2", 2, "Quimica", 3);
        NoteSubject student2Note20 = new NoteSubject("Parcial 3", 0, "Quimica", 3);
        NoteSubject student2Note01 = new NoteSubject("Parcial 1", 4.5, "Fisica", 4);
        NoteSubject student2Note11 = new NoteSubject("Parcial 2", 3.8, "Fisica", 4);
        NoteSubject student2Note21 = new NoteSubject("Parcial 3", 2, "Fisica", 4);
        NoteSubject student2Note02 = new NoteSubject("Parcial 1", 1.5, "Computacion discreta", 2);
        NoteSubject student2Note12 = new NoteSubject("Parcial 2", 2, "Computacion discreta", 2);
        NoteSubject student2Note22 = new NoteSubject("Parcial 3", 3.3, "Computacion discreta", 2);

        students.get(2).addNoteInCoordinate(0, 0, student2Note00);
        students.get(2).addNoteInCoordinate(0, 1, student2Note01);
        students.get(2).addNoteInCoordinate(0, 2, student2Note02);
        students.get(2).addNoteInCoordinate(1, 0, student2Note10);
        students.get(2).addNoteInCoordinate(1, 1, student2Note11);
        students.get(2).addNoteInCoordinate(1, 2, student2Note12);
        students.get(2).addNoteInCoordinate(2, 0, student2Note20);
        students.get(2).addNoteInCoordinate(2, 1, student2Note21);
        students.get(2).addNoteInCoordinate(2, 2, student2Note22);

        
        return students; 
    }
}
