public class Vizualização {
    
    private Gafanhoto espectador;
    private Video video;

    public Vizualização(Gafanhoto espectador, Video video) {
        this.espectador = espectador;
        this.video = video;
        this.espectador.viuMaisUm();
        this.video.setViews(this.video.getViews() + 1);
    }

    public void avaliar(){
        this.video.setAvaliacao(this.video.getAvaliacao() + 5);
    }
    public void avaliar(int nota){
        this.video.setAvaliacao(this.video.getAvaliacao() + nota);
    }
    public void avaliar(float porcentagem){
        int total = 0;
        if(porcentagem <= 20){
            total = 3;
        } else if (porcentagem <= 50){
            total = 5;
        }else if (porcentagem <= 90){
            total = 8;
        } else {
            total = 10;
        }
        this.video.setAvaliacao(this.video.getAvaliacao() + total);
    }
    public Gafanhoto getEspectador() {
        return espectador;
    }
    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }
    public Video getVideo() {
        return video;
    }
    public void setVideo(Video video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "Vizualização [espectador=" + espectador + ", video=" + video + "]";
    }
}
