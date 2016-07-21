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
    String temp = "12+4*3+";
    StackArrayList<String> stack = new StackArrayList();
    
    
    public calculadora() {
        for (int i = 0; i < temp.length(); i++) {
            stack.push(temp.charAt(i));
        }
    }
    
    public double eval() {
        while (stack.size() != 1) {
            switch (stack.peek()) {
                case "+":
                    stack.push(String.valueOf(stack.pop()) + String.valueOf(stack.pop()));
                    break;
            }
        }
    }
}
