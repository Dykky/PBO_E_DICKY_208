public class StokTidakCukupException extends Exception {
    StokTidakCukupException(String message) {
        super(message);
    }

    StokTidakCukupException (String massage, Throwable cause){
        super(massage, cause);
    }
}
