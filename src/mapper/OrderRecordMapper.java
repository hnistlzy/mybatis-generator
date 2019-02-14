package mapper;

import pojo.OrderRecord;

public interface OrderRecordMapper {
    int insert(OrderRecord record);

    int insertSelective(OrderRecord record);
}