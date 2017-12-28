package cn.gcu.dao.impl;

import java.util.List;

import cn.gcu.dao.ApplyDao;
import cn.gcu.entity.ApplyEntity;

public class ApplyDaoImpl extends BaseDaoImpl<ApplyEntity,String> implements ApplyDao{

	@Override
	public List<ApplyEntity> getApplyByUserId(String userId) {
		return (List<ApplyEntity>)this.getHibernateTemplate().find("from ApplyEntity where user.id = ?", userId);
	}

}
