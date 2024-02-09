package dsdevl1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        new ConnectWindow(new LogHandler("./dsdevl_1_Log"));
    }
}