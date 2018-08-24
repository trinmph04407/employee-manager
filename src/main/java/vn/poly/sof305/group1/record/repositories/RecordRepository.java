package vn.poly.sof305.group1.record.repositories;

import java.util.List;

import vn.poly.sof305.group1.common.entities.Record;

public interface RecordRepository {

	boolean create(Record record);

	boolean update(Record record);

	Record select(Long id);

	boolean remove(Long id);
	
	List<Record> select(Long idStaff, boolean type, int offset, int limit);
	
	Long count(Long idStaff, boolean type);
	

}
