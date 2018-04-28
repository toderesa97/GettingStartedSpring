package main.errorHandler;

public class Response {

    private int errorCode;
    private String description;

    public Response(int errorCode, String errorDescription) {
        this.errorCode = errorCode;
        this.description = errorDescription;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorDescription() {
        return description;
    }

    public void setErrorDescription(String errorDescription) {
        this.description = errorDescription;
    }
}
