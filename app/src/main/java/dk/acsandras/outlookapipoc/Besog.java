package dk.acsandras.outlookapipoc;

import java.util.Date;
import java.util.List;

public class Besog {

    private Date startDateTime;
    private Date endDateTime;
    private String location;
    private String bodyContent; //Opgaver, klientNavn
    private List opgaveliste; // Findes ikke i Outlook
    private List klientnavn; // Findes ikke i Outlook

    public List convertBodyContent2Opgaver(String bodyContent) {
        // Opgaver hos Gerda
        // Vask
        // Opvask
        return opgaveliste;
    }

    public String convertOpgaveliste2BodyContent(List opgaveliste) {
        return bodyContent;
    }

    public Date getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    public Date getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBodyContent() {
        return bodyContent;
    }

    public void setBodyContent(String bodyContent) {
        this.bodyContent = bodyContent;
    }

}
