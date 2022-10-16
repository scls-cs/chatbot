import py4j.GatewayServer;

public class MagpieEntryPoint {

    private Magpie maggie;

    public MagpieEntryPoint() {
        maggie = new Magpie();
    }

    public Magpie getMaggie() {
        return maggie;
    }

    public static void main(String[] args) {
        GatewayServer gatewayServer = new GatewayServer(new MagpieEntryPoint());
        gatewayServer.start();
        System.out.println("Gateway Server Started");
    }

}