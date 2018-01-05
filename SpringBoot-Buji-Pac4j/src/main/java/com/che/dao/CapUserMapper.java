package com.che.dao;

import com.che.pojo.po.CapUser;
import com.che.pojo.po.CapUserExample;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface CapUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CAP_USER
     *
     * @mbg.generated
     */
    long countByExample(CapUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CAP_USER
     *
     * @mbg.generated
     */
    @Delete({
        "delete from CAP_USER",
        "where OPERATOR_ID = #{operatorId,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(BigDecimal operatorId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CAP_USER
     *
     * @mbg.generated
     */
    @Insert({
        "insert into CAP_USER (OPERATOR_ID, USER_ID, ",
        "PASSWORD, INVALDATE, ",
        "USER_NAME, AUTHMODE, ",
        "STATUS, UNLOCKTIME, ",
        "MENUTYPE, LASTLOGIN, ",
        "ERRCOUNT, STARTDATE, ",
        "ENDDATE, VALIDTIME, ",
        "MACCODE, IPADDRESS, ",
        "EMAIL, CREATEUSER, ",
        "CREATETIME)",
        "values (#{operatorId,jdbcType=DECIMAL}, #{userId,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{invaldate,jdbcType=DATE}, ",
        "#{userName,jdbcType=VARCHAR}, #{authmode,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=VARCHAR}, #{unlocktime,jdbcType=DATE}, ",
        "#{menutype,jdbcType=VARCHAR}, #{lastlogin,jdbcType=DATE}, ",
        "#{errcount,jdbcType=DECIMAL}, #{startdate,jdbcType=DATE}, ",
        "#{enddate,jdbcType=DATE}, #{validtime,jdbcType=VARCHAR}, ",
        "#{maccode,jdbcType=VARCHAR}, #{ipaddress,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{createuser,jdbcType=VARCHAR}, ",
        "#{createtime,jdbcType=DATE})"
    })
    int insert(CapUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CAP_USER
     *
     * @mbg.generated
     */
    int insertSelective(CapUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CAP_USER
     *
     * @mbg.generated
     */
    List<CapUser> selectByExample(CapUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CAP_USER
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "OPERATOR_ID, USER_ID, PASSWORD, INVALDATE, USER_NAME, AUTHMODE, STATUS, UNLOCKTIME, ",
        "MENUTYPE, LASTLOGIN, ERRCOUNT, STARTDATE, ENDDATE, VALIDTIME, MACCODE, IPADDRESS, ",
        "EMAIL, CREATEUSER, CREATETIME",
        "from CAP_USER",
        "where OPERATOR_ID = #{operatorId,jdbcType=DECIMAL}"
    })
    @ResultMap("com.che.dao.CapUserMapper.BaseResultMap")
    CapUser selectByPrimaryKey(BigDecimal operatorId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CAP_USER
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CapUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CAP_USER
     *
     * @mbg.generated
     */
    @Update({
        "update CAP_USER",
        "set USER_ID = #{userId,jdbcType=VARCHAR},",
          "PASSWORD = #{password,jdbcType=VARCHAR},",
          "INVALDATE = #{invaldate,jdbcType=DATE},",
          "USER_NAME = #{userName,jdbcType=VARCHAR},",
          "AUTHMODE = #{authmode,jdbcType=VARCHAR},",
          "STATUS = #{status,jdbcType=VARCHAR},",
          "UNLOCKTIME = #{unlocktime,jdbcType=DATE},",
          "MENUTYPE = #{menutype,jdbcType=VARCHAR},",
          "LASTLOGIN = #{lastlogin,jdbcType=DATE},",
          "ERRCOUNT = #{errcount,jdbcType=DECIMAL},",
          "STARTDATE = #{startdate,jdbcType=DATE},",
          "ENDDATE = #{enddate,jdbcType=DATE},",
          "VALIDTIME = #{validtime,jdbcType=VARCHAR},",
          "MACCODE = #{maccode,jdbcType=VARCHAR},",
          "IPADDRESS = #{ipaddress,jdbcType=VARCHAR},",
          "EMAIL = #{email,jdbcType=VARCHAR},",
          "CREATEUSER = #{createuser,jdbcType=VARCHAR},",
          "CREATETIME = #{createtime,jdbcType=DATE}",
        "where OPERATOR_ID = #{operatorId,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(CapUser record);
    
    Set<String> selectRoleByUserId(@Param("userId") String userId);
}