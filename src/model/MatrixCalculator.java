package model;

import java.util.ArrayList;
import java.util.Random;

public class MatrixCalculator {
	
	private ArrayList<int[][]> numericMatrices;
	private ArrayList<String[][]> stringMatrices;
	private ArrayList<Student> studentsInfo;
	private Student[][] students;
	
	public MatrixCalculator() {
		numericMatrices= new ArrayList<int[][]>() ;
		stringMatrices= new ArrayList<String[][]>();
		studentsInfo= new ArrayList<Student>();
		this.students=new Student[10][10];
	}
	
	public String showMatrices() {
		String out="";
		out += "Numeric matrices \n";
		for(int i=0; i< numericMatrices.size(); i++) {
			out+= printNumeric(numericMatrices.get(i));
		}
		out += "String matrices \n";
		for(int i=0; i< stringMatrices.size(); i++) {
			out+= printString(stringMatrices.get(i));
		}
		
		return out;
	}

	private String printString(String[][] matrix) {
		String print ="";
		for (int i=0; i<matrix.length ; i ++) {
			for (int j=0; j<matrix[0].length ; j++) {
				print += matrix[i][j] + " ";
			}
			print += "\n";
		}
		

		return print;
	}

	private String printNumeric(int[][] numbers) {
		String print ="";
		for (int i=0; i< numbers.length; i++ ) { // filas numbers.length
			for (int j = 0; j < numbers[0].length; j++) { //columnas numbers[0].length
				print += numbers[i][j] + " ";
			}
			print += "\n";
		}
		return print;
	}
	
	

	public String createMatrix(int type, int rows, int columns) {
		String out="";
		switch(type) {
		case 1: //numeric Matrix
			int [][] newMatrix = fillNumeric(rows,columns);
			numericMatrices.add(newMatrix);
			out = printNumeric(newMatrix);
			
			break;
		case 2: //String Matrix
			String [][] newStringMatrix=fillString(rows,columns);
			stringMatrices.add(newStringMatrix);
			out = printString(newStringMatrix);
		}
		
		return out;
		
	}
	public String[][] fillString(int rows,int columns){
		String [][] newStringMatrix= new String[rows][columns];
		for (int i=0; i< newStringMatrix.length; i++ ) { // filas numbers.length
			for (int j = 0; j < newStringMatrix[0].length; j++) { //columnas numbers[0].length
				Random randomNumber = new Random();
				int number = randomNumber.nextInt(90-65)+65;
				char letter = (char)number;
				String letters= ""+letter;
				newStringMatrix[i][j]=letters;
			}
		}
		return newStringMatrix;
	}
	public int[][] fillNumeric(int rows,int columns){
		int [][] newMatrix= new int[rows][columns];
		for (int i=0; i< newMatrix.length; i++ ) { // filas numbers.length
			for (int j = 0; j < newMatrix[0].length; j++) { //columnas numbers[0].length
				Random randomNumber = new Random();
				int number = randomNumber.nextInt(100);
				newMatrix[i][j]=number;
			}
		}
		return newMatrix;
	}
	
	public void addNumeric (int[][] numMatrix) {
		numericMatrices.add(numMatrix);
	}
	public void addString (String[][] newStringMatrix) {
		stringMatrices.add(newStringMatrix);
	}
	public String addStudent(String name, int age, String studentID){
        String out="";
		boolean wasAdded=true;
		for(int i =0; i<students.length; i++){
            for(int j =0; j<students[0].length && wasAdded; j++){
                if(students[i][j]==null){
                    Student student=new Student(name, age, studentID);
					students[i][j] = student;
					wasAdded=false;
					studentsInfo.add(student);
                }
            }
        }
		out="Was registered";
		return out;
    }
	public String lookUpStudent(String id){
		boolean wasFound=false;
		String out="";
		for(int rowNum=0; rowNum<students.length;rowNum++){
			for(int columnNum=0; columnNum<students[0].length;columnNum++){
				if(students[rowNum][columnNum]!=null && students[rowNum][columnNum].getStudentId().equals(id) & wasFound==false){
					out="Student was found";
					wasFound=true;
					System.out.println();
				}
			}
		}
		if(wasFound==false){
			out="Student was not found";
		}
		return out;

	}
	public String showAllStudentsNames(){
		String out="";
		if(!studentsInfo.isEmpty()){
			for(int rowNum=0; rowNum<students.length;rowNum++){
				for(int columnNum=0; columnNum<students[0].length;columnNum++){
					if(students[rowNum][columnNum]!=null){
						out+=students[rowNum][columnNum].getName()+"\n";
					}
				}
			}
		}else{
			out="There are no students";
		}
		return out;
//Por grupo presenta el diagrama de la extension, estrategia de los problemas (general) y una demostracion
	}
	public String organizeStudents(){
		String out="";
		boolean flag = true;
		String[][] summary = new String[100][5];
		summary[0][0]="Student num";
		summary[0][1]=" Name ";
		summary[0][2]=" Age ";
		summary[0][3]=" Average ";
		summary[0][4]=" Student Id ";
		for (int i = 1; i < studentsInfo.size()+1; i++) {
			summary[i][0] = "Student " + (i);
			summary[i][1] = studentsInfo.get(i-1).getName();
			summary[i][2] = "" + studentsInfo.get(i-1).getage() ;	
			summary[i][3] = "" + studentsInfo.get(i-1).getaverage() ;
			summary[i][4] = studentsInfo.get(i-1).getStudentId();
		}
		for (int i = 0; i < summary.length && flag; i++) {
			for (int j = 0; j < summary[0].length; j++) {
				if (summary[i][j] != null) {
					out += summary[i][j] + "|";
				} else {
					flag = false;
				}
				
			}
			out +="\n";
		}
		return out;
	}

	public boolean registerNoteInStudent(String idStudent, int coordinateRows, int coordinateColumns, String nameNote, double valueNote, String nameSubject, int creditSubject ) {
		NoteSubject noteSubject = new NoteSubject(nameNote, valueNote, nameSubject, creditSubject);
		findStudent(idStudent).addNoteInCoordinate(coordinateRows, coordinateColumns, noteSubject);
		return true;

	}

	public Student findStudent(String id) {
		Student student = null;
		for (int i = 0; i < studentsInfo.size(); i++) {
			if (studentsInfo.get(i).getStudentId().equals(id)) {
				student = studentsInfo.get(i);
			}
		}
		return student;
	}
	

}
