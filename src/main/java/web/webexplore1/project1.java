package web.webexplore1;

import lombok.Data;

@Data
public class project1 {

    private String fathername;
    private String mothername;

    public project1(String fathername, String mothername) {
        this.fathername = fathername;
        this.mothername = mothername;
    }

}




