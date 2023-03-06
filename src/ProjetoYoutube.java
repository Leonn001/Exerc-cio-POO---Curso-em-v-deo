public class ProjetoYoutube {
    public static void main(String[] args) {
        
        Video v[] = new Video[3];
        v[0] = new Video("Teoria One Piece");
        v[1] = new Video("Review do capitulo 1023");
        v[2] = new Video("Aula de POO com java");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Leon", 18, "masculino", "Trafalgar");
        g[1] = new Gafanhoto("Cleide", 22, "feminino", "Jujuba");


        Vizualização vizualização[] = new Vizualização[3];
        vizualização[0] = new Vizualização(g[0], v[0]);
        vizualização[0].avaliar(6);
        System.out.println(vizualização[0].toString());
        

        vizualização[1] = new Vizualização(g[1], v[0]);
        vizualização[1].avaliar(87.0f);
        System.out.println(vizualização[1].toString());

        vizualização[2] = new Vizualização(g[1], v[1]);
        vizualização[2].avaliar();
        System.out.println(vizualização[2].toString());
    }
}
