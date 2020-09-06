package com.wenc.core.util;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.util.regex.Pattern;

/**
 * Created by liwc on 2017/1/23.
 */
public class CDataXMLStreamWriter extends DelegatingXMLStreamWriter {
    private static final Pattern XML_CHARS = Pattern.compile( "[&<>]" );

    public CDataXMLStreamWriter(XMLStreamWriter writer) {
        super(writer);
    }

    @Override
    public void writeCharacters( String text ) throws XMLStreamException
    {
        boolean useCData = XML_CHARS.matcher( text ).find();
        if( useCData )
        {
            //加个处理有需要CDATA,把前后的<>去掉
            String tmpText = text.trim().substring(1,text.trim().length() - 1);
            super.writeCData( tmpText );
        }
        else
        {
            super.writeCharacters( text );
        }
    }
}
