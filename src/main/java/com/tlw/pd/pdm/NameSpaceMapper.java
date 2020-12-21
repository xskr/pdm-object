package com.tlw.pd.pdm;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

public class NameSpaceMapper extends NamespacePrefixMapper {
    private static final String O_PREFIX = "o"; // DEFAULT NAMESPACE
    private static final String O_URI = "object";

    private static final String C_PREFIX = "c";
    private static final String C_URI = "collection";

    private static final String A_PREFIX = "a";
    private static final String A_URI = "attribute";

    @Override
    public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {
        if(O_URI.equals(namespaceUri)) {
            return O_PREFIX;
        } else if(C_URI.equals(namespaceUri)) {
            return C_PREFIX;
        }else if(A_URI.equals(namespaceUri)){
            return A_PREFIX;
        }
        return suggestion;
    }

    @Override
    public String[] getPreDeclaredNamespaceUris() {
        return new String[] {O_URI, C_URI, A_URI};
    }
}
