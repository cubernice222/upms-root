package org.cuber.bo;

import java.util.List;

public class PageRecords<T> {

    protected PageResult pageResult;

    protected List<T> records;

    public PageResult getPageResult() {
        return pageResult;
    }

    public void setPageResult(PageResult pageResult) {
        this.pageResult = pageResult;
    }

    public List<T> getRecords() {
        return records;
    }

    public void setRecords(List<T> records) {
        this.records = records;
    }
}
