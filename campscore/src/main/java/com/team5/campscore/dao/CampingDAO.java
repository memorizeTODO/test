package com.team5.campscore.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.team5.campscore.model.CampingDTO;

@Mapper
public interface CampingDAO {
	public int insertCamping(CampingDTO c); 
	public List<CampingDTO> getCampingListByRegion(@Param("start")int start,  @Param("region")String region,
												@Param("sort_type")String sortType, @Param("order")String order);
	public List<CampingDTO> getCampingListByPlaceName(@Param("start")int start, @Param("region")String region, @Param("sort_type")String sortType,@Param("order") String order, @Param("place_name")String placeName);
	public List<CampingDTO> getCampingList(@Param("start")int start, @Param("region")String region, @Param("sort_type")String sortType,@Param("order") String order, @Param("place_name")String placeName, @Param("place_category_detail")String category );
	
	
}
