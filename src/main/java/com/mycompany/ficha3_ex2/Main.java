/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ficha3_ex2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vitor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        LinkedStack t = new LinkedStack();
        int teste = 0;
        //escolher o numero do teste
        switch (teste) {
            case 0:
                //teste de adicionar 1
                t.push(1);
                t.push(2);

                System.out.println("Teste de  adicionar" + t.toString());
                break;
            case 1: {
                try {
                    // remover sem ter nada
                    t.pop();
                } catch (EmptyCollectionException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case 2:
                //remover um item quando ele existe
                t.push(1);
                System.out.println("Teste de  adicionar" + t.toString());
                 {
                    try {
                        t.pop();
                        System.out.println("Teste de  remover" + t.toString());
                    } catch (EmptyCollectionException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            case 3: {
                try {
                    //teste do peek quando o array esta vazio
                    t.peek();
                    System.out.println("Teste do peek quando o array esta vazio" + t.toString());
                } catch (EmptyCollectionException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;

            case 4: {
                try {
                    //teste do peek quando tem 1 elemtento
                    t.push(1);
                    System.out.println(t.peek());
                    System.out.println("Teste do peek quando tem um elemtento" + t.toString());
                } catch (EmptyCollectionException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;

            case 5: {
                try {
                    //teste do peek quando tem muitos elemtento
                    t.push(33);
                    t.push(2);
                    t.push(3);
                    t.push(4);
                    t.push(5);
                    System.out.println(t.peek());
                    System.out.println("Teste do peek quando tem muitos elemtento" + t.toString());
                } catch (EmptyCollectionException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case 6: {
                t.push(1);
                t.push(2);
                System.out.println(t.toString());
                t.push(3);
                System.out.println(t.toString());
            }
            break;

        }

    }
    
}
