
import java.util.Scanner;
public class lab8 {
	public static void main(String[]args) {
	String name;
	String ans;
	String yes = "yes";
	System.out.println("Welcome to the CS1101 quiz!");
 	System.out.println("What's your name?");
	Scanner scnr = new Scanner(System.in);
	name = scnr.nextLine();
	System.out.println(name + ", would you like to take the quiz, yes or no?");
	ans = scnr.nextLine();
	
		if (ans.equals(yes)) {
			System.out.println("The quiz will consist of 10 questions and after each question will let you know if you are right or wrong.");
		}else{
			System.out.println("Get out of my quiz >:c");
		}
	System.out.println("Question 1: What is the following variable's name?");
	String q1;
	String tibi = "tibi";
	System.out.println("int tibi = 12;");
	q1 = scnr.nextLine();
		if (q1.equals(tibi)) {
			System.out.println("right C:");
		}else{
			System.out.println("wrong :c");
		}
	System.out.println("Question 2: A constant variable is also known as a final variable, true2 or false2?");
	String true2 = "true2";
	String q2;
	q2 = scnr.nextLine();
		if (q2.equals(true2)) {
			System.out.println("correct");
		}else{
			System.out.println("lol you're wrong");
		}
	System.out.println("Question 3: What will print out, after the following loop executes?");
	System.out.println("int x = 10");
	System.out.println("int b = 12");
	System.out.println("while (b  > x){"); 
	System.out.println("System.out.print( x + 3);");
	String q3;
	String o = "13";
	q3 = scnr.nextLine();
	if (q3.equals(o)){
		System.out.println("right ^u^");
	}else {
		System.out.println("wrong");
	}
	System.out.println("Question 4: By what number will the following loop be incremented by?");
	System.out.println("for (i=0; i<str.length; i+3)");
	String q4;
	String x = "3";
	q4 = scnr.nextLine();
	if (q4.equals(x)){
		System.out.println("correct");
	}else{
		System.out.println("no, you're wrong");
	}
	System.out.println("Question 5: What the name of each item in an array referred to?");
	String q5;
	q5 = scnr.nextLine();
	String element = "element";
	if (q5.equals(element)) {
		System.out.println("right");
	}else{
		System.out.println("no :c");
	}
	System.out.println("Question 6: What element is the following array referring to?");
	System.out.println("extraCredit[10] = 12;");
	String q6;
	String b = "10";
	q6 = scnr.nextLine();
	if (q6.equals(b)){
		System.out.println(":D correct");
	}else{
		System.out.println("no, :I");
	}
	System.out.println("Question 7: The following will run, under the condition if x =?");
	System.out.println("if (x = 12){");
	String q7;
	String z = "12";
	q7 = scnr.nextLine();
	if (q7.equals(z)){
		System.out.println("true");
	}else{
		System.out.println("no, your answer is cancer my soul :c");
	}
	System.out.println("Question 8: Boolean data types are not a type of conditional, true or false?");
	String q8;
	String p = "false";
	q8 = scnr.nextLine();
	if (q8.equals(p)){	
		System.out.println("correct ");
	}else{
		System.out.println("no TnT");
	}
	
	System.out.println("Question 9: A switch statement is a type of conditional, true or false?");
	String q9;
	String d = "true";
	q9 = scnr.nextLine();
	if (q9.equals(d)){
		System.out.println("right");
	}else{
		System.out.println("no :c");
	}
	
	System.out.println("Question 10: The following will run, under the condition if x = what number?");
	System.out.println(" x = 2");
	System.out.println("y = 3");
	System.out.println("b = y");
	System.out.println("c = 4");
	System.out.println("z = b + 3");
	System.out.println("c = 6");
	System.out.println("n = c - 3");
	System.out.println("t = y + 3");
	System.out.println("x = t");
	System.out.println("if (x = c) {");
	String q10;
	String a = "6";
	String k = "t";
	q10 = scnr.nextLine();
	if (q10.equals(a) || q10.equals(k)){
		System.out.println("right ^o^");
	}else{
		System.out.println("no u_u");
	}
return;
	}
}