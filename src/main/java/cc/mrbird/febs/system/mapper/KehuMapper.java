package cc.mrbird.febs.system.mapper;

import cc.mrbird.febs.system.entity.Kehu;
import cc.mrbird.febs.system.entity.KehuExample;
import cc.mrbird.febs.system.vo.resp.KehuResp;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 客户管理 Mapper
 *
 * @author lbx
 * @date 2020-05-16 19:44:24
 */
public interface KehuMapper extends BaseMapper<Kehu> {

    long countByExample(KehuExample example);

    int deleteByExample(KehuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Kehu record);

    int insertSelective(Kehu record);

    List<Kehu> selectByExample(KehuExample example);

    Kehu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Kehu record, @Param("example") KehuExample example);

    int updateByExample(@Param("record") Kehu record, @Param("example") KehuExample example);

    int updateByPrimaryKeySelective(Kehu record);

    int updateByPrimaryKey(Kehu record);
    
    IPage<KehuResp> selectDetailPage(Page<Kehu> page, @Param("kehu") KehuResp kehu);

    List<KehuResp> selectDetail(@Param("kehu") KehuResp kehu);

}
