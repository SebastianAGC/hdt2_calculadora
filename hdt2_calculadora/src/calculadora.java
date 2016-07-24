/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class calculadora {
    StackArrayList<Double> stack = new StackArrayList();
    
    
    public calculadora() {
    }
    
    //Funcion para evaluar el postfix
    public double eval(String s) {
        //Se recorre el string caracter por caracter
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            //Si el caracter es un digito, se agrega el stack
            if (Character.isDigit(ch)) {
                stack.push(Double.parseDouble(Character.toString(ch)));
            } else {
                //Si el caracter no es un digito, se ralizan las operaciones con los numeros en el stack
                switch (ch) {
                    case '+':
                        stack.push(stack.pop() + stack.pop());
                        break;
                    case '-':
                        stack.push(stack.pop() - stack.pop());
                        break;
                    case '*':
                        stack.push(stack.pop() * stack.pop());
                        break;
                    case '/':
                        stack.push(stack.pop() / stack.pop());
                        break;
                }
            }
        }
        return stack.peek();
    }
}
