package projetoyoutube;
public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("10 melhores brigas de anime");
        v[1] = new Video("Gaara vs Rock Lee");
        v[2] = new Video("5 horas de parabéns para você");
        
        Perfil p[] = new Perfil[2];
        p[0] = new Perfil("Miro", 18, "M", "miro.no");
        p[1] = new Perfil ("Dani", 19, "F", "afamosa.dani");
          
        
        System.out.println(v[0].toString());
        System.out.println(p[0].toString());
    }
    
}
