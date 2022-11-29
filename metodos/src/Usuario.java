public class Usuario {
    public static void main(String[] args) throws Exception {
        SmarTv smarTv = new SmarTv();

        smarTv.turnOn();

        String on = smarTv.on == true ? "Sim" : "Não";

        System.out.println("A televisão está ligada? " + on);
        System.out.println("O canal atual é: " + smarTv.channel);
        System.out.println("Está no volume: " + smarTv.volume);

        smarTv.turnUpVolume();
        System.out.println("Depois de aumentar o volume ficou em: " + smarTv.volume);

        smarTv.changeChannel(5);
        System.out.println("o canal foi alterado para o: " + smarTv.channel);

    }
}
