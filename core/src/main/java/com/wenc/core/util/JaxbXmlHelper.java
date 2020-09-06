package com.wenc.core.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class JaxbXmlHelper {

    /**
     * 将对象转化为XML格式。
     *
     * @param obj
     * @param load
     * @return
     * @throws Exception
     */
    public static String beanToXml(Object obj,Class<?> load) throws Exception
    {
        try{

            JAXBContext context = JAXBContext.newInstance(load);
            Marshaller marshaller = context.createMarshaller();
           // marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.setProperty(Marshaller.JAXB_ENCODING, "GBK");
            StringWriter writer = new StringWriter();
            marshaller.marshal(obj,writer);
            return writer.toString();


        }catch (Exception ex)
        {
            throw new Exception(ex.getMessage());
        }
    }


    /**
     * 输出格式化的XML字符串格式。
     *
     * @param obj
     * @param load
     * @return
     * @throws Exception
     */
    public static String beanToXmlFormat(Object obj,Class<?> load) throws Exception
    {
        try{

            JAXBContext context = JAXBContext.newInstance(load);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.setProperty(Marshaller.JAXB_ENCODING, "GBK");
            StringWriter writer = new StringWriter();
            marshaller.marshal(obj,writer);
            return writer.toString();


        }catch (Exception ex)
        {
            throw new Exception(ex.getMessage());
        }
    }

    /**
     * 从xml转化为对象。
     * @param xmlPath
     * @param load
     * @return
     * @throws JAXBException
     * @throws IOException
     */
    public static Object xmlToBean(String xmlPath,Class<?> load) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(load);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Object object = unmarshaller.unmarshal(new File(xmlPath));
        return object;
    }


    /**
     * 输入xml字符，转化为对象。
     *
     * @param load
     * @param xmlStr
     * @return
     * @throws JAXBException
     * @throws IOException
     */
    public static Object xmlToBean(Class<?> load,String xmlStr) throws JAXBException, IOException {

       try {
           JAXBContext context = JAXBContext.newInstance(load);
           Unmarshaller unmarshaller = context.createUnmarshaller();
           Object object = unmarshaller.unmarshal(new StringReader(xmlStr));
           return object;
       }catch (JAXBException ex)
       {
           throw new JAXBException(ex.getMessage());
       }
    }




}
