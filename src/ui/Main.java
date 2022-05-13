package ui;

import java.util.Scanner;

import model.MatrixCalculator;

public class Main {
	
	private Scanner sc;
	private MatrixCalculator calculator;
	
	public Main(){
		sc= new Scanner(System.in);
		calculator = new MatrixCalculator(InitModel.initModel());
		
	}

	public static void main(String[] args) {
		
		System.out.println("Welcome to the matrix calculator");
		Main ppal= new Main();

		
		int option=0;
		
		do{
			option= ppal.showMenu();
			ppal.executeOperation(option);
			
		}while (option!=0);
		
	}
	
	public int showMenu() {
		int option=0;

		System.out.println(
				"Main menu, please pick an option\n" +
				"(1) Create a matrix \n" +
				"(2) Show the contents of all matrices \n"+
				"(3) Numeric matrices\n"+
				"(4) String matrices\n" + 
				"(5) Register student\n"+
				"(6) Show all students names\n"+
				"(7) Show all students info\n"+
				"(8) Look up student\n"+ 
				"(9) Register the notes of a student \n"+
				"(0) To leave the application"
				);
		option= sc.nextInt();
		sc.nextLine();
		return option;
	}
	
	public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1:
			createMatrix();
			break;
		case 2:
			System.out.println(calculator.showMatrices());
			break;
	
		case 3:
			createNumericMatrix();
			break;

		case 4:
			createNumericMatrix();
			break;

		case 5:
			registerStudent();
		break;	

		case 6:
			System.out.println("========================================================\nALL STUDENTS NAMES\n"+calculator.showAllStudentsNames()+"\n");
		break;

		case 7:
			System.out.println("========================================================\nALL STUDENTS INFO\n"+calculator.organizeStudents()+"\n");
		break;

		case 8:
			lookUpStudent();
		break;
		
		case 9:
			option8();
			break;
		
		default:
			System.out.println("Error, wrong option");
		
		}
	

	}
	public void registerStudent(){
		System.out.println("Registering student");
		System.out.println("Enter the student's name");
		String name=sc.nextLine();

		System.out.println("Enter the student's age");
		int age= sc.nextInt();
		sc.nextLine();


		System.out.println("Enter the student's id");
		String id=sc.nextLine();
		System.out.println(calculator.addStudent(name, age, id));
	}

	private void createMatrix() {
		System.out.println("Please select the type of matrix \n (1) Numeric matrix\n (2) String's matrix");
		int type= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Please digit the number of rows");
		int rows= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Please digit the number of columns");
		int columns= sc.nextInt();
		sc.nextLine();
		
		System.out.println("new matrix");
		System.out.println(calculator.createMatrix(type, rows, columns));
	}
	
	public void createNumericMatrix() {
		
		int row, col, num;
		
		System.out.println("Digite el num de filas");
		row= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite el num de columnas");
		col= sc.nextInt();
		sc.nextLine();
		
		int [][] tmp= new int[row][col];

		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				System.out.println( "What is the number you want to register in the " + i + 
					" " + j + " pos");
				num= sc.nextInt();
				sc.nextLine();
				tmp[i][j]=num;
			}
		}
		calculator.addNumeric(tmp);
		
		
	}
	public void lookUpStudent(){
		System.out.println("Enter the student code of the person who is looking for the information");
		String id=sc.nextLine();
		System.out.println(calculator.lookUpStudent(id));
	}
	public void option8() {
		System.out.println("Enter the id of the student: ");
		String id = sc.nextLine();
		if (calculator.findStudent(id)!=null) {
			System.out.println("Enter the name of the first subject: ");
			String nameFirstSubject = sc.nextLine();
			System.out.println("Enter the number of credit of the subject: " +  nameFirstSubject);
			int creditsFirstSubject = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the name of the second subject: ");
			String nameSecondSubject = sc.nextLine();
			sc.nextLine();
			System.out.println("Enter the number of credit of the subject: " +  nameSecondSubject);
			int creditsSecondSubject = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the name of the third subject: ");
			String nameThirdSubject = sc.nextLine();
			System.out.println("Enter the number of credit of the subject: " +  nameThirdSubject);
			int creditsThirdSubject = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the name of the first note of all subject. ex: 'Parcial 1' ");
			String nameFistNote = sc.nextLine();
			System.out.println("Enter the name of the second note of all subject. ex: 'Parcial 2' ");
			String nameSecondNote = sc.nextLine();
			System.out.println("Enter the name of the third note of all subject. ex: 'Parcial 3' ");
			String nameThirdNote = sc.nextLine();
	
			//Notes of the first subject
			System.out.println("Enter note value of the subject " + nameFirstSubject + " of the note " + nameFistNote);
			double n00 = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter note value of the subject " + nameFirstSubject + " of the note " + nameSecondNote);
			double n10 = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter note value of the subject " + nameFirstSubject + " of the note " + nameThirdNote);
			double n20 = sc.nextDouble();
			sc.nextLine();
	
			//Note of the second subject
			System.out.println("Enter note value of the subject " + nameSecondSubject + " of the note " + nameFistNote);
			double n01 = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter note value of the subject " + nameSecondSubject + " of the note " + nameSecondNote);
			double n11 = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter note value of the subject " + nameSecondSubject + " of the note " + nameThirdNote);
			double n21 = sc.nextDouble();
			sc.nextLine();
	
			//Notes of the third subject
			System.out.println("Enter note value of the subject " + nameThirdSubject + " of the note " + nameFistNote);
			double n02 = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter note value of the subject " + nameThirdSubject + " of the note " + nameSecondNote);
			double n12 = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter note value of the subject " + nameThirdSubject + " of the note " + nameThirdNote);
			double n22 = sc.nextDouble();
			sc.nextLine();
	
			calculator.registerNoteInStudent(id, 0, 0, nameFistNote, n00, nameFirstSubject, creditsFirstSubject );
			calculator.registerNoteInStudent(id, 1, 0, nameSecondNote, n10, nameFirstSubject, creditsFirstSubject );
			calculator.registerNoteInStudent(id, 2, 0, nameThirdNote, n20, nameFirstSubject, creditsFirstSubject );
		
			calculator.registerNoteInStudent(id, 0, 1, nameFistNote, n01, nameSecondSubject, creditsSecondSubject );
			calculator.registerNoteInStudent(id, 1, 1, nameSecondNote, n11, nameSecondSubject, creditsSecondSubject );
			calculator.registerNoteInStudent(id, 2, 1, nameThirdNote, n21, nameSecondSubject, creditsSecondSubject );
	
			calculator.registerNoteInStudent(id, 0, 2, nameFistNote, n02, nameThirdSubject, creditsThirdSubject );
			calculator.registerNoteInStudent(id, 1, 2, nameSecondNote, n12, nameThirdSubject, creditsThirdSubject );
			calculator.registerNoteInStudent(id, 2, 2, nameThirdNote, n22, nameThirdSubject, creditsThirdSubject );
		} else {
			System.out.println("The student hasn't been found");
		}
		
	}

}
