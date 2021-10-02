package org.fkit.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.User;
import org.springframework.stereotype.Repository;

/**
 * UserMapper接口
 */
@Repository
public interface UserMapper {

	/**
	 * 根据登录名和密码查询用户
	 * 
	 * @param String loginname
	 * @param String password
	 * @return 找到返回User对象，没有找到返回null
	 */
	@Select("select * from tb_user where loginname = #{loginname} and password = #{password}")
	User findWithLoginnameAndPassword(@Param("loginname") String loginname, @Param("password") String password);

	/**
	 * 根据用户名修改该用户密码
	 * 
	 * @param String loginname
	 * @param String password
	 * @param String newPassword
	 * @return 找到返回User对象，没有找到返回null
	 */

	@Select("UPDATE tb_user SET password=#{newPassword} where loginname = #{loginname} and password = #{password} ")
	User setPasswordWithLoginname(@Param("loginname") String loginname, @Param("password") String Password,
			@Param("newPassword") String newPassword);

}
