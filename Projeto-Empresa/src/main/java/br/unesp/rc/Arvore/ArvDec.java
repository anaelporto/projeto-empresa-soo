package br.unesp.rc.Arvore;

public class ArvDec {
    public static void main(String args){
        Tree decisionTree = new Tree();
        Node node = new Node();
        String q;
        String a1;
        String a2;
        
        node = decisionTree.root;
        
        q = "Qual o porte do sistema?";
        a1 = "Grande";
        a2 = "Pequeno";
        node.insertQuestion(q, a1, a2);
        node = node.answer1;
        
        q = "Voce possui servidor proprio?";
        a1 = "Sim";
        a2 = "Nao";
        node.insertQuestion(q, a1, a2);
        node = node.answer1;
        
        q = "O sistema precisa ser feito rapidamente?";
        a1 = "Sim";
        a2 = "Nao";
        node.insertQuestion(q, a1, a2);
        node = node.answer1;
        
        q = "   Valor estimado: R$25.000\n  Tempo estimado: 4 meses";
        node.insertQuota(q);
        
        node = decisionTree.root.answer1.answer1.answer2;
        q = "   Valor estimado: R$15.000\n  Tempo estimado: 7 meses";
        node.insertQuota(q);
        
        node = decisionTree.root.answer1.answer2;
        q = "O sistema precisa ser feito rapidamente?";
        a1 = "Sim";
        a2 = "Nao";
        node.insertQuestion(q, a1, a2);
        node = node.answer1;
        
        q = "   Valor estimado: R$28.000\n  Tempo estimado: 4 meses";
        node.insertQuota(q);
        
        node = decisionTree.root.answer1.answer2.answer2;
        q = "   Valor estimado: R$18.000\n  Tempo estimado: 7 meses";
        node.insertQuota(q);
        
        node = decisionTree.root.answer2;
        q = "O sistema vai precisar de backend?";
        a1 = "Sim";
        a2 = "Nao";
        node.insertQuestion(q, a1, a2);
        node = node.answer1;
        
        q = "Voce possui servidor proprio?";
        a1 = "Sim";
        a2 = "Nao";
        node.insertQuestion(q, a1, a2);
        node = node.answer1;
        
        q = "O sistema precisa ser feito rapidamente?";
        a1 = "Sim";
        a2 = "Nao";
        node.insertQuestion(q, a1, a2);
        node = node.answer1;
        
        q = "   Valor estimado: R$10.000\n  Tempo estimado: 2 meses";
        node.insertQuota(q);
        
        node = decisionTree.root.answer2.answer1.answer1.answer2;
        q = "   Valor estimado: R$6.000\n  Tempo estimado: 4 meses";
        node.insertQuota(q);
        
        node = decisionTree.root.answer2.answer1.answer2;
        q = "O sistema precisa ser feito rapidamente?";
        a1 = "Sim";
        a2 = "Nao";
        node.insertQuestion(q, a1, a2);
        node = node.answer1;
        
        q = "   Valor estimado: R$12.000\n  Tempo estimado: 2 meses";
        node.insertQuota(q);
        
        node = decisionTree.root.answer2.answer1.answer2.answer2;
        q = "   Valor estimado: R$8.000\n  Tempo estimado: 4 meses";
        node.insertQuota(q);
        
        node = decisionTree.root.answer2.answer2;
        q = "Voce possui servidor proprio?";
        a1 = "Sim";
        a2 = "Nao";
        node.insertQuestion(q, a1, a2);
        node = node.answer1;
        
        q = "O sistema precisa ser feito rapidamente?";
        a1 = "Sim";
        a2 = "Nao";
        node.insertQuestion(q, a1, a2);
        node = node.answer1;
        
        q = "   Valor estimado: R$5.000\n  Tempo estimado: 1 mes";
        node.insertQuota(q);
        
        node = decisionTree.root.answer2.answer2.answer1.answer2;
        q = "   Valor estimado: R$3.000\n  Tempo estimado: 2 meses";
        node.insertQuota(q);
        
        node = decisionTree.root.answer2.answer2.answer2;
        q = "O sistema precisa ser feito rapidamente?";
        a1 = "Sim";
        a2 = "Nao";
        node.insertQuestion(q, a1, a2);
        node = node.answer1;
        
        q = "   Valor estimado: R$7.000\n  Tempo estimado: 1 mes";
        node.insertQuota(q);
        
        node = decisionTree.root.answer2.answer2.answer2.answer2;
        q = "   Valor estimado: R$5.000\n  Tempo estimado: 2 meses";
        node.insertQuota(q);
        
        decisionTree.percorrer();   
    }
}
