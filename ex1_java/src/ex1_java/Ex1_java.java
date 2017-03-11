
package ex1_java;

import info.infomila.af.TipusPropietat;

public class Ex1_java {

    public static void main(String[] args) {
       TipusPropietat [] taula = new TipusPropietat[6];
       taula[0]=new TipusPropietat("Casa");
       taula[2]=new TipusPropietat("Pis");
       taula[4]=new TipusPropietat("Atic");
       taula[1]=null;taula[3]=null;taula[5]=null;
       
        for (int i = 0; i < taula.length; i++) {
            if(taula[i]!=null){
                System.out.println(taula[i]);
            }else{
                System.out.println("Tipus Porpietat: Inexistent");
            } 
        }
        TipusPropietat a1 = new TipusPropietat("Pis");
        int pos=-1;
        for (int i = 0; i < taula.length; i++) {
            if(a1.equals(taula[i])){
                pos=i;
            } 
        }
        if (pos!=-1) {
            System.out.println(a1+" es troba  en la posicio "+pos);
        }else{
            System.out.println("no es troba la propietat");
        }
        
        TipusPropietat a2 = new TipusPropietat("Garatge");
        pos=-1;
        for (int i = 0; i < taula.length; i++) {
            if(a2.equals(taula[i])){
                pos=i;
            } 
        }
         if (pos!=-1) {
            System.out.println(a2 +" es troba  en la posicio "+pos);
        }else{
            System.out.println(a2+" no es troba a la taula");
        }
       
    }
    
}
