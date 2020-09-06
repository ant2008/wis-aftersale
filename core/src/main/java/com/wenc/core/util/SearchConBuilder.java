package com.wenc.core.util;

import cn.hutool.core.util.StrUtil;
import com.google.gson.GsonBuilder;
import com.wenc.core.model.SearchConModel;
import org.springframework.data.jpa.repository.query.JpaQueryCreator;

import java.util.ArrayList;
import java.util.List;

public class SearchConBuilder {


    private static List<SearchConModel>  searchConModels;

    public SearchConBuilder(SearchConModel searchConModel) {
        this.searchConModel = searchConModel;
    }

    private  SearchConModel searchConModel;




    public static SearchConBuilder newInstance()
      {
              return new SearchConBuilder(new SearchConModel());
      }


      public  SearchConBuilder colName(String aColName)
      {
              if(searchConModel!=null)
              {
                  searchConModel.setColName(aColName);
              }

              return this;
      }


      public SearchConBuilder colValue(Object aColValue)
      {
            if(searchConModel != null)
            {
                 searchConModel.setColValue(aColValue);
            }

            return this;
      }


      public SearchConBuilder  operaSign(String aOpera)
      {
            if(searchConModel != null)
            {
                  searchConModel.setOpat(aOpera);
            }

            return this;
      }


      public SearchConBuilder relationShip(String aRela)
      {
             if(searchConModel != null)
             {
                  searchConModel.setRela(aRela);
             }

             return this;


      }


      public SearchConBuilder leftBracket(String aLeft)
      {
            if(searchConModel != null)
            {
                 searchConModel.setLeftBracket(aLeft);
            }

            return this;
      }


      public SearchConBuilder rightBracket(String aRight)
      {
            if(searchConModel != null)
            {
                 searchConModel.setRightBracket(aRight);
            }

            return this;
      }


      public SearchConBuilder colType(String aColType)
      {
          if(searchConModel != null)
          {
              searchConModel.setColType(aColType);
          }

          return this;
      }

      public  SearchConBuilder addToList()
      {
          if(searchConModels == null)
          {
               searchConModels = new ArrayList<>();
          }

          if(searchConModel != null)
          {
              searchConModels.add(searchConModel);
          }

          return this;
      }


      public static List<SearchConModel> buildSearchConList()
      {
           return searchConModels;
      }

      public  static void clearSearchConList()
      {
          if(searchConModels != null)
          {
               searchConModels = null;
          }
      }


      public SearchConModel buildSearchCon()
      {
              if(searchConModel != null)
              {
                    return searchConModel;
              }



              return null;
      }



}
