package com.longder.catering.entity.enumeration;

import com.longder.catering.entity.SysRole;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 角色枚举转换器
 */
public class RoleTypeHandler implements TypeHandler<SysRole> {

    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, SysRole sysRole, JdbcType jdbcType) throws SQLException {

    }

    @Override
    public SysRole getResult(ResultSet resultSet, String s) throws SQLException {
        return SysRole.getRole(resultSet.getString(s));
    }

    @Override
    public SysRole getResult(ResultSet resultSet, int i) throws SQLException {
        return null;
    }

    @Override
    public SysRole getResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }
}
