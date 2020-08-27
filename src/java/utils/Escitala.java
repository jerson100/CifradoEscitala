package utils;

/**
 *
 * @author JERSON
 */
public class Escitala {

    public static String cifrar(String message, int filas){
        int longitud = message.length();
        String rspt = "";
        String[][] m = new String[filas][longitud / filas + (longitud % filas > 0  ? 1 : 0)];
        int c  = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = String.valueOf(message.charAt(c++));
                System.out.print(m[i][j]+"\t");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < m[0].length; i++) {
            for (int j = 0; j < m.length; j++) {
                rspt+= m[j][i];
            }
        }
        return rspt;
    }
    
    public static String descrifrar(String message, int filas){
        
        int longitud = message.length();
        
        String[][] m = new String[filas][longitud / filas + (longitud % filas > 0  ? 1 : 0)];
        
        int pos = 0;
        
        for (int i = 0; i < m[0].length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[j][i] = String.valueOf(message.charAt(pos++));
            }
        }
        
        String rspt =  "";
        for (String[] f : m) {
            for (String c : f) {
                rspt+=c;
            }
        }
        
        return rspt;
        
    }
    
    public static void main(String[] args) {
        String txt = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme";
        int filas = 6;
        String cifrado = cifrar(txt, filas);
        System.out.println("texto: "+txt);
        System.out.println("filas: "+filas);
        System.out.println("cifrado: "+cifrado);
        System.out.println("descifrado: "+descrifrar(cifrado, filas)); 
    }
    
}
