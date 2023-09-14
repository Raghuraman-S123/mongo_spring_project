package dev.Frow.Frow.Models;

public class AuthenticationResponse {

    private String response;

    public AuthenticationResponse(String response) {
        this.response = response;
    }

    public AuthenticationResponse() {
    }

    public String getResponse() {
        return this.response;
    }

    public void setResponse(String response) {
        this.response = response;
    }


}
