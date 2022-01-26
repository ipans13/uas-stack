/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

import java.util.EmptyStackException;

/**
 *
 * @author rivan
 */
public class arrstack {
    private nama[] stack;
    private int atas;
    
    public arrstack (){
    stack = new nama[5];
    }
    public void push (nama Nama){
    stack[atas++] = Nama;
    }
    public nama pop(){
    if(isEmpty()){
        throw new EmptyStackException();
    }
    nama Nama = stack[--atas];
    stack[atas] = null;
    return Nama;
    }
    public nama peek(){
    if(isEmpty()){
        throw new EmptyStackException();
    }
    return stack[atas-1];
   }
    public boolean isEmpty(){
    return atas == 0;
    }
    public int size(){
        return atas;
    }
    public void printStack(){
    for(int i = atas-1; i>=0; i--){
        System.out.println(stack[i]);
    }
    }
}
