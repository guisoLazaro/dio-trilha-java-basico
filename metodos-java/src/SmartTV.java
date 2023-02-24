public class SmartTV {
    public Boolean ligada;
    public Integer canal;
    public Integer volume;

    public SmartTV()
    {

    }
    public SmartTV(Boolean ligada, Integer canal, Integer volume) {
        this.ligada = ligada;
        this.canal = canal;
        this.volume = volume;
    }

    public Boolean getLigada() {
        return ligada;
    }

    public void setLigada(Boolean ligada) {
        this.ligada = ligada;
    }

    public Integer getCanal() {
        return canal;
    }

    public void setCanal(Integer canal) {
        this.canal = canal;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public void aumentarVolume()
    {
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public Integer escolherCanall(Integer trocaCanal){
        canal = trocaCanal;
        return canal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }


    public void ligarTV(){
        ligada = true;
    }
    public void desligarTV(){
        ligada = false;
    }
}
