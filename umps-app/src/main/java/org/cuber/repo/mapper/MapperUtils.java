package org.cuber.repo.mapper;

import io.ebean.ExpressionList;
import org.cuber.bo.PageRecords;
import org.cuber.bo.PageReq;
import org.cuber.bo.PageResult;

import java.util.Objects;

public class MapperUtils {

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
}
