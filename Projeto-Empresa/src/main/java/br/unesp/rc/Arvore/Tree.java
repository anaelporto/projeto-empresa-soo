package br.unesp.rc.Arvore;

import java.util.Scanner;

public class Tree {
    
    Node root;
    
    Tree(){
        this.root = new Node();
    }
    
    public void printar(Node atual){
        System.out.println(atual.question);
        System.out.println(" ");
        System.out.println("1: " + atual.a1);
        System.out.println("2: " + atual.a2);
        System.out.println(" ");
        System.out.print("Qual a resposta? ");
    }
    
    public void percorrer(){
        
        int escolha;
        Scanner leitor = new Scanner(System.in);
        Node atual = this.root;
        
        printar(atual);
        escolha = leitor.nextInt();
        
        if(escolha == 1){
            atual = atual.answer1;
        } else {
            atual = atual.answer2;
        }
        
        while(atual.quota == null){
            printar(atual);
            escolha = leitor.nextInt();
            
            if(escolha == 1){
                atual = atual.answer1;
            } else {
                atual = atual.answer2;
            }
        }
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(atual.quota);
         
    }
    
}
