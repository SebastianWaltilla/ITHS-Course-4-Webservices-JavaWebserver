package se.iths.sjap.server;


public class RequestSwitch {

    public void Request(HTTPRequest httpRequest) {

        switch (httpRequest.getStartLineImplementation()) {
            case "GET":
                // GetResponse
                break;
            case "HEAD":
                // HEADResponse
                break;
            case "POST":
                // POSTResponce
                break;
            default:
                System.out.println(" finish ");
        }
    }
}
