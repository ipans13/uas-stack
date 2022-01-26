/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Stack;

/**
 *
 * @author rivan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        nama rivan = new nama("Rivan","Setiawan");
        nama adam = new nama("Adam","Hamzah");
        nama indah = new nama("Indah","Setiani");
        nama boboiboy = new nama("Boboiboy","Gempa");
        nama upin = new nama("upin","ipin");
        
        arrstack stack = new arrstack();
        
        stack.push(rivan);
        stack.push(adam);
        stack.push(indah);
        stack.push(boboiboy);
        stack.push(upin);
        
        stack.printStack();
        
        System.out.println("============================");
        System.out.println(stack.peek());
        stack.pop();
        
        System.out.println("================================");
        
        stack.printStack();
        
        
    }
    

    }
    
