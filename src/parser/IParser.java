package parser;

public interface IParser {
    void parseData(String value) throws Exception;

    String getResult();
}
