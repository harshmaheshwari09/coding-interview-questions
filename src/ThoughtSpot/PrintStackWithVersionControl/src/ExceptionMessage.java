package ThoughtSpot.PrintStackWithVersionControl.src;

import java.util.EmptyStackException;

public enum ExceptionMessage {
    INVALID_SNAPSHOT_VERSION("Snapshot version is invalid"),
    Empty_STACK("Invalid operation. Stack is empty");

    private String message;
    ExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
