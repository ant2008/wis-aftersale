package com.wenc.core.util;

import com.wenc.core.model.SearchConModel;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PageQueryHelper {

    /**
     * 根据类名，组建需要翻页查询的SQL语句
     *
     * @param aClassName
     * @param conModelMap
     * @return
     */
    public static String builderQuerySql(String aClassName, Map<String, SearchConModel> conModelMap) {

        String hqlStr = "";

        Iterator<Map.Entry<String, SearchConModel>> searchConModelIterator;
        SearchConModel searchConModel = null;

        int paramIndex = 0;

        String fromStr = "";

        try {

            if (aClassName == null || aClassName.trim().equals("")) {
                return "";
            }

            fromStr = " From " + aClassName;

            if (conModelMap == null || conModelMap.size() <= 0) {
                return hqlStr;
            }


            hqlStr = "";


            searchConModelIterator = conModelMap.entrySet().iterator();

//            遍历获取相应数据组成查询条件
            while (searchConModelIterator.hasNext()) {


                Map.Entry entry = searchConModelIterator.next();


                if (entry != null) {

                    //获取条件
                    searchConModel = (SearchConModel) entry.getValue();

                    //组装jsqpl
                    if (searchConModel.getColName() != null &&
                            !searchConModel.getColName().trim().equals("")) {
                        hqlStr = hqlStr + searchConModel.getColName() + " " + searchConModel.getOpat() + " " + "?" + (paramIndex + 1);
                    }

                    if (searchConModel.getRela() == null || searchConModel.getRela().trim().equals("")) {
                        hqlStr = hqlStr + " and ";

                    } else if (searchConModel.getRela().trim().equals("or")) {
                        hqlStr = "(" + hqlStr + ")" + " or ";

                    } else {
                        hqlStr = hqlStr + ' ' + searchConModel.getRela() + ' ';
                    }


                }


                paramIndex++;

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }


        //最后判断结尾是否有and 或者 or
        //如果有，则去掉。
        if (hqlStr.trim().lastIndexOf("and") > 0 || hqlStr.trim().lastIndexOf("or") > 0) {
            hqlStr = hqlStr.substring(0, hqlStr.length() - 4);
        }


        //组合
        hqlStr = fromStr + " " + "Where" + " " + hqlStr;

        return hqlStr;

    }


    /**
     * 根据类名以及查询条件，获取查询需要SQL语句。
     *
     * modify:补充关于左右括号的处理。
     * modify:加入默认的倒叙,倒叙字段一律默认为idx.
     * @param aClassName
     * @param searchConModels
     * @return
     */
    public static String builderQuerySql(String aClassName, List<SearchConModel> searchConModels) {

        String hqlStr = "";

        Iterator<Map.Entry<String, SearchConModel>> searchConModelIterator;
        SearchConModel searchConModel = null;

        int paramIndex = 0;

        String fromStr = "";

        try {

            if (aClassName == null || aClassName.trim().equals("")) {
                return "";
            }

            fromStr = " From " + aClassName;

            if (searchConModels == null || searchConModels.size() <= 0) {
                return fromStr;
            }


            hqlStr = "";


//            遍历获取相应数据组成查询条件


            paramIndex = 0;
            for (int i = 0; i < searchConModels.size(); i++) {


                paramIndex = i;

                //获取条件
                searchConModel = searchConModels.get(i);

                //组装jsqpl

                //先判断是否存在挎号
                if(searchConModel.getLeftBracket() != null &&
                    !searchConModel.getLeftBracket().trim().equals(""))
                {
                    hqlStr = hqlStr + searchConModel.getLeftBracket().trim()+" ";
                }


                if (searchConModel.getColName() != null &&
                        !searchConModel.getColName().trim().equals("")) {
                    hqlStr = hqlStr + searchConModel.getColName() + " " + searchConModel.getOpat() + " " + "?" + (paramIndex + 1) + " ";
                }


                //考虑右括号
                if(searchConModel.getRightBracket() != null &&
                        !searchConModel.getRightBracket().trim().equals(""))
                {
                    hqlStr = hqlStr + searchConModel.getRightBracket()+" ";
                }



                if (searchConModel.getRela() == null || searchConModel.getRela().trim().equals("")) {
                    hqlStr = hqlStr + " and ";

                } else if (searchConModel.getRela().trim().equals("or")) {
                    hqlStr = "(" + hqlStr + ")" + " or ";

                } else {
                    hqlStr = hqlStr + ' ' + searchConModel.getRela() + ' ';
                }




                paramIndex++;


            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }


        //最后判断结尾是否有and 或者 or
        //如果有，则去掉。

        if (hqlStr.trim().lastIndexOf("and") > 0 ) {
            hqlStr = hqlStr.trim().substring(0,hqlStr.trim().lastIndexOf("and"));
        }else if(hqlStr.trim().lastIndexOf("or") >0)
        {
            hqlStr = hqlStr.trim().substring(0,hqlStr.trim().lastIndexOf("or"));
        }


        //组合
        hqlStr = fromStr + " " + "Where" + " " + hqlStr;

        return hqlStr;

    }

    /**
     * 将Map类型参数转化为object array
     *
     * @param conModelMap
     * @return
     */
    public static Object[] builderQueryParams(Map<String, SearchConModel> conModelMap) {

        String hqlStr = "";

        Iterator<Map.Entry<String, SearchConModel>> searchConModelIterator;
        SearchConModel searchConModel = null;

        int paramIndex = 0;

        String fromStr = "";

        Object[] paramValues = null;

        try {


            if (conModelMap == null || conModelMap.size() <= 0) {
                return null;
            }


            searchConModelIterator = conModelMap.entrySet().iterator();

//            遍历获取相应数据组成查询条件


            paramValues = new Object[conModelMap.size()];

            while (searchConModelIterator.hasNext()) {


                Map.Entry entry = searchConModelIterator.next();


                if (entry != null) {

                    //获取条件
                    searchConModel = (SearchConModel) entry.getValue();
                    paramValues[paramIndex] = searchConModel.getColValue();

                }


                paramIndex++;

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }


        return paramValues;
    }


    /**
     * 组建查询参数数值
     *
     * @param searchConModels
     * @return
     */
    public static Object[] builderQueryParams(List<SearchConModel> searchConModels) {

        String hqlStr = "";

        SearchConModel searchConModel = null;

        int paramIndex = 0;

        String fromStr = "";

        Object[] paramValues = null;

        String tmpValue = "";

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {


            if (searchConModels == null || searchConModels.size() <= 0) {
                return null;
            }


//            遍历获取相应数据组成查询条件


            paramValues = new Object[searchConModels.size()];


            for (int i = 0; i < searchConModels.size(); i++) {

                searchConModel = searchConModels.get(i);

                if(searchConModel.getColType() != null && searchConModel.getColValue() != null)
                {
                      if(searchConModel.getColType().trim().equals("int"))
                      {
                          //防止字符类型为int,但是实际传入是double.
                          //此问题原因在于gson转化的问题，直接把字符串转成了double，再没好的解决方法前，先暂时处理。
                          tmpValue = String.valueOf(searchConModel.getColValue());

                          if(tmpValue.trim().lastIndexOf(".0")>0)
                          {
                              paramValues[i] = Double.valueOf(tmpValue).intValue();
                          }else {
                              paramValues[i] = Integer.valueOf(String.valueOf(searchConModel.getColValue()));
                          }
                      }else if(searchConModel.getColType().trim().equals("date"))
                      {

                          tmpValue = String.valueOf(searchConModel.getColValue());
                          paramValues[i] = dateFormat.parse(tmpValue);


                      }else if(searchConModel.getColType().trim().equals("timestamp"))
                      {
                          Long tmpTimestamp =  new BigDecimal(String.valueOf(searchConModel.getColValue())).longValue();

                          tmpValue = String.valueOf(new Date(tmpTimestamp));
                          paramValues[i] = new Date(tmpTimestamp);//dateFormat.parse(tmpValue);


                      }
                      else if(searchConModel.getColType().trim().equals("datetime"))
                      {
                          tmpValue = String.valueOf(searchConModel.getColValue());
                          paramValues[i] = dateTimeFormat.parse(tmpValue);
                      }else if(searchConModel.getColType().trim().equals("byte"))
                      {
                          tmpValue = String.valueOf(searchConModel.getColValue());

                          if(tmpValue.trim().lastIndexOf(".0")>0)
                          {
                              paramValues[i] =Byte.valueOf(
                                      String.valueOf(Double.valueOf(tmpValue).intValue()));
                          }else {
                              paramValues[i] = Byte.valueOf(String.valueOf(searchConModel.getColValue()));
                          }


                      }

                      else
                      {
                          paramValues[i] = searchConModel.getColValue();
                      }


                }else {

                    //获取条件
                    paramValues[i] = searchConModel.getColValue();
                }
            }


        } catch (Exception ex) {
            ex.printStackTrace();
        }


        return paramValues;
    }


    /**
     * 组建对应的查询页数的语句。
     *
     * @param aJpql
     * @param conModelMap
     * @return
     */
    public static String builderQueryCount(String aJpql, Map<String, SearchConModel> conModelMap) {
        String hqlStr = "";

        if (aJpql == null || aJpql.trim().equals("")) {
            return null;
        }

        hqlStr = " Select count(*) " + aJpql;


        return hqlStr;

    }


    /**
     * 获取相应需要的查询页数SQL
     *
     * @param aJpql
     * @param searchConModels
     * @return
     */
    public static String builderQueryCount(String aJpql, List<SearchConModel> searchConModels) {
        String hqlStr = "";

        if (aJpql == null || aJpql.trim().equals("")) {
            return null;
        }

        hqlStr = " Select count(*) " + aJpql;


        return hqlStr;

    }


    /**
     * 为sql语句加入倒叙功能。
     *
     * @param aHqlStr
     * @return
     */
    public static String buildPageQueryOrderClause(String aHqlStr)
    {
        String hqlStr = "";


        if(aHqlStr == null || aHqlStr.trim().equals(""))
        {
            return null;
        }

        hqlStr = aHqlStr;

        //加入默认的倒排序
        //如果已经有order by则使用默认
        if(aHqlStr.trim().toLowerCase().indexOf("order by") > 0 )
        {
            return  aHqlStr;
        }else
        {
            hqlStr = hqlStr.trim()+ " "+ "order by idx desc";
            return hqlStr;
        }

    }

}
