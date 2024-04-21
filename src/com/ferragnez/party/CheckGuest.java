package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
	
	/* nome repo: java-festa-ferragnez
State lavorando col servizio di sicurezza dei Ferragnez e il vostro compito è di assicurarvi 
che accedano alla festa solo gli invitati presenti sulla lista
Nel programma bisogna: creare e inizializzare l’array contenente i nomi degli invitati 
chiedere all’utente come si chiama e  verificare che il nome sia presente nella lista; 
lasciarlo entrare o rispedirlo cortesemente da dove è venuto 
Lista invitati: Dua Lipa, Paris Hilton, Manuel Agnelli, J-Ax, Francesco Totti, Ilary Blasi, Bebe Vio, Luis, Pardis Zarei, Martina Maccherone, Rachel Zeilic */
	
	public static void main (String [] args ) {
		
		//prepariamo l'input da tastiera 
		Scanner input = new Scanner(System.in); 
		
		//inizializzare l'array di invitati
		String [] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti","Ilary Blasi", "Bebe Vio","Luis","Pardis Zarei", "Martina Maccherone","Rachel Zeilic" };
				
		
	    //chiedere all'utente il suo nome e cognome		
		System.out.println("Se vuoi partecipare alla festa esclusiva devi prima darci il tuo nome e cognome");
		String invitato = input.nextLine();
		  		
		//verificare se il nome è presente nella lista degli invitati con ciclo for	
	
		for (int i = 0; i<invitati.length; i++) {
			
           //System.out.println(invitati[i]);
			
		
		    if (invitati[i].contains(invitato)) {
				System.out.println("complimenti sei stato invitato");
				break;
			} 
			
			if(i == invitati.length-1) {
				System.out.println("Non sei stato invitato");
			}
		}
	
		
		
	
	}
	
}



/* --------------CORREZIONE ESERCIZIO ----------------
1) EQUALS era meglio perché controlla se il contenuto è equivalente a quello contenuto
nella cella di memoria, mentre CONTAINS guarda anche i sottoinsiemi

2) ci salviamo una variabile booleana fuori dal ciclo for
  
        boolean ammesso = false;
  
        for (int i = 0; i<invitati.length; i++) {           		
				if (invitati[i].equals(invitato)) {
				ammesso = true;
				break;
			} 		
			
		}
		
		if(trovato) {
		  System.out.println("complimenti sei stato invitato");
		} else{
		   System.out.println("complimenti sei stato invitato");		
		}
 
  Salvare un valore in una variabile fuori dal ciclo for, permette maggiore flessibilità nel codice 
  e di usare la variabile anche al di fuori del ciclo 
  
  
 3) alla fine della parte di codice con cui ci serve interagire con la tastiera, il canale di comunicazione
    con la tastiera aperto da Scanner va chiuso:  Scanner = input.close;
  
  
 */


