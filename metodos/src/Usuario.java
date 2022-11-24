public class Usuario {
    public static void main(String[] args) throws Exception {
        SmarTv smarTv = new SmarTv();

        String on = smarTv.on == true ? "Sim" : "Não";

        System.out.println("A televisão está ligada? " + on);
        System.out.println("O canal atual é: " + smarTv.channel);
        System.out.println("Está no volume: " + smarTv.volume);

    }
}
