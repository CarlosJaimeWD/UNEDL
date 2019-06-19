/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_pviii_parcial2;

import java.util.Stack;
import java.util.Arrays; 


/**
 *
 * @author carlosjaime
 */
public class Examen_PVIII_Parcial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String array[] = {"({){}({()}", "{(){((())}", "{({()()}})", "{()()}{()}"};
    Boolean correcto;
    Stack<Character> stack = new Stack<Character>();

    char c;
    int i;
        for (String key : array) {
            correcto = true;
            for(i=0; i < key.length(); i++) {
                c = key.charAt(i);

                if(c == '(') {
                    stack.push(c);
                } else if(c == '{') {
                    stack.push(c);
                } else if(c == ')') {
                    if(stack.empty()) {
                        correcto =  false;
                    } else if(stack.peek() == '(') {
                        stack.pop();
                    } else {
                        correcto =  false;
                    }
                }else if(c == '}') {
                    if(stack.empty()) {
                        correcto =  false;
                    }else if(stack.peek() == '{') {
                        stack.pop();
                    } else {
                        correcto =  false;
                    }
                }
            }
            System.out.print(key);
            System.out.println(", Corrrecto: " + correcto);
            stack.empty();
        }
    }
    
}
