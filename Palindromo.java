/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validarsintaxis;

/**
 *
 * @author maast
 */
public class Palindromo {
  public static boolean checkpalindrome(String frase){
      String invertido=""; boolean retorno;
  for(int i=frase.length()-1; i>0; i--){
  invertido+=frase.charAt(i);
  }
      System.out.println(invertido);   
  if(frase.equalsIgnoreCase(invertido)){
  retorno=true;    
  }    
  else{
  retorno=false;
  }    
   
  return retorno;
  }  
  
    
  
}
