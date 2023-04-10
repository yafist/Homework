import java.net.SocketException;
import java.nio.file.AccessDeniedException;
import java.rmi.server.ExportException;
public class NumbersExceptions {
    public NumbersExceptions() {
    }
    public static void raiseExceptoin(Integer ExceptionNumber) throws SocketException,
            ClassNotFoundException, AccessDeniedException, ExportException {
        switch (ExceptionNumber) {
            case 1:
                throw new SocketException();
            case 2:
                throw new ClassNotFoundException();
            case 3:
                throw new AccessDeniedException("txt");
            case 4:
                throw new ExportException("txt");
            default:
                System.out.println("неверное число!");
        }
    }
    public String raiseException(Integer s) {
        try {
            try {
                try {
                    try {
                        raiseExceptoin(s);
                    } catch (SocketException l) {
                        System.err.println("Error: " + l);
                    }
                } catch (ClassNotFoundException r) {
                    System.err.println("Error: " + r);
                }
            } catch (AccessDeniedException f) {
                System.err.println("Error: " + f);
            }
        } catch (ExportException e) {
            System.err.println("Error: " + e);
        }
        return "неверное число!";
    }
}