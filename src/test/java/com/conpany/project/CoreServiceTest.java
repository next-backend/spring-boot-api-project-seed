package com.conpany.project;

import com.company.project.Application;
import com.company.project.biz.config.Yn;
import com.company.project.biz.impl.AccountCoreImpl;
import com.company.project.model.ThCoinItem;
import com.company.project.service.ThCoinAccountService;
import com.company.project.service.ThCoinItemService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class CoreServiceTest {

//    @Mock
//    private ThCoinAccountService thCoinAccountService;
//    @Mock
//    private ThCoinItemService thCoinItemService;
//
//    @InjectMocks
    @Autowired
    private AccountCoreImpl accountCore;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void balancePlus() throws ParseException, InterruptedException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date start = sdf.parse("2017-11-30 00:00:00") ;
        Date end = sdf.parse("2018-11-30 23:59:59") ;
        ThCoinItem item = new ThCoinItem() ;
        item.setAmount(100L);
        item.setTs(new Date());
        item.setStartTime(start);
        item.setEndTime(end);
        item.setType(80);
        item.setBrandOwner(2050L);
        item.setSamePeriodId(0L);
        item.setYn(Yn.Yes.getCode());
        TaskUtil.runTask(5, new TaskRunner() {
            @Override
            protected void call() {
                accountCore.balancePlus(item);
            }
        });
    }

}
