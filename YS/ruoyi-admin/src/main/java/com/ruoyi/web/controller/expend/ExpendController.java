package com.ruoyi.web.controller.expend;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.domain.Expend;
import com.ruoyi.service.IExpendService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 【请填写功能名称】Controller
 *
 * @author ruoyi
 * @date 2020-04-29
 */
@Controller
@RequestMapping("/ruoyi/expend")
public class ExpendController extends BaseController
{
    private String prefix = "ruoyi/expend";

    @Autowired
    private IExpendService chargeService;

    @RequiresPermissions("ruoyi:expend:view")
    @GetMapping()
    public String charge()
    {
        return prefix + "/expend";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("ruoyi:expend:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Expend charge)
    {
        startPage();
        List<Expend> list = chargeService.selectChargeList(charge);
        return getDataTable(list);
    }
    /**
     * 查询【请填写功能名称】列表服务费非0
     */
    @RequiresPermissions("ruoyi:expend:list")
    @PostMapping("/listserve")
    @ResponseBody
    public TableDataInfo listserve(Expend charge)
    {
        //先查询所有项目服务费和标书费，再把总额用服务费和标书费加起来存进库中 然后再次查询库将再次查询的数据传入前端
        startPage();
        List<Expend> list = chargeService.selectChargeServe(charge);
        for(Expend c:list){
           Long mserve= c.getChMoneyServe();
           Long mbid=c.getChMoneyBid();
           Long count=mserve+mbid;
          c.setChCount(count);
          chargeService.updateCharge(c);
        }
        Expend cag=new Expend();
        List<Expend> Listserver=chargeService.selectChargeServe(cag);
        return getDataTable(Listserver);
    }

}
