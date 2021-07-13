import java.io.File;

public class MainClass {
    public static void main(String[] args) {
        File certificate = new File("C:\\Users\\DELL\\Downloads\\mahindradealerworld-com-chain.pem");
        String peerCertificate = PeerCertificateExtractor.extract(certificate);
        System.out.println("SSL CERT KEY: " + peerCertificate);
    }
}
