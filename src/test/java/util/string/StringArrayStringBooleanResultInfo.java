package util.string;

class StringArrayStringBooleanResultInfo {
    String [] texts;
    String delim;
    Boolean removeEmpties;
    String expected;

    public StringArrayStringBooleanResultInfo(String[] texts, String delim, Boolean removeEmpties, String expected)
    {
        this.texts = texts;
        this.delim = delim;
        this.removeEmpties = removeEmpties;
        this.expected = expected;
    }
}
