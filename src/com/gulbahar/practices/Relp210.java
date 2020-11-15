package com.gulbahar.practices;

public class Relp210 {
	
public static void gradeCheck(int grade) throws SyntaxStudentException {
        
        if(grade>90) {
            throw new SyntaxStudentException("You are an exceptionally awesome student");
        }else if(grade<90) {
            System.out.println("You are a great student");
        }
    }
    public static void main(String[] args) {
        
        try {
            gradeCheck(92);
        } catch (SyntaxStudentException e) {
            
            System.out.println(e);
        }
    }
}
class SyntaxStudentException extends Exception{
    public SyntaxStudentException(String message) {
        super(message);
    }
}
    

