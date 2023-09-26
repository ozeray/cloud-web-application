public class Application {
    private static final int DEFAULT_PORT = 8080;

    public static void main(String[] args) {
        int port = DEFAULT_PORT;
        if (args.length == 1) {
            port = Integer.parseInt(args[0]);
        }

        WebServer webServer = new WebServer(port);

        webServer.startServer();
    }
}
