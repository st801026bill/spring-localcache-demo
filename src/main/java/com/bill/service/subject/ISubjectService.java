package com.bill.service.subject;

import com.bill.service.observe.IObserveService;

public interface ISubjectService {
    public void register(IObserveService service);
    public void updateAllCache();
}
