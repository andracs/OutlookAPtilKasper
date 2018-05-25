package dk.acsandras.outlookapipoc;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Arbejdsplan {

    public List dagens = new ArrayList<Besog>();     // Den indeholder dagens besøg
    List helePlanen = new ArrayList<Besog>(); // Den indeholder alle planer

    public Arbejdsplan() {
        this.hentDatafraOutlook();
    }

    public List dummy() {
        Besog b1 = new Besog();
        Besog b2 = new Besog();
        Besog b3 = new Besog();

        try  {
            b1.setStartDateTime(new SimpleDateFormat("yyyyMMdd hhmm" ).parse("20170525 0800"));
            b1.setBodyContent("Gerda Hansen");
            b1.setLocation("Femøvej 2, Næstved");
            b2.setStartDateTime(new SimpleDateFormat("yyyyMMdd hhmm" ).parse("20170525 0900"));
            b2.setBodyContent("Gerda Hansen");
            b2.setLocation("Femøvej 2, Næstved");
            b3.setStartDateTime(new SimpleDateFormat("yyyyMMdd hhmm" ).parse("20170525 1000"));
            b3.setBodyContent("Gerda Hansen");
            b2.setLocation("Femøvej 2, Næstved");
        }
        catch (Exception e) {

        }

        dagens.add(b1);
        dagens.add(b2);
        dagens.add(b3);

        return dagens;
    }

    public void hentDatafraOutlook() {
        // Her henter vi data fra Outlook
        this.dummy();
    }
}
