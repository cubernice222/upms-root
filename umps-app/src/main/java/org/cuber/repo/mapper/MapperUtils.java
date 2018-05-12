package org.cuber.repo.mapper;

import io.ebean.EbeanServer;
import io.ebean.ExpressionList;
import org.apache.commons.lang3.StringUtils;
import org.cuber.bo.PageRecords;
import org.cuber.bo.PageReq;
import org.cuber.bo.PageResult;
import org.cuber.util.AnnoUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.Id;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;

public class MapperUtils {
    private static Logger logger = LoggerFactory.getLogger(MapperUtils.class);
    public static  <T> PageRecords<T> findList(ExpressionList<T> expressionList, PageReq pageReq){
        PageRecords<T> records = new PageRecords<>();
        if(Objects.nonNull(pageReq)){
            PageResult pageResult = new PageResult();
            int page = pageReq.getPageNumber();
            pageResult.setPageNumber(page);
            int size = pageReq.getPageSize();
            pageResult.setPageSize(size);
            int total = expressionList.findCount();
            pageResult.setTotal(total);
            if(total >  0){
                expressionList.setFirstRow((page - 1) * size);
                expressionList.setMaxRows(size);
                records.setRecords(expressionList.findList());
            }
            records.setPageResult(pageResult);
        }else{
            records.setRecords(expressionList.findList());
        }
        return records;
    }
    public static <T> void update(T t, EbeanServer ebeanServer){
        Object obj = AnnoUtils.findFieldValueWithAnno(t, Id.class);
        Class<T> tCls = (Class<T>) t.getClass();
        T databaseT = ebeanServer.find(tCls,obj);
        T update = completeUpdateObj(t,databaseT);
        ebeanServer.update(update);
    }

    public static <T> T completeUpdateObj(T update, T database){
        List<Field> fields = AnnoUtils.fetchAllFiled(update.getClass());
        if(Objects.nonNull(fields)){
            fields.forEach(field -> {
                try{
                    field.setAccessible(true);
                    Object updateValue = field.get(update);
                    Object databaseValue = field.get(database);
                    if(Objects.nonNull(updateValue)){
                        if(!updateValue.equals(databaseValue)){
                            if(updateValue instanceof String){
                                if(StringUtils.isEmpty((String)updateValue)){
                                    field.set(update,databaseValue);
                                }
                            }
                        }
                    }else{
                        field.set(update,databaseValue);
                    }
                }catch (Exception e){
                    logger.error("出错了",e);
                }

            });
        }
        return update;
    }

    public static void main(String[] args) {
        System.out.println(StringUtils.isEmpty("  "));
    }
}
