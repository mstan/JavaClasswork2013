/*
 * Matthew Stanley
 * CSCI 1104 4.3 - p 227
 * LetterGrade.java
 */

public class LetterGrade {
   
   //Private values
   private int SCORE;
   private char letter = ' ';
   private char excellent = 'A';
   private char aboveAverage = 'B';
   private char average = 'C';
   private char belowAverage = 'D';
   private char fail = 'F';
   
   
  public String LetterGrade (int SCORE) {
  //Score
  this.SCORE = SCORE;

  
 //F letter grade
 if (this.SCORE < 70) {
   this.letter = fail;
 }
 // D letter grade
 if (this.SCORE >= 70) {
   this.letter = belowAverage;
 }
 // C Letter grade
 if (this.SCORE >= 77) {
   this.letter = average;
 }
 // B Letter grade
 if (this.SCORE >= 85) {
   this.letter = aboveAverage;
 }
 // A Letter Grade
 if (this.SCORE >= 93) {
   this.letter = excellent;
 }
 
 String grade = "Your Grade: " + letter;
 
 
 System.out.println(grade);
 return grade;
  }
  
}