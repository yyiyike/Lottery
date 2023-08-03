package cn.itedus.lottery.rpc;

import cn.itedus.lottery.rpc.req.ActivityReq;
import cn.itedus.lottery.rpc.res.ActivityRes;

public interface IActivityBooth {
    ActivityRes queryActivityById(ActivityReq req);
}
