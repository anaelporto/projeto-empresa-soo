package br.unesp.rc.Arvore;

public class Node {
    
    String question;
    String a1;
    String a2;
    String quota;
    Node answer1;
    Node answer2;
    
    Node(){
        this.question = null;
        this.a1 = null;
        this.a2 = null;
        this.quota = null;
        this.answer1 = null;
        this.answer2 = null;
    }
    
    public void insertQuestion(String question, String a1, String a2){
        this.question = question;
        this.a1 = a1;
        this.a2 = a2;
        this.answer1 = new Node();
        this.answer2 = new Node();
    }
    
    public void insertQuota(String quota){
        this.quota = quota;
    }
}
