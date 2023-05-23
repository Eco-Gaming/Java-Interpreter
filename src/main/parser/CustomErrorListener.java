package main.parser;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;
import java.util.List;

public class CustomErrorListener extends BaseErrorListener {
    private boolean hasErrors = false;
    private final List<String> errors = new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?,?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        hasErrors = true;
        errors.add("Syntax error at line " + line + ", position " + charPositionInLine + ": " + msg);
    }

    public boolean hasErrors() {
        return hasErrors;
    }

    public List<String> getErrors() {
        return errors;
    }
}
