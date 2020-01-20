package clean.exceptions;

import org.omg.CORBA.DynAnyPackage.Invalid;

public class InvalidInformationEnteredException extends Exception {

    public InvalidInformationEnteredException(String message) {
        super(message);
    }
}
