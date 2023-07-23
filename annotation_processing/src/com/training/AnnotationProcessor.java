package com.training;

import com.training.stereotypes.Id;
import com.training.stereotypes.Table;

import java.lang.reflect.Field;

public class AnnotationProcessor {


    public static void main(String[] args) {

        Class<?> bookClass = new Book().getClass();

        Table anno = bookClass.getAnnotation(Table.class);

       String tableName =anno.tableName();

        try {
            Field fld = bookClass.getDeclaredField("bookNumber");
                  Id idFld =fld.getAnnotation(Id.class);
              String primKeyCol=idFld.columName();

             StringBuffer buffer =  new StringBuffer("select * from ")
            		                    .append(tableName)
            		                    .append(" where ")
            		                    .append(primKeyCol)
            		                    .append("=?");

            String sql =buffer.toString();
            System.out.println(sql);

        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }


    }
}
