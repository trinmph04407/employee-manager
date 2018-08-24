package vn.poly.sof305.group1.statics.repositories.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import vn.poly.sof305.group1.common.bases.BaseRepository;
import vn.poly.sof305.group1.statics.repositories.StaticRepository;

@Repository
public class StaticRepositoryImpl extends BaseRepository implements StaticRepository{


	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> listStatics() {
		List<Object[]> list = this.getCurrentSession().createQuery("SELECT r.employee.code, r.employee.nameStaff,r.employee.photo," 
				+ " SUM(case when r.type=1 then 1 else 0 end), "
				+ " SUM(case when r.type=0 then 1 else 0 end) " + " FROM Record r " + " GROUP BY r.employee.code").list();
		
		return list;
	}
	

	}
