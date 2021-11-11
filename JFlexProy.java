/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validarsintaxis;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



/**
 *
 * @author maast
 */
public class JFlexProy {
/*    
public static void generarLexer(String ruta){
        
    File archivo =new File(ruta);
     JFlex.Main.generate(archivo);
    
   
        
        }     */  

public static void generar() throws IOException, Exception{
String rutaProy = "/Users/maast/Documents/NetBeansProjects/AnalizadorLexico";
String[] ruta1 = {rutaProy+"/src/validarsintaxis/Lexer.flex"};
String[] ruta2 = {rutaProy+"/src/validarsintaxis/LexerCup.flex"};
String[] rutaS = {"-parser", "Sintax", rutaProy+"/src/validarsintaxis/Sintax.cup"};
JFlex.Main.generate(ruta1);
JFlex.Main.generate(ruta2);
java_cup.Main.main(rutaS);
Path rutaSym = Paths.get(rutaProy+"/src/validarsintaxis/sym.java");
if (Files.exists(rutaSym)) {
Files.delete(rutaSym);
}
Files.move(
Paths.get(rutaProy+"/sym.java"),
Paths.get(rutaProy+"/src/validarsintaxis/sym.java")
);
Path rutaSin = Paths.get(rutaProy+"/src/validarsintaxis/Sintax.java");
if (Files.exists(rutaSin)) {
Files.delete(rutaSin);
}
Files.move(
Paths.get(rutaProy+"/Sintax.java"),
Paths.get(rutaProy+"/src/validarsintaxis/Sintax.java")
);
}


   



    public static void main(String[] args) throws Exception {
          System.out.println("Generando Archivos Lexers");
 /*         
 String ruta="C:/Users/maast/Documents/NetBeansProjects/AnalizadorLexico/src/validarsintaxis/Lexer.flex";
 generarLexer(ruta); */
       
          
          
       
try{
generar();
}catch(Exception e){
throw new Exception("Error al generar Archivo Lexer");
}  






    }
  
    
    
}
