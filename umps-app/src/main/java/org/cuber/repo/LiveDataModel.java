package org.cuber.repo;

import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import java.time.LocalDateTime;

@MappedSuperclass
public class LiveDataModel extends BaseModel{


    protected LocalDateTime completeTime;

    @Transient
    protected LocalDateTime startCreateTime;

    @Transient
    protected LocalDateTime endCreateTime;

    public LocalDateTime getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(LocalDateTime completeTime) {
        this.completeTime = completeTime;
    }

    public LocalDateTime getStartCreateTime() {
        return startCreateTime;
    }

    public void setStartCreateTime(LocalDateTime startCreateTime) {
        this.startCreateTime = startCreateTime;
    }

    public LocalDateTime getEndCreateTime() {
        return endCreateTime;
    }

    public void setEndCreateTime(LocalDateTime endCreateTime) {
        this.endCreateTime = endCreateTime;
    }
}
