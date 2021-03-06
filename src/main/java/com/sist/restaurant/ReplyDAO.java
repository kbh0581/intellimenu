package com.sist.restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sist.vo.RestaurantReplyVO;

import java.util.*;

import javax.servlet.http.HttpSession;
@Repository
public class ReplyDAO {
	
	@Autowired
    private ResreplyMapper resreplyMapper;

	// 댓글 목록
	public List<RestaurantReplyVO> list(int restaurant_id, int start, int end, HttpSession session) {
        return resreplyMapper.list(restaurant_id);
    }

    // 댓글 입력
	public void insert(RestaurantReplyVO vo) {
		 resreplyMapper.insert(vo);
	}
	
	//댓글 신고
	public void report(int id){
		resreplyMapper.report(id);
	}
	
	//총레코드 조회
	public int totalRecord(int restaurant_id){
		return resreplyMapper.totalRecord(restaurant_id);
	}
	
	//총 페이지 조회
	public int totalPage(int restaurant_id){
		return resreplyMapper.totalPage(restaurant_id);
	}
}
