package tarea1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaesarCrypth {//begin class

	public static void main(String[] args) throws NumberFormatException, IOException {//begin main
		// TODO make mixed case of caesar and the hebrew one

		System.out.println("Codificador de texto. Metodo Cesar");
		char []abc = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String input="";
		int key;
		int option=0;;
		int aux=0;
		char encrypted[];

		System.out.println("Elija porfavor el procedimiento que desea");
		System.out.println("1: Codificar     |    2: Decodificar");
		//begin switch-case
		BufferedReader optionselec= new BufferedReader(new InputStreamReader(System.in));
		option =Integer.parseInt(optionselec.readLine());

		switch(option) {
		case 1://begin first case
		System.out.println("Porfavor indique la clave de codificacion: ");
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        key = Integer.parseInt(reader.readLine());//get codify key
        System.out.println("Ingrese Palabra a codificar");
        BufferedReader lineread = new BufferedReader(new InputStreamReader(System.in));
        input=lineread.readLine();//get word to codify
        encrypted= new char[input.length()];//save it in a char array
				encrypted=input.toCharArray();//<- saved!

				for (int i = 0; i < encrypted.length; i++) {//first run this for wich will cover the whole word to encode
						for (int j= 0; j < abc.length; j++) {//here we will codify the word
								if(encrypted[i]==abc[j]) {//here it finds the letter in the alphabet stored in abc,
										aux=j+key;//saves the key into a auxiliar variable
											if(aux>abc.length) {//deal with wrap around
													aux-=26;
													}
												encrypted[i]=abc[aux];//saves the new letter into the selected space
												break;//returns to the first for
											}
										}
									}

									System.out.println("Su palabra Codificada es: \n");
									for (int i = 0; i < encrypted.length; i++) {
										System.out.print(encrypted[i]);//here it prints the encoded word in order
									}
									break;//end first case
		case 2://begin second case
			System.out.println("Porfavor indique la clave de codificacion: ");
	        BufferedReader readerer =
	                new BufferedReader(new InputStreamReader(System.in));
	        	key = Integer.parseInt(readerer.readLine());//get codify key
	        	System.out.println("Ingrese Palabra a codificar");
	        	BufferedReader linereaded = new BufferedReader(new InputStreamReader(System.in));
	        input=linereaded.readLine();//get word to codify
	        encrypted= new char[input.length()];//save it in a char array
					encrypted=input.toCharArray();//<- saved!
					for (int i = 0; i < encrypted.length; i++) {//first run this for wich will cover the whole word to encode
						for (int j= 0; j < abc.length; j++) {//here we will codify the word
							if(encrypted[i]==abc[j]) {//here it finds the letter in the alphabet stored in abc,
								aux=j-key;//saves the key into a auxiliar variable
								if(aux<abc.length) {//deal with wrap around
									aux+=26;
								}
						encrypted[i]=abc[aux];//saves the new letter into the selected space
						break;//returns to the first for
					}
				}
			}
			System.out.println("Su palabra Codificada es: \n");
			for (int i = 0; i < encrypted.length; i++) {
				System.out.print(encrypted[i]);//here it prints the encoded word in order
			}
			break;//end second case
	}//end switch-case
	}//end main
}//end class
