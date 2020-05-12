package com.ruoyi.service.impl;

import java.util.List;

import com.ruoyi.domain.BuiltShow;
import com.ruoyi.mapper.BuiltShowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.service.IBuiltShowService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2020-04-28
 */
@Service
public class BuiltShowServiceImpl implements IBuiltShowService
{
    @Autowired
    private BuiltShowMapper builtShowMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param bId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public BuiltShow selectBuiltShowById(Long bId)
    {
        return builtShowMapper.selectBuiltShowById(bId);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param builtShow 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BuiltShow> selectBuiltShowList(BuiltShow builtShow)
    {
        return builtShowMapper.selectBuiltShowList(builtShow);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param builtShow 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBuiltShow(BuiltShow builtShow)
    {
        return builtShowMapper.insertBuiltShow(builtShow);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param builtShow 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBuiltShow(BuiltShow builtShow)
    {
        return builtShowMapper.updateBuiltShow(builtShow);
    }

    /**
     * 删除【请填写功能名称】对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBuiltShowByIds(String ids)
    {
        return builtShowMapper.deleteBuiltShowByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param bId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteBuiltShowById(Long bId)
    {
        return builtShowMapper.deleteBuiltShowById(bId);
    }
}
