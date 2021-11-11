package validarsintaxis;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maast
 */
public class validarSintaxis {
  
    final String regex = "esto.+";
final String string = "hola mundo\n"
+ "esto es una prueba\n"
+ "hola jovenes\n"
+ "probando un compilador\n"
+ "esto esta en chino\n\n" ;
String resultado;

public String validar(String cadena,String expresion){

final Pattern pattern = Pattern.compile(expresion, Pattern.MULTILINE);
final Matcher matcher = pattern.matcher(cadena);


while (matcher.find()) {
System.out.println( "Full match: " + matcher.group( 0));
for (int i = 1; i <= matcher.groupCount(); i++) {
System.out.println( "Group " + i + ": " + matcher.group(i));
}
}
    
    
    
 return resultado;   
}
    
    
}
