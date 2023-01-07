public class Usuario {
    public static void main(String[] args) {
        SmartTv objsmartTv = new SmartTv();


        System.out.println("Canal Atual: " + objsmartTv.canal);
        objsmartTv.aumentarCanal();
        // digite o canal que você deseja mudar
        objsmartTv.mudarCanal(13);


        System.out.println("TV Ligada ? " + objsmartTv.ligada);
        System.out.println("Canal Atual: " + objsmartTv.canal);
        System.out.println("Volume Atual: " + objsmartTv.volume);

        objsmartTv.ligar();
        System.out.println("Novo Status -> TV Ligada ? " + objsmartTv.ligada);

        objsmartTv.desligar();
        System.out.println("Novo Status -> TV Ligada ? " + objsmartTv.ligada);
    }
}
